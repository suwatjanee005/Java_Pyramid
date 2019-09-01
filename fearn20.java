public class fearn20 
{
    public static void main(String args[])
    {
        int fearn=5;
        for(int F=1;F<=fearn;F++)
	{
            for(int O=1;O<=F;O++)
	    {
                System.out.print(F);
            }
            for(int O=1;O<=F;O++)
	    {
                System.out.print("*");
            }
            for(int O=1;O<=F;O++)
	    {
                System.out.print(F);
            }
            System.out.println();
        }
    }
}