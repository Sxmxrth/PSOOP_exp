import java.util.*;
public class interfaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. Cylinder");
            System.out.println("2. Cuboid");
            System.out.println("3. Cube");

            System.out.print("enter your choice: ");
            int n = sc.nextInt();

            switch(n){
                case 1:
                    Cylinder c = new Cylinder();
                    System.out.print("enter the radius of the Cylinder: ");
                    double r = sc.nextDouble();
                    System.out.print("enter the height of the cylinder: ");
                    double h = sc.nextDouble();

                    System.out.println("Surface Area is: "+c.getArea(r,h,1));
                    System.out.println("Volume is: "+ c.getVolume(r,h,1));
                    break;
                case 2:
                    Cuboid co = new Cuboid();
                    System.out.print("enter the length of Cuboid: ");
                    double l = sc.nextDouble();
                    System.out.print("enter the breadth of Cuboid: ");
                    double b = sc.nextDouble();
                    System.out.print("enter the height of Cuboid: ");
                    double h1 = sc.nextDouble();

                    System.out.println("Surface Area is: "+co.getArea(l,b,h1));
                    System.out.println("Volume is: "+ co.getVolume(l,b,h1));
                    break;
                case 3:
                    Cube cu = new Cube();
                    System.out.print("enter the side of Cube: ");
                    double a = sc.nextDouble();


                    System.out.println("Surface Area is: "+cu.getArea(a,1,1));
                    System.out.println("Volume is: "+ cu.getVolume(a,1,1));
                    break;
            }
            System.out.print("enter 0 to exit, else any key to continue:");
            int x = sc.nextInt();
            if(x==0){
                break;
            }

        } while(true);
    }
}

interface Volumes {
    public double getVolume(double r, double h, double b);
}

interface surfaceArea{
    public double getArea(double r, double h, double b);
}

class Cylinder implements Volumes, surfaceArea{

    public double getVolume(double r, double h, double b){
        return 3.14*r*r*h;
    }

    public double getArea(double r, double h, double b){
        return ((2*3.14*r*h) + (2*3.14*r*r));
    }
}

class Cuboid implements Volumes, surfaceArea{

    public double getVolume(double r, double h, double b){
        return (r*b*h);
    }

    public double getArea(double r, double h, double b){
        return 2*((r*b) + (b*h) + (h*r));
    }
}

class Cube implements Volumes, surfaceArea{

    public double getVolume(double r, double h, double b){
        return (r*r*r);
    }

    public double getArea(double r, double h, double b){
        return 6*r*r;
    }
}