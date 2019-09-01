public class fearn01 {
	public static void main(String args[]) {
		int fearn = 4;
		for (int rowf=1; rowf <= fearn; rowf++) {
			
			for (int col=2; col <= rowf; col++) { 
	System.out.print(" "); }
	System.out.print(rowf + "" + rowf);
			for (int col=fearn; col >= (rowf + 1); col--) { 
	System.out.print("**"); }
	System.out.println( rowf + "" + rowf);
		}
	}
}