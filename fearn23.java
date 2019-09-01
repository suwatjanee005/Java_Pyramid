public class fearn23 {
    public static void main(String den[]){
        int fearn=5;
        for(int F=1;F<=fearn;F++){
            System.out.print(F);
            for(int O=F;O<=fearn+1;O++){
                System.out.print("*");
            }
            for(int O=1;O<F;O++){
                System.out.print(" ");
            }
            System.out.println(F);
        }
    }
}
