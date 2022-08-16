package retangulo;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and hieght:  ");
		retangulo.w = sc.nextDouble();
		retangulo.h = sc.nextDouble();
		
		System.out.printf("Area =  %.2f%n", retangulo.area());
		System.out.printf("Perimeter = %.2f%n", retangulo.perimeter());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		
		
		
		
		
		sc.close();

	}

}
