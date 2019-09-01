public class fearn08
{
    public static void main(String args[])
    {
        int fearn=7;
        for(int F=1;F<=fearn;F++)
	{
            for(int O =1;O<F;O++)
	    {
                System.out.print(" ");
            }
            System.out.print(F+""+(F+1)+""+(F+2));
            for(int O=0;O<=F;O++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}