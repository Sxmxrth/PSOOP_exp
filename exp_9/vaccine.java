import java.util.*;
public class vaccine{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the distance between the 2 vaccines: ");
            int n = sc.nextInt();

            try{
                validate(n);
            }

            catch(myException m){
                System.out.println("enter a number between 84 and 100 please");
            }

            System.out.print("enter 0 to exit, 1 to continue: ");
            int m = sc.nextInt();
            if(m==0){
                break;
            }

        }while(true);

    }

    public static void validate(int n) throws myException{

        if(n<84 || n>100){
            throw new myException("enter a valid input");
        }

        else{
            System.out.println("this is a valid input");
        }
    }
}

class myException extends Exception{
    public myException(String str){
        super(str);
    }
}