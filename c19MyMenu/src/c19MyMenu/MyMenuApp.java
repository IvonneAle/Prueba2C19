package c19MyMenu;

import java.util.Scanner;

import org.c19MyMenu.employees.Programmer;

public class MyMenuApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrix mat = new Matrix();
		forEachLee fel = new forEachLee();
		int option = 0;
		Programmer backend = new Programmer();
		
	
		do {
		System.out.println("\n1. if-else \n"
				+ "2. for ReadOne\n"
				+ "3. while Update\n"
				+ "4. do-While Delete\n"
				+ "5. Switch\n"
				+ "6. Matrix\n"
				+ "7. for-each ReadAll\n"
				+ "8. Exit\n");
		
		System.out.println("Choose an option");
		option = sc.nextInt();
		
		switch(option) {
		case 1:
			break;
		case 2:
			backend.Read("R2D2", mat.employees);
			break;
		case 3:
			backend.Update("R2D2", 2, "generador@generation.org", mat.employees);
			break;
		case 4:
			backend.Delete(mat.employees, "F64W");
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			backend.Read(mat.employees);
			break;
		case 8:
			break;
		default:
			System.out.println("Elige otra opcion");
		}
//		 try {
//	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//	        } catch (Exception e) {
//	        	System.out.println("Error: " + e);
//	        }
		}while(option!=8);
		
	}

}
