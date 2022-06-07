import java.util.*;
public class areaper{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        System.out.print("enter radius= ");
        int r = sc.nextInt();
        c.per(r);
        c.ar(r);
    }
}

class shape{
    double pi=3.141,perimeter,area;
}

class circle extends shape{
    void per(int r){
        super.perimeter= 2*(super.pi)*r;
        System.out.println("the perimeter is "+super.perimeter);
    }
    void ar(int r){
        super.area=(super.pi)*r*r;
        System.out.println("the area is "+super.area);
    }
}