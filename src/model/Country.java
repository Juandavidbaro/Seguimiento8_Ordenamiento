package model;

public class Country implements Comparable<Country> {

	
	private String name;
	private int goldMedalM;
	private int silverMedalM;
	private int bronzeMedalM;
	private int goldMedalF;
	private int silverMedalF;
	private int bronzeMedalF;
	private int gold;
	private int silver;
	private int bronze;
	
	
	public Country(String name, int goldMedalM,int silverMedalM,int bronzeMedalM,int goldMedalF,int silverMedalF,int bronzeMedalF){
		
		this.name=name;
		this.goldMedalM=goldMedalM;
		this.silverMedalM=silverMedalM;
		this.bronzeMedalM=bronzeMedalM;
		this.goldMedalF=goldMedalF;
		this.silverMedalF=silverMedalF;
		this.bronzeMedalF=bronzeMedalF;
		gold = goldMedalM + goldMedalF;
		silver = silverMedalM + silverMedalF;
		bronze = bronzeMedalM + bronzeMedalF;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoldMedalM() {
		return goldMedalM;
	}

	public void setGoldMedalM(int goldMedalM) {
		this.goldMedalM = goldMedalM;
	}

	public int getSilverMedalM() {
		return silverMedalM;
	}

	public void setSilverMedalM(int silverMedalM) {
		this.silverMedalM = silverMedalM;
	}

	public int getBronzeMedalM() {
		return bronzeMedalM;
	}

	public void setBronzeMedalM(int bronzeMedalM) {
		this.bronzeMedalM = bronzeMedalM;
	}

	public int getGoldMedalF() {
		return goldMedalF;
	}

	public void setGoldMedalF(int goldMedalF) {
		this.goldMedalF = goldMedalF;
	}

	public int getSilverMedalF() {
		return silverMedalF;
	}

	public void setSilverMedalF(int silverMedalF) {
		this.silverMedalF = silverMedalF;
	}

	public int getBronzeMedalF() {
		return bronzeMedalF;
	}

	public void setBronzeMedalF(int bronzeMedalF) {
		this.bronzeMedalF = bronzeMedalF;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int getBronze() {
		return bronze;
	}

	public void setBronze(int bronze) {
		this.bronze = bronze;
	}
	
	@Override
	public int compareTo(Country c) {
		// TODO Auto-generated method stub
		if (this.goldMedalF == c.getGoldMedalF()) {
			if (this.silverMedalF == c.getSilverMedalF()) {
				if (this.bronzeMedalF == c.getBronzeMedalF()) {
					return name.compareTo(c.getName());
				} else {
					if (this.bronzeMedalF > c.getBronzeMedalF()) {
						return 1;
					} else {
						return -1;
					}
				}
			} else {
				if (this.silverMedalF > c.getSilverMedalF()) {
					return 1;
				} else {
					return -1;
				}
			}
		} else {
			if (this.goldMedalF > c.getGoldMedalF()) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	

}
