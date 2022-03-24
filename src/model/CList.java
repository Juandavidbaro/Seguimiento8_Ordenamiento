package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CList {
	
	private List<Country> countries;
	
	public CList(){		
		countries = new ArrayList<>();		
	}
	
	public List<Country> getCountry(){
		return countries;
	}
	
	public void addCountry(Country country) {
		countries.add(country);
	}
	
	public void sortComparatorClass() {

		Collections.sort(countries, new CComparator());		
	}
	
	public void sortCollectionsNaturalOrder() {
		Collections.sort(countries);
	}
	
	
	
	public void bubbleSort() {
		int n = countries.size();
		boolean flag = true;
		
		for (int i = 0; i < n && flag; i++) {
			flag = false;
	    	for (int j = 1; j < n - i; j++) {
	    		int result=countries.get(j).compareByOro(countries.get(j-1));
	    		if (result > 0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			flag = true;
	    		}
	    		if(result==0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			flag = true;
	    			result=countries.get(j).compareByPlata(countries.get(j-1));
	    		}
	    		
	    		if(result==0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			flag = true;
	    			result=countries.get(j).compareByBronce(countries.get(j-1));
	    		}
	    		
	    		if(result==0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			flag = true;
	    			result=countries.get(j).compareByName(countries.get(j-1));
	    		}
	    	}
	    }
	}

}
