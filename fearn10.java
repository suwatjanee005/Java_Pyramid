public class fearn10 
{
    public static void main(String args[])
    {
        int fearn=5;
        for(int F=1;F<=fearn;F++)
	{
            for(int O=F;O<fearn;O++)
	    {
                System.out.print(" ");
            }
            for(int O=1;O<=F;O++)
	    {
                System.out.print(O);
            }
            System.out.print(fearn-F+1);
            for(int O=F;O>=1;O--)
	    {
                System.out.print(O);
            }
            System.out.println();
        }
    }
}