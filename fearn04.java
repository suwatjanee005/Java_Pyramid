public class fearn04 
{
    public static void main(String args[])
    {
        int fearn=4;
        for(int F=1;P<=fearn;F++)
	{
            for(int col=1;col<=F;col++)
	    {
                System.out.print("*");
            }
            for(int col=F;col>=1;col--)
	    {
                System.out.print(col);
            }
            for(int col=1;col<F;col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
}