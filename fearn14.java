public class fearn14 
{
    public static void main(String args[])
    {
        int fearn=5;
        for(int F=1;F<=fearn;F++)
    	{
            for(int O=F;O>1;O--)
	    {
                System.out.print(" ");
            }
            System.out.print(F+""+(F+1));
            for(int O=fearn;O>F;O--)
	    {
                System.out.print("  ");
            }
            System.out.println((F+1)+""+F);
        }
    }
}