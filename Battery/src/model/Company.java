package model;

import java.util.ArrayList;

public class Company{
	
    public static final int MAX_BATTERIES = 10;
	private Battery[] batteries;


	public Company() {
        this.batteries = new Battery[MAX_BATTERIES];
	}

    public Company(Battery[] batteries){
        this.batteries = batteries;
    }


    public int findBattery(String name){
		boolean flagBattery= false;
		int indexBattery=-1;
		for(int i=0; i< MAX_BATTERIES && !flagBattery; i++){
			if(batteries[i] instanceof Battery){
				if(batteries[i]!=null && batteries[i].getName().equals(name)){
					flagBattery=true;
					indexBattery = i;
				}
			}
		}
		return indexBattery;
	}


    public void registerBattery(String name, double cost, double capacity, double voltage){
        int emtyPos = getEmtyPosition();
    
        batteries[emtyPos] = new Battery(name, cost,capacity,voltage);

    }

    public void registerRechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type) {
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new RechargeableBattery(name, voltage, cost, capacity, chargerNumber ,type);
        
    }
    
    private int getEmtyPosition() {
        int pos = -1;
        for (int i = 0; i < MAX_BATTERIES && pos == -1; i++) {
            if (batteries[i] == null) {
                pos = i;
            }
        }
        return pos;
    }

    public String showTotalBatteries() {
    	int rechargeable=0;
        int noRechargeable = 0;
        for (int i = 0; i < MAX_BATTERIES; i++) {
            if (batteries[i]!=null && batteries[i] instanceof RechargeableBattery) {
                rechargeable++;
            }else if (batteries[i]!=null){
                noRechargeable++;
            }
        }
        return "The total of:\n"+"*Traditional batteries: "+noRechargeable+"\n"+"*Rechargeable batteries:"+rechargeable;
    }
    
    public String showBatteriesInfo() {
    	String str = "";
        for (int i = 0; i < MAX_BATTERIES; i++) {
            if (batteries[i]!=null) {
                str+=batteries[i].toString();
            }
        }
    	return str;
    }
    

	
	public double calculateUsefulPromLifeCost(){
        int index=0;
        double amount;
        double costRechargeableBatteries=0;
        for (int i = 0; i < MAX_BATTERIES; i++) {
            if (batteries[i]!=null && batteries[i] instanceof RechargeableBattery) {
                costRechargeableBatteries+=((RechargeableBattery)batteries[i]).calculateUsefulLifeCost();
                index++;
            }
        }
        amount=(costRechargeableBatteries/index);
		return amount;
	}

}
