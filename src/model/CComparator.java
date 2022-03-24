package model;

import java.util.Comparator;

public class CComparator implements Comparator<Country>{

		@Override
		public int compare(Country o1, Country o2) {
			int result = 0;			
			result = o2.getGoldMedalM() - o1.getGoldMedalM();
			
			if (result == 0) {
				result = o2.getSilverMedalM() - o1.getSilverMedalM();
			}			
			if (result==0) {
				result = o2.getName().compareTo(o1.getName());
			}			
			if (result == 0) {
				result = o2.getBronzeMedalM() - o1.getBronzeMedalM();
			}

			return result;
		}

}
