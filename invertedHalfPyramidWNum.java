import java.util.*;
class invertedHalfPyramidWNum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n = s.nextInt();
        //outer loop
        for(int i = 1 ; i<=n ; i++){
            //innner loop
            for(int j =1 ; j<=n-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}