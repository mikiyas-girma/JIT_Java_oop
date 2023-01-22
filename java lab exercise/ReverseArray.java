package JavaCourse;

public class ReverseArray {


    public static void main(String[] args){
        int[] array1={10,20,30,40,50,60};

        System.out.println("order of arrays before reversing :");
        for(int i=0; i<array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        reverse(array1,array1.length);
    }


    public static void reverse(int a[],int n){

        int[] b=new int[n];
        int j=n;
        for(int i=0; i<n; i++){
            b[j-1]=a[i];
            j--;
        }

        System.out.println("reversed arrray is :");
        for(int k=0; k<n; k++){
            System.out.print(b[k] + " ");
        }

    }
}
