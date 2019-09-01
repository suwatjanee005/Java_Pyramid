public class fearn34 
{
    public static void main(String args[])
    {
        int fearn=3;
        for(int F = 1; F <= fearn; F++)
	{
			for(int O = 1; O <= 6 - F; O++){
	System.out.print(" ");}
        System.out.print("*");
			for(int O = 1; O <= (F * 2 - 1); O++){	
	System.out.print(F);	}
	System.out.print("*");
	System.out.println();
	}
			for(int F = 2; F >= 1; F--){
				for(int O = 1; O <= 6 - F; O++)	{
	System.out.print(" ");	}
				
	System.out.print("*");
			for(int O = 1; O <= (F * 2 - 1); O++) {
	System.out.print(F);
				}
				System.out.print("*");
				System.out.println();
			}       
 	   }    
}