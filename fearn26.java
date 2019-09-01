public class fearn26 {
    public static void main(String den[]){
        int fearn=5;
        for(int F=1;F<=fearn;F++){
            for(int O=F;O<=fearn;O++){
                System.out.print(F);
            }
            for(int O=1;O<=F;O++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}