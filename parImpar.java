import java.util.Scanner;
/**
 * @author bryan
 * 
 * */
public class parImpar {
	
	static boolean isPar(int numero) {
		boolean isPar = (numero%2==0)? true : false;
		return isPar;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int result=0;
		String pregunta=null;		
		do {
			System.out.print("Ingresa un numero: ");
			num=sc.nextInt();
			result=(isPar(num)==true)? 1: 0;
			switch(result) {
			case 0: 
				System.out.println("Es impar");
				break;
			case 1:
				System.out.println("Es par");
				break;
				default:
					System.out.println("No se supo definir");
					break;
			}
			sc.nextLine();
			System.out.print("Desea repetir? (s,n): ");
			pregunta=sc.nextLine();
		}while(pregunta.charAt(0)=='s' || pregunta.charAt(0)=='S');
		//comentario
	}

}
