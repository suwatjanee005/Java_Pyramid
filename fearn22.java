public class fearn22 
{
    public static void main(String args[])
    {
        int fearn=5;
        for(int F=1;F<=fearn;F++)
	{
            System.out.print("*");
            for(int O=1;O<F;O++)
	    {
                System.out.print(" ");
            }
            for(int O=F;O<=fearn*2-F;O++)
	    {
                System.out.print(F);
            }
            for(int O=F;O>1;O--)
	    {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}