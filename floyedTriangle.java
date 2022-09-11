import java.util.Scanner;
class floyedTriangle{
    public static void main(String[] args){
        int a=1;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n= s.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        s.close();
    }
}