import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        System.out.println("1. Cube");
        System.out.println("2. Cuboid");
        System.out.println("3. Cylinder");
        System.out.println("4. Cone");
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter your choice: ");
            int n = sc.nextInt();

            switch(n) {
                case 1:
                    System.out.print("enter side= ");
                    int a = sc.nextInt();
                    volume v1 = new volume(a);
                    vol(a);
                    break;
                case 2:
                    System.out.print("enter length, breadth and height= ");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    int h = sc.nextInt();
                    volume v2 = new volume(l, b, h);
                    vol(l, b, h);
                    break;

                case 3:
                    System.out.print("enter radius and height= ");
                    double r = sc.nextDouble();
                    int s = sc.nextInt();
                    volume v3 = new volume(r, s);
                    vol(r, s);
                    break;

                case 4:
                    System.out.print("enter radius and height= ");
                    double x = sc.nextDouble();
                    int i = sc.nextInt();
                    volume v = new volume(x, i, 1);
                    vol(x, i, 1);
                    break;
            }

            System.out.print("enter 0 to exit or any key to continue: ");
            int g=sc.nextInt();
            if(g==0){
                break;
            }
        }
    }
    public static void vol(int a){
        int vo=a*a*a;
        System.out.println("the volume of the cube is "+vo);
    }
    public static void vol(int l, int b , int h){
        int vo = l*b*h;
        System.out.println("the volume of the cuboid is "+vo);
    }
    public static void vol(double r, int h){
        double vo = 3.14*r*r*h;
        System.out.println("the volume of cylinder is "+vo);

    }
    public static void vol(double r, int h, int c){
        double vo = 0.33*3.14*r*r*h;
        System.out.println("the volume of cone is "+vo);

    }
}

class volume{
    int l,b,h;
    double r;

    volume(int a){
        this.l=a;
    }

    volume(int l , int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    volume(double r, int s){
        this.r=r;
        this.h=s;
    }

    volume(double r, int s, int c){
        this.r=r;
        this.h=s;
    }
}
