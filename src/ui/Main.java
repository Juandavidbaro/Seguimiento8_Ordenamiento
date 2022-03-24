package ui;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Country;
import model.CList;

public class Main {
	
	private static CList cList;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		File file = new File(".\\files\\test.txt");
		
		FileReader input= new FileReader(file);
		
		BufferedReader bf2= new BufferedReader(input);
		
		String s = bf2.readLine();	
		
		int n = Integer.parseInt(s);
		
		cList= new CList();
		
		for (int  i = 0; i<n;i++) {
			
			String[] country= bf2.readLine().split(";");
			String name= country[0];
			int goldMedalM= Integer.parseInt(country[1]);
			int silverMedalM= Integer.parseInt(country[2]);
			int bronzeMedalM= Integer.parseInt(country[3]);
			int goldMedalF= Integer.parseInt(country[4]);
			int silverMedalF= Integer.parseInt(country[5]);
			int bronzeMedalF= Integer.parseInt(country[6]);
			
			Country country1= new Country(name,goldMedalM,silverMedalM,bronzeMedalM, goldMedalF, silverMedalF, bronzeMedalF);
			
			cList.addCountry(country1);
			
			
		}
		
		cList.sortComparatorClass();
		printList();
		
		cList.sortCollectionsNaturalOrder();
		printList2();
		
		cList.bubbleSort();
		printList3();
	}
	
	public static void printList() {
		
		System.out.println("Masculino");
		for (int i = 0; i < cList.getCountry().size(); i++) {
			System.out.println(cList.getCountry().get(i).toString1());
		}
		System.out.println("----------");
		
	}
	
	public static void printList2() {
		
		System.out.println("Femenino");
		for (int i = 0; i < cList.getCountry().size(); i++) {
			System.out.println(cList.getCountry().get(i).toString2());
		}
		System.out.println("----------");
		
	}
	
	public static void printList3() {
		
		System.out.println("Combinado");
		for (int i = 0; i < cList.getCountry().size(); i++) {
			System.out.println(cList.getCountry().get(i).toString3());
		}
		
	}
	
	
}