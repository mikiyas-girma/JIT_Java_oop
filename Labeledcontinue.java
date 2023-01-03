public class Labeledcontinue {
    public static void main(String[] args){
        cont:
        for(int j=1; j<=2; j++) {
            for(int i=1; i<5; ++i){
                if(i==4){
                    continue cont;
                }
                System.out.println(i);
            }
        }

    }
}
