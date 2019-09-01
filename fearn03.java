public class pyramid03 {
	public static void main(String args[])   {
		int fearn = 4;
		for (int F=1; F<= fearn; F++) {
			System.out.print(F + "" + (F + 4));
			for (int col=1; col <= (4 + F); col++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}