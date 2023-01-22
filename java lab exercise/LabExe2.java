package OOPLab;


import java.util.Scanner;

/*Write a method named isSquare that returns 1 if its integer argument is a square of some
integer, otherwise it returns 0. Your method must not use any method (e.g. sqrt) that
comes with a runtime class library! */
public class LabExe2 {
    public  int isSquare(int n){
        int rtnVal=0;
        for(int i=0; i<=n; i++){
            if(i*i==n){
                rtnVal=1;
                break;
            }
        }
        return rtnVal;
    }

    public static void main(String[] args){
        System.out.println("Enter a number to check if it is a square of some number");
        Scanner console=new Scanner(System.in);
        int n=console.nextInt();
        LabExe2 num=new LabExe2();
        System.out.println(num.isSquare(n));



        // the below method can also be used if we declare the isSquare method as static
       // isSquare(n);
        //System.out.println(isSquare(n));

    }

}
