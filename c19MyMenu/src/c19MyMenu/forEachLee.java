package c19MyMenu;

public class forEachLee {

	public void ImprimeEmps(String[][] matrix){
		
		for(String[] obj: matrix) {
			System.out.println("\n");
			for(String obje: obj) {
				System.out.print("[" + obje + "]");
			}
		
		}
	}
}
