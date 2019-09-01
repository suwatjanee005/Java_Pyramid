public class fearn25 {
    public static void main(String den[]){
        int fearn=5;
        for(int F=1;F<=fearn;F++){
            for(int O=F;O<fearn;O++){
                System.out.print("*");
            }
            for(int O=1;O<=F*2-1;O++){
                System.out.print(fearn-F+1);
            }
            for(int O=F;O<=fearn;O++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}