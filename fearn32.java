public class fearn32
{
    public static void main(String args[])
    {
        int fearn=3;
        for(int F=1;F<=fearn*2-1;F++)
	{
            for(int O=1;O<=(fearn*2-F+2);O++)
	    {
                System.out.print(O);
            }
            for(int O=fearn;O<=fearn+F+1;O++)
	    {
                System.out.print("*");
            }
            System.out.println(fearn-(fearn-2)+F);
        }
    }
}