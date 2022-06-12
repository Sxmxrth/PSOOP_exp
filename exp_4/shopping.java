import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of customers: ");
        int n = sc.nextInt();

        Cart[] arr = new Cart[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Cart(n);
            System.out.println("enter the total number of items in cart of customer " + (i + 1));
            int num_item = sc.nextInt();
            arr[i].store(num_item);
        }
    }
}
class Cart{
    Scanner sc = new Scanner(System.in);
    int n;
    Cart(int n){
        this.n=n;
    }

    public void store(int num_item){
        int[][] cart= new int[num_item][3];
        for (int i = 0; i <num_item ; i++) {
            cart[i][0]=i+1;

            System.out.print("enter 1 if item is perishable and 0 if non perishable: ");
            cart[i][1]= sc.nextInt();

            System.out.print("enter the cost of the item: ");
            cart[i][2]= sc.nextInt();
        }

        int total_cost=0;
        for (int i = 0; i <num_item ; i++) {
            total_cost = total_cost+cart[i][2];

        }
        System.out.println("total cost of customer is "+total_cost);
        int p=0, np=0, costliest = 0;
        for (int i = 0; i <num_item ; i++) {
            if(cart[i][1]==1){
                p++;
            }
            if(cart[i][1]==0){
                np++;
                if(cart[i][2]>costliest){
                    costliest = cart[i][2];
                }
            }

        }
        System.out.println("total perishable items are "+p);
        System.out.println("total non perishable items are "+np);
        System.out.println("the costliest non perishable item is of "+costliest);
    }
}