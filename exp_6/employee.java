import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Intern");
        System.out.println("2.Clerk");
        System.out.println("3.Manager");

        do{
            System.out.print("enter your choice: ");
            int n = sc.nextInt();

            switch (n){
                case 1:
                    intern i = new intern();
                    System.out.println("the salary before bonus is "+i.getSalary());
                    System.out.println("the salary after bonus is "+i.getBonus(i.getSalary()));
                    break;


                case 2:
                    clerk c = new clerk();
                    System.out.println("the salary before bonus is "+c.getSalary());
                    System.out.println("the salary after bonus is "+c.getBonus(c.getSalary()));
                    break;

                case 3:
                    manager m = new manager();
                    System.out.println("the salary before bonus is "+m.getSalary());
                    System.out.println("the salary after bonus is "+m.getBonus(m.getSalary()));
                    break;

            }

            System.out.println("enter 0 to exit or any key to continue");
            int x = sc.nextInt();
            if(x==0){
                break;
            }
        }while(true);
    }
}

class Employeee{
    double getSalary(){
        return 10000;
    }

    double getBonus(double salary){
        return 0;
    }
}

class intern extends Employeee{
    double getSalary() {
        return (0.75*10000);
    }

    double getBonus(double salary){
        return (salary+(0.3*salary));

    }
}

class clerk extends Employeee{
    double getSalary() {
        return (0.5*10000);
    }

    double getBonus(double salary){
        return (salary+(0.2*salary));

    }
}

class manager extends Employeee{
    double getSalary() {
        return (2*10000);
    }

    double getBonus(double salary){
        return (salary+(0.5*salary));

    }
}