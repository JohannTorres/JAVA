package tech.johann.beeJava;

//import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio1014 {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		
		DecimalFormat df = new DecimalFormat("0.000");
		
		Scanner sc = new Scanner(System.in);
		
		int X;
		
		double Y,total;
		
		X = sc.nextInt();
		
		Y = sc.nextDouble();
		
		total = X / Y; 
		
		System.out.println(df.format(total)+ " km/l");
		
		sc.close();

	}

}
