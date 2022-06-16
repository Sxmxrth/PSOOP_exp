import java.util.Scanner;

public class movies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of movies:");
        int n = sc.nextInt();
        Movies[] arr = new Movies[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = new Movies();
            arr[i].info();


        }
    }
}

class Movies{
    Scanner sc = new Scanner(System.in);
    void info(){
        System.out.print("Enter the name of the movie: ");
        String name = sc.nextLine();
        System.out.print("enter the type of movie: ");
        String type = sc.nextLine();
        System.out.print("enter the Heros name: ");
        String hero = sc.nextLine();
        System.out.print("enter the Heroines name: ");
        String heroine = sc.nextLine();
        System.out.print("enter the budget: ");
        double budget = sc.nextDouble();


    }

}
