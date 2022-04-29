package model;

public class Battery{
    private String name;
    private double cost;
    private double capacity;
    private double voltage;


    public Battery(String name, double cost, double capacity, double voltage) {
        this.name = name;
        this.cost = cost;
        this.capacity = capacity;
        this.voltage = voltage;
    }



    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return double return the capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
     * @return double return the voltage
     */
    public double getVoltage() {
        return voltage;
    }

    /**
     * @param voltage the voltage to set
     */
    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String toString(){
        return "\nNon-rechargeable battery\n"+"Name: "+name+"\nLifetime cost: 0"+"\n";
    }
}