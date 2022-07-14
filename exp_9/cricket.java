import java.util.*;
public class cricket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cricketer[] c = new Cricketer[3];
        for(int i=0; i<3; i++){


            System.out.print("Enter name: ");

            String name = sc.nextLine();
            System.out.print("Enter Runs Hit: ");
            double runs_hit = sc.nextDouble();
            System.out.print("Enter Innings count: ");
            double innings_count = sc.nextDouble();
            System.out.print("Enter not out count: ");
            double not_out_count = sc.nextDouble();
            sc.skip("\\R");
            c[i] = new Cricketer(name, runs_hit, innings_count, not_out_count);
            c[i].get_avg();
        }
        Cricketer temp;
        for(int i=0; i<3; i++){
            for(int j=0; j<2-i; j++){
                if(c[j].batting_avg>c[j+1].batting_avg){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }

        System.out.println("Details in sorted manner are: ");

        for(int i=0; i<3; i++){
            System.out.println("Name is "+ c[i].name);
            System.out.println("Total runs hit "+ c[i].runs_hit);
            System.out.println("Not out count is "+ c[i].not_out_count);
            System.out.println("Inning count is "+ c[i].innings_count);
            System.out.println("the Batting average is "+ c[i].batting_avg);
        }

        do{
            System.out.println("Enter index of cricketer to view their names:");

            try{
                int index = sc.nextInt();
                System.out.println(c[index-1].name);
            }

            catch(Exception e){
                System.out.println(" The index is incorrect ");
            }


            System.out.print("enter 0 to exit, 1 to continue: ");
            int x = sc.nextInt();
            if(x==0){
                break;
            }


        }while(true);

    }
}

class Cricketer{
    String name;
    double runs_hit, innings_count, not_out_count, batting_avg;
    Cricketer(String name, double runs_hit, double innings_count, double not_out_count){
        this.name = name;
        this.runs_hit = runs_hit;
        this.innings_count = innings_count;
        this.not_out_count = not_out_count;
    }

    public void get_avg(){
        try{

            batting_avg = (int)runs_hit /(int) (innings_count - not_out_count);

        }
        catch(ArithmeticException e){


            System.out.println("cannot divide by 0");
        }
        finally{

            batting_avg = runs_hit;

        }

    }
}