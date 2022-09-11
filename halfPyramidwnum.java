import java.util.Scanner;
class halfPyramidwnum{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Ener the value : ");
        int n = s.nextInt();
        //outer loop
        for(int i=1 ; i<=n ; i++){
            //inner loop
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}