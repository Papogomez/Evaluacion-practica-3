package model;

public class RechargeableBattery extends Battery implements Rechargeable{

    private int chargerNumber;
    private char type;

    public final static char BATTERY_LITIO='l';
    public final static char BATTERY_NIQUEL_CADIO='n';
    public final static double FACTOR_LITIO=0.92;
    public final static double FACTOR_NIQUEL_CADIO=0.80;


    public RechargeableBattery(String name, double cost, double capacity, double voltage,int chargerNumber, char type) {
        super( name, cost, capacity, voltage);
        this.chargerNumber = chargerNumber;
        this.type = type;
    }


    /**
     * @return int return the chargerNumber
     */
    public int getChargerNumber() {
        return chargerNumber;
    }

    /**
     * @param chargerNumber the chargerNumber to set
     */
    public void setChargerNumber(int chargerNumber) {
        this.chargerNumber = chargerNumber;
    }

    /**
     * @return char return the type
     */
    public char getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(char type) {
        this.type = type;
    }

    public double calculateUsefulLifeCost(){
        double total = 0;
        
        
        return total;
    }

}