import java.util.*;
class Student{
    private String studName,sid;
    private float percentage;

    Student(){
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

public class stuinfo{
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


        System.out.println(s.getName());
        System.out.println(s.getsid());
        System.out.println(s.getpercentage());
    }

    public static float marks(int n){
        Scanner sc = new Scanner(System.in);
        int c=0,m;
        for(int i=0;i<n;i++){
            m=sc.nextInt();
            c=c+m;
        }
        float perc=c/n;

        return perc;
    }
}