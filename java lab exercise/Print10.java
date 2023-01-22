public class Print10 {
    public static void main(String[] args) {
        int n=2;
            switch(n) {
                case 1: System.out.println(n);
                    break;
                case 2: System.out.println("Inner for loop:");
                    for(int j=0; j<n; j++) {
                        if(j==2)
                            break; // unlabeled break
                        else
                            System.out.println(j);
                    }
                default: System.out.println("default:" +n);
            }
    }
}
