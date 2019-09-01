public class fearn21 {
    public static void main(String den[]){
        int fearn=5;
        for(int F=1;F<=fearn;F++){
            for(int O=0;O<=((fearn*2)-(F+3));O++){
                System.out.print("*");
            }
            System.out.print(F);
            for(int O=F;O>=1;O--){
                System.out.print("*");
            }
            System.out.println((fearn*2)-(F+2));
        }
    }
}