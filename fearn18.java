public class fearn18 
{
    public static void main(String args[])
    {
        int fearn=5;
        for(int F=1;F<=fearn;F++)
	{
            System.out.print(F);
            for(int O=1;O<=F;O++)
	    {
                System.out.print("*");
            }
            System.out.print(F);
            for(int O=fearn;O>=F;O--)
	    {
                System.out.print("*");
            }
            System.out.println(fearn*2-F);
        }
    }
}