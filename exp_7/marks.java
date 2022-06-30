import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the subject and then the marks: ");
        String[] subjects1 = new String[4];
        double[] marks1 = new double[4];

        for (int i = 0; i <4 ; i++) {

            subjects1[i] = sc.nextLine();
            marks1[i] = sc.nextDouble();
            sc.skip("\\R");

        }
        A objA = new A(marks1, subjects1);
        objA.getPercentage(marks1, subjects1);
        objA.Data(marks1, subjects1);


        System.out.println("enter the subject and then the marks: ");
        String[] subjects2 = new String[3];
        double[] marks2 = new double[3];

        for (int i = 0; i <3 ; i++) {

            subjects2[i] = sc.nextLine();
            marks2[i] = sc.nextDouble();
            sc.skip("\\R");
        }
        B objB = new B(marks2, subjects2);
        objB.getPercentage(marks2, subjects2);
        objB.Data(marks2, subjects2);
    }
}

abstract class Marks{
    abstract void getPercentage(double[] marks, String[] subjects);
    abstract void Data(double[] marks, String[] subjects);

}

class A extends Marks{
    double temp = 0, percentage;
    A(double[] marks, String[] subjects){
    }
    void getPercentage(double[] marks, String[] subjects) {
        for (int i = 0; i < 4; i++) {
            temp = temp + marks[i];
        }
        percentage = temp / 4;
    }

    double swapMarks;
    String swapSubj;
    void Data(double[] marks, String[] subjects){
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <3-i ; j++) {
                if(marks[j]<marks[j+1]){

                    swapMarks = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = swapMarks;

                    swapSubj = subjects[j];
                    subjects[j] = subjects[j+1];
                    subjects[j+1] = swapSubj;
                }
            }
        }
        for (int i = 0; i <4 ; i++) {
            System.out.println(subjects[i] + "      " +  marks[i]);
        }
        System.out.println("Percentage is "+percentage);
        System.out.println();
    }
}

class B extends Marks{
    double temp = 0, percentage;
    B(double[] marks, String[] subjects){
    }
    void getPercentage(double[] marks, String[] subjects){
        for (int i = 0; i <3 ; i++) {
            temp = temp + marks[i];
        }
        percentage = temp/4;
    }
    double swapMarks;
    String swapSubj;
    void Data(double[] marks, String[] subjects){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2-i ; j++) {
                if(marks[j]<marks[j+1]){

                    swapMarks = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = swapMarks;

                    swapSubj = subjects[j];
                    subjects[j] = subjects[j+1];
                    subjects[j+1] = swapSubj;
                }
            }
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(subjects[i] + "      " +  marks[i]);
        }
        System.out.println("Percentage is "+percentage);
        System.out.println();
    }
}