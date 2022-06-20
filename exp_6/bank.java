import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Axis");
        System.out.println("2.ICICI");
        System.out.println("3.SBI");
        System.out.print("enter your choice: ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                Axis a = new Axis();
                System.out.print("Enter the amount put in bank: ");
                double p1 = sc.nextDouble();
                System.out.print("Enter the number of days: ");
                int n1 = sc.nextInt();
                System.out.println("The interest gained is "+ a.get_rate_of_interest(p1,n1));
                p1 = p1 + a.get_rate_of_interest(p1,n1);
                System.out.println("The total amount in bank is "+p1);

                System.out.print("enter amount to be withdrawn: ");
                double amount1 = sc.nextDouble();
                if(a.withdrawn(p1,amount1)!=0){
                    System.out.println("the amount left in the bank is "+a.withdrawn(p1,amount1));
                }
                else {
                    System.out.println("Conditions not met.");
                }
                break;

            case 2:
                Icici i = new Icici();
                System.out.print("Enter the amount put in bank: ");
                double p2 = sc.nextDouble();
                System.out.print("Enter the number of days: ");
                int n2 = sc.nextInt();
                System.out.println("The interest gained is "+ i.get_rate_of_interest(p2,n2));
                p2 = p2 + i.get_rate_of_interest(p2,n2);
                System.out.println("The total amount in bank is "+p2);

                System.out.print("enter amount to be withdrawn: ");
                double amount2 = sc.nextDouble();
                if(i.withdrawn(p2,amount2)!=0){
                    System.out.println("the amount left in the bank is "+i.withdrawn(p2,amount2));
                }
                else {
                    System.out.println("Conditions not met.");
                }
                break;

            case 3:
                Sbi s = new Sbi();
                System.out.print("Enter the amount put in bank: ");
                double p3 = sc.nextDouble();
                System.out.print("Enter the number of days: ");
                int n3 = sc.nextInt();
                System.out.println("The interest gained is "+ s.get_rate_of_interest(p3,n3));
                p3 = p3 + s.get_rate_of_interest(p3,n3);
                System.out.println("The total amount in bank is "+p3);

                System.out.print("enter amount to be withdrawn: ");
                double amount3 = sc.nextDouble();
                if(s.withdrawn(p3,amount3)!=0){
                    System.out.println("the amount left in the bank is "+s.withdrawn(p3,amount3));
                }
                else {
                    System.out.println("Conditions not met.");
                }

                break;

        }
    }
}

class Bank{
    double get_rate_of_interest(double p, int n){
        return (p*0.02*n)/365;
    }

    double withdrawn(double pr, double amount){
        if(amount>=500 && amount<=(pr-500)){
            return pr-amount;
        }
        return 0;
    }
}

class Axis extends Bank{
    double get_rate_of_interest(double p, int n){
        if(n>7 && n<=45){
            return (p*0.03*n)/365;
        }
        if(n>45 && n<=180){
            return (p*0.04*n)/365;
        }
        if(n>180 && n<=365){
            return (p*0.06*n)/365;
        }
        if(n>365){
            return (p*0.08*n)/365;
        }
        return (p*0.10*n)/365;
    }

    double withdrawn(double pr, double amount){
        if(amount>=600 && amount<=(pr-600)){
            return pr-amount;
        }
        return 0;
    }
}

class Icici extends Bank{
    double get_rate_of_interest(double p, int n){
        if(n>7 && n<=45){
            return (p*0.028*n)/365;
        }
        if(n>45 && n<=180){
            return (p*0.035*n)/365;
        }
        if(n>180 && n<=365){
            return (p*0.07*n)/365;
        }
        if(n>365){
            return (p*0.08*n)/365;
        }
        return (p*0.09*n)/365;
    }

    double withdrawn(double pr, double amount){
        if(amount>=400 && amount<=(pr-400)){
            return pr-amount;
        }
        return 0;
    }
}

class Sbi extends Bank{
    double get_rate_of_interest(double p, int n){
        if(n>7 && n<=45){
            return (p*0.031*n)/365;
        }
        if(n>45 && n<=180){
            return (p*0.04*n)/365;
        }
        if(n>180 && n<=365){
            return (p*0.065*n)/365;
        }
        if(n>365){
            return (p*0.08*n)/365;
        }
        return (p*0.11*n)/365;
    }

    double withdrawn(double pr, double amount){
        if(amount>=1000 && amount<=(pr-1000)){
            return pr-amount;
        }
        return 0;
    }
}