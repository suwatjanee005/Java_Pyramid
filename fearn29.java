public class fearn29 
{
    public static void main(String args[])
    {
        int fearn=5;
        for(int F=1;F<=fearn;F++)
	{
            System.out.print(F+"*"+(F+2));
            for(int O=1;O<=F+2;O++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}