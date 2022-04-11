package ui;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.CList;
import model.Country;

public class Main {
	
	static CList cList=new CList();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		File file = new File(".\\files\\test.txt");
		
		FileReader input= new FileReader(file);
		
		BufferedReader bf2= new BufferedReader(input);
		
		String s = bf2.readLine();	
		
		int n = Integer.parseInt(s);
		
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
		
		System.out.println("Masculino");
		cList.sortByMedalsM();
		cList.print1();
		System.out.println("----------");
		
		System.out.println("Femenino");
		cList.sortByMedalsF();
		cList.print2();
		System.out.println("----------");
		
		System.out.println("Combinado");
		cList.sortByMedalsC();
		cList.print3();
	}	
}