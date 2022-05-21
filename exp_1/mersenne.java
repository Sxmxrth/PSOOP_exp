import java.util.*;
import java.lang.*;

public class mersenne{
    public static void main(String args[]){
        checkPrime u= new checkPrime();
        Print v= new Print();
        for(int p=2;p<=31;p++){
            int l=(int)Math.pow(2,p)-1;
            int x=u.prime(l);
            v.print(x,l);
        }
    }
}

class checkPrime{
    public static int prime(int a){
        int r=(int)Math.sqrt(a);
        for(int i=2;i<=r;i++){
            if(a%i==0){
                return 0;
            }
        }
        return 1;
    }
}


class Print{
    public static void print(int x, int l){
        if(x==1){
            System.out.println(l+" is a mersenne number");
        }
    }

}