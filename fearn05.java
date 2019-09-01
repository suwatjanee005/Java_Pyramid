public class fearn05 {
    public static void main(String den[]){
        int fearn=4;
        for(int F=1;F<=fearn;F++){
            for(int col=fearn-1;col>=F;col--){
                System.out.print(" ");
            }
            System.out.print(F);
            for(int col=1;col<F;col++){
                System.out.print("**");
            }
            System.out.println(F);
        }
        for(int F=1;F<fearn;F++){
            for(int col=1;col<=F;col++){
                System.out.print(" ");
            }
            System.out.print(fearn-F);
            for(int col=fearn-1;col>F;col--){
                System.out.print("**");
            }
            System.out.println(fearn-F);
        }
    }
}