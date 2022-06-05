import java.util.*;
class Student{
    private String studName,sid;
    private float percentage;

    Student(){   //constructor
        studName="Samarth";
        sid="2021600023";
        percentage=98;
    }

    public void setName(String newName){
        this.studName=newName;
    }

    public void setsid(String newsid){
        this.sid=newsid;
    }

    public void setpercentage(float perc){
        this.percentage=perc;
    }

    public String getName(){
        return studName;
    }

    public String getsid(){
        return sid;
    }

    public float getpercentage(){
        return percentage;
    }
}


public class stuinfo{  //driver class
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("enter your name: ");
        String name = sc.next();
        System.out.println("enter your ID: ");
        String id = sc.next();
        //int perc=sc.nextFloat();

        System.out.println("enter the number of subjects: ");
        int n=sc.nextInt();

        float perc=marks(n);


        s.setName(name);
        s.setsid(id);
        s.setpercentage(perc);


        System.out.println("Name= "+s.getName());
        System.out.println("ID= "+s.getsid());
        System.out.println("Percentage= "+s.getpercentage()+"%");

        if((int)perc>=90){
            System.out.println("Grade=A");
        }
        else if((int)perc>=80 && (int)perc<90){
            System.out.println("Grade=B");
        }
        else if ((int)perc>=70 && (int)perc<80) {
            System.out.println("Grade=C");
        }
        else {
            System.out.println("Grade=D");
        }
    }

    public static float marks(int n){
        System.out.print("enter the marks in each subject: ");
        Scanner sc = new Scanner(System.in);
        float c=0,m;
        for(int i=0;i<n;i++){
            m=sc.nextInt();
            c=c+m;
        }
        return c/n;
    }
}