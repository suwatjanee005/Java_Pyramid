public class fearn36 {
    public static void main(String den[]){
        int fearn=3;
        for(int F=1;F<=fearn;F++){
            for(int O=F;O<=fearn;O++){
                System.out.print(O);
            }
            for(int O=1;O<=F*2-1;O++){
                System.out.print("*");
            }
            for(int O=fearn;O>=F;O--){
                System.out.print(O);
            }
            System.out.println();
        }
        for(int F=fearn-1;F>=1;F--){
            for(int O=F;O<=fearn;O++){
                System.out.print(O);
            }
            for(int O=1;O<=F*2-1;O++){
                System.out.print("*");
            }
            for(int O=fearn;O>=F;O--){
                System.out.print(O);
            }
            System.out.println();
        }
    }    
}