import java.util.*;
class inverted180HalfPyramid{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the no. of Rows : ");
        int n = p.nextInt();
        //outer Loop
        for (int i=1 ; i<=n ; i++){
            //inner loop
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int k =1 ; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        p.close();
    }
}