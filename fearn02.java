public class fearn02 {
	public static void main(String args[]) {
		int fearn = 4;
		for (int rowf=1; rowf <= fearn; rowf++) {
			for (int col=rowf; col <= (rowf+2); col++) {
		 System.out.print(col); }
			for (int col=1; col <= (2+rowf); col++) { 
		 System.out.print("*"); }
		 System.out.println();
		}
	}
}