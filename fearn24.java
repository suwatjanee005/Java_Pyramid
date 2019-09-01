public class fearn24 
{
    public static void main(String args[])
    {
        int fearn=5;
        for(int F=1;F<=fearn;F++)
	{
            System.out.print(F);
            for(int O=1;O<=F*2-1;O++)
	    {
                System.out.print("*");
            }
            for(int O=F;O<=fearn*2-F;O++)
	    {
                System.out.print(F);
            }
	    System.out.print(F);
            System.out.println();
        }
    }
}