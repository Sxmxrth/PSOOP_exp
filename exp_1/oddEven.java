import java.util.Scanner;

public class oddEven{
    public static void Odd_even(int a , int b){
        int odd=0;
        int even=0;
        for (int i = a; i <=b ; i++) {
            if(i%2==0){
                even++;
                System.out.println("even="+i);
            }
            else{
                odd++;
                System.out.println("odd="+i);
            }

        }
        System.out.println("the number of even number in the range are="+even);
        System.out.println("the number of odd numbers in tge range are="+odd);

        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.println("even="+i);
            }
            else{
                System.out.println("odd="+i);
            }

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