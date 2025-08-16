package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> payers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char payerType = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (payerType == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				payers.add(new Company(name, anualIncome, numberOfEmployees));
			} else {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				payers.add(new Individual(name, anualIncome, healthExpenditures));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer payer : payers) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
		}
		
		double sum = 0.0;
		for (TaxPayer payer : payers) {
			sum += payer.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}
