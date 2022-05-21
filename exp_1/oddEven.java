import java.util.Scanner;

public class oddEven{
    public static void Odd_even(int a , int b){
        int odd=0;
        int even=0;
        if(a%2==0){
            System.out.println("even:");
        }
        else{
            System.out.println("odd:");
        }
        for (int i = a; i <=b ; i+=2) {
            if(i%2==0){
                even++;
                System.out.print(i+" ");
            }

            else{
                odd++;
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        if((a+1)%2==0){
            System.out.println("even:");
        }
        else{
            System.out.println("odd:");
        }
        for (int i = a+1; i <=b ; i+=2) {
            if(i%2==0){
                even++;
                System.out.print(i+" ");
            }
            else{
                odd++;
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        System.out.println("the number of even number in the range are="+even);
        System.out.println("the number of odd numbers in tge range are="+odd);

        System.out.println("odd:");
        for (int i = 1; i <=100 ; i+=2) {
            System.out.print(i+" ");

        }
        System.out.println("");
        System.out.println("even:");
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }
    }
}
class xyz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lower limit=");
        int a = sc.nextInt();
        System.out.println("enter upper limit=");
        int b = sc.nextInt();
        oddEven u = new oddEven();
        u.Odd_even(a,b);
    }
}