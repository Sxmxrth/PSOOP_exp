import java.util.*;
import java.lang.String;
public class course{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of students: ");
        int n = sc.nextInt();
        Comps[] c = new Comps[n];
        IT[] i = new IT[n];
        int c1=0, c2=0;

        for(int k=1;k<=n;k++){

            System.out.print("enter batch code: ");
            int x = sc.nextInt();

            if(x == 1){
                sc.skip("\\R");
                System.out.print("enter name: ");
                String name = sc.nextLine();
                System.out.print("enter UID: ");
                String UID = sc.nextLine();
                System.out.print("enter year: ");
                String year = sc.nextLine();
                c[c1]= new Comps(name,UID,year);
                c1++;
            }
            if(x==2){
                sc.skip("\\R");
                System.out.print("enter name: ");
                String name = sc.nextLine();
                System.out.print("enter UID: ");
                String UID = sc.nextLine();
                System.out.print("enter year: ");
                String year = sc.nextLine();
                i[c2]= new IT(name,UID,year);
                c2++;
            }
        }
        do{
            System.out.println("1. Comps");
            System.out.println("2. IT");
            System.out.print("enter choice: ");
            int y = sc.nextInt();

            switch(y){
                case 1:
                    Comps t1;
                    for(int j =0; j<c1; j++){
                        for(int l =0; l<c1-j; l++){
                            if((c[l].year).compareTo(c[l+1].year)>0){
                                t1=c[l+1];
                                c[l+1]=c[l];
                                c[l]=t1;
                            }
                        }
                    }
                    for(int j =0; j<c1; j++){
                        c[j].studentDetails();
                    }
                    break;


                case 2:
                    IT t2;
                    for(int j =0; j<c2; j++){
                        for(int l =0; l<c2-j; l++){
                            if((i[l].year).compareTo(i[l+1].year)>0){
                                t2=i[l+1];
                                i[l+1]=i[l];
                                i[l]=t2;
                            }
                        }
                    }
                    for(int j =0; j<c2; j++){
                        i[j].studentDetails();
                    }
                    break;
            }

            System.out.println("enter 0 to exit or 1 to continue");
            int m=sc.nextInt();
            if(m==0){
                break;
            }
        }while(true);
    }
}
abstract class Course{
    public abstract void studentDetails();
}

class Comps extends Course{

    String name, UID, year;

    Comps(String name, String UID, String year){
        this.name=name;
        this.UID=UID;
        this.year=year;
    }

    public void studentDetails(){
        System.out.println();
        System.out.println("name is "+name);
        System.out.println("UID is "+UID);
        System.out.println("Year is "+year);
        System.out.println();
        //System.out.println("Specialisatiob is "+sp);
    }

}

class IT extends Course{

    String name, UID, year;

    IT(String name, String UID, String year){
        this.name=name;
        this.UID=UID;
        this.year=year;
    }
    public void studentDetails(){
        System.out.println();
        System.out.println("name is "+name);
        System.out.println("UID is "+UID);
        System.out.println("Year is "+year);
        System.out.println();
        //System.out.println("Specialisatiob is "+sp);
    }
}