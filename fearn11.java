public class fearn11 {
    public static void main(String den[]){
        int fearn=5;
        for(int F=1;F<=fearn;F++){
            for(int O=fearn;O>F;O--){
                System.out.print(" ");
            }
            System.out.print(F);
            for(int O=1;O<F;O++){
                System.out.print(" ");
            }
            System.out.println(F);
        }
    }
}