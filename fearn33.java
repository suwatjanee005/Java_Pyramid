public class fearn33 {
    public static void main(String den[]){
        int fearn=3;
            for(int F=1;F<=fearn;F++){
                for(int O=F;O<=fearn+1;O++){
                    System.out.print(" ");
                }
                for(int O=1;O<=P*2-1;O++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int F=1;F<fearn;F++){
                for(int O=1;O<=F+2;O++){
                    System.out.print(" ");
                }
                for(int O=F;O<=(fearn-1)*2-F;O++){
                    System.out.print("*");
                }
                System.out.println();
            }
       
    }
}