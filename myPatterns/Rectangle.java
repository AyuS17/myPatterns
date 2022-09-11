import java.util.*;
class Rectangle{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the no. of Rows : ");
        int n = p.nextInt();
        System.out.print("Enter the no. of Columns : ");
        int m = p.nextInt();
        //outer Loop
        for (int i=1 ; i<=n ; i++){
            //inner loop
            for(int j=1 ; j<=m ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        p.close();
    }
}