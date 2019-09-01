public class fearn13 {
    public static void main(String den[]){
        int fearn=5;
        for(int F=1;F<=fearn;F++){
            for(int O=1;O<F*2-1;O++){
                System.out.print(" ");
            }
            for(int O=fearn*2-(F*2-1);O>=1;O--){
                System.out.print(O);
            }
            System.out.println();
        }
    }
}