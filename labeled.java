public class labeled {
    public static void main(String[] args){
        LabeledBreak: {
            for(int i=0; i<=5; ++i){
                if(i==4){
                    break LabeledBreak;
                }
                System.out.println(i);
            }
            System.out.println("HIt here!");
        }
    }
}
