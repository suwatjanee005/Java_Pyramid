public class fearn30 {
    public static void main(String den[]){
        int fearn=5;
        for(int F=1;F<=fearn;F++){
            for(int O=1;O<F;O++){
                System.out.print(" ");
            }
            for(int O=F;O<=fearn*2-F;O++){
                System.out.print("*");
            }
            for(int O=F;O>=1;O--){
                System.out.print(O);
            }
            System.out.println();
        }
    }
}