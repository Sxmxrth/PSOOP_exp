import java.util.Scanner;

public class fastFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int c = sc.nextInt();
        for (int i = 0; i <c ; i++) {
            System.out.println("Enter order ID: ");
            double id = sc.nextDouble();
            do {
                System.out.println("1. Eat here");
                System.out.println("2. Take away");
                System.out.print("Enter your choice: ");
                int n =  sc.nextInt();
                switch (n) {
                    case 1 -> {
                        Consumer c1 = new Consumer();
                        System.out.print("enter the price of your dish/beverage: ");
                        double ogPrice1 = sc.nextDouble();
                        System.out.println("your order ID is " + id);
                        System.out.println("The total bill is " + c1.totalPrice(ogPrice1));
                    }
                    case 2 -> {
                        Consumer c2 = new Consumer();
                        System.out.print("enter the price of your dish/beverage: ");
                        double ogPrice2 = sc.nextDouble();
                        System.out.println("your order ID is " + id);
                        System.out.println("The total bill is " + c2.deliverOrder(ogPrice2));
                    }
                    default -> System.out.println("Enter correct option!!");
                }
                System.out.print("enter 0 to exit: ");
                int x = sc.nextInt();
                if(x==0){
                    break;
                }

            }while(true);

        }
    }
}

interface EatItHere{
    public double totalPrice(double ogPrice);
}

interface TakeAway{
    public double deliverOrder(double ogPrice);

}

class Consumer implements EatItHere, TakeAway{

    public double totalPrice(double ogPrice) {
        if((0.1*ogPrice)<500){
            return (0.1*ogPrice) + ogPrice;
        }
        return 500 + ogPrice;
    }

    public double deliverOrder(double ogPrice) {
        if((0.05*ogPrice)>45){
            return (0.05*ogPrice)+ogPrice;
        }
        return 45 + ogPrice;
    }
}