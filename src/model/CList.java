package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CList {
	
	private ArrayList<Country> countries;
	
	public CList(){		
		countries = new ArrayList<>();		
	}	
	public void addCountry(Country c) {
		countries.add(c);
	}

	
	public void sortByMedalsF() {
		Collections.sort(countries);
	}
	
	public void print1() {
		for(Country c : countries) {
			System.out.println(c.getName() +" "+ c.getGoldMedalM() +" "+ c.getSilverMedalM() +" "+ c.getBronzeMedalM());
		}
	}
	public void print2() {
		for(Country c : countries) {
			System.out.println(c.getName() +" "+ c.getGoldMedalF() +" "+c.getSilverMedalF() + " "+ c.getBronzeMedalF());
		}
	}
	public void print3() {
		for(Country c : countries) {
			System.out.println(c.getName() +" "+ c.getGold() +" "+c.getSilver() + " "+ c.getBronze());
		}
	}
	public void sortByMedalsC() {
		int goldA=0;
		int goldB=0;
		int silverA=0;
		int silverB=0;
		int bronzeA=0;
		int bronzeB=0;
		int x=0;
		for(int i = 0; i<countries.size()-1;i++) {
			for (int j=0; j<countries.size()-1; j++) {
				goldA = countries.get(j).getGoldMedalF()+countries.get(j).getGoldMedalM();
				goldB = countries.get(j+1).getGoldMedalF()+countries.get(j+1).getGoldMedalM();
				if(goldA == goldB ) {
					silverA = countries.get(j).getSilverMedalF()+countries.get(j).getSilverMedalM();
					silverB = countries.get(j+1).getSilverMedalF()+countries.get(j+1).getSilverMedalM();
					if(silverA == silverB) {
						bronzeA = countries.get(j).getBronzeMedalF()+countries.get(j).getBronzeMedalM();
						bronzeB = countries.get(j+1).getBronzeMedalF()+countries.get(j+1).getBronzeMedalM();
						if(bronzeA == bronzeB) {
							x = countries.get(j).getName().compareTo(countries.get(j).getName());
							if(x==-1) {
								Collections.swap(countries, j, j+1);
							}
						}else {
							if (bronzeA<bronzeB) {
								Collections.swap(countries, j, j+1);
							}
						}						
						}else {
							if(silverA<silverB) {
								Collections.swap(countries, j, j+1);
							}
						}
					}else {
						if(goldA<goldB) {
							Collections.swap(countries, j, j+1);
						}
					}
					
				}
				}
		
	}
	public void sortByMedalsM() {
		Collections.sort(countries, new Comparator<Country>(){

			@Override
			public int compare(Country c1, Country c2) {
				if(c1.getGoldMedalM()-c2.getGoldMedalM() == 0) {
					if (c1.getSilverMedalM()-c2.getSilverMedalM() == 0) {
						if (c1.getBronzeMedalM()-c2.getBronzeMedalM() == 0) {
							return c1.getName().compareTo(c2.getName());
						} else {
							return (c1.getBronzeMedalM()-c2.getBronzeMedalM())*(-1);
						}
					} else {
						return (c1.getSilverMedalM()-c2.getSilverMedalM())*(-1);
					}
				} else { 
					return (c1.getGoldMedalM()-c2.getGoldMedalM())*(-1);
				}				
			};			
		});
	}
}
