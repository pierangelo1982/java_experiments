package basic_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ciao Mondo");
		
		String name = "";
		String lastName = "";
		int age = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual'è il tuo nome?");
		name = scanner.nextLine();
		
		System.out.println("Qual'è il tio cognome?");
		lastName = scanner.nextLine();
		
		System.out.println("Quanti anni hai?");
		age = scanner.nextInt();
		scanner.nextLine(); // messo perchè next int non va a capo
		
		System.out.println("Ciao " + name + " " + lastName);
		if (age >= 18) {
			System.out.println("Hai " + age + " , sei maggiorenne!");
		} else {
			int differenceToAge = 18 - age;
			System.out.println("Hai " + age + " , sei ancora minorenne!");
			System.out.println("Ti Mancano " + differenceToAge + " anni alla maggiore età!");
		}

	}

}
