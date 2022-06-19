import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of employees: ");
        int n = sc.nextInt();
        SalariedEmployee[] arr = new SalariedEmployee[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = new SalariedEmployee("ABC","2021600000",20);
            sc.skip("\\R");
            System.out.print("enter the name: ");
            String name = sc.nextLine();
            arr[i].setName(name);

            System.out.print("enter the ID: ");
            String id = sc.nextLine();
            arr[i].setId(id);

            System.out.print("enter age: ");
            int age = sc.nextInt();
            arr[i].setAge(age);

            System.out.print("enter your salary: ");
            double salary = sc.nextDouble();
            arr[i].setEmpSal(salary);

            System.out.print("enter 1 of the employee is permanent and 0 if they're on contract: ");
            int x = sc.nextInt();
            arr[i].updatedSal(x);

        }

        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n-1 ; j++) {
                SalariedEmployee temp;
                if(arr[j].getEmpSal()<arr[j+1].getEmpSal()){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            arr[i].print(i+1);
            System.out.println();

        }
    }
}

class Employees1{
    private String name, id;
    private int age;
    Employees1(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    void setName(String newName){
        this.name =  newName;
    }
    void setId(String newId){
        this.id = newId;
    }
    void setAge(int newAge){
        this.age = newAge;
    }

    String getName(){
        return name;
    }

    String getId(){
        return id;
    }

    int getAge(){
        return age;
    }
}

class SalariedEmployee extends Employees1{
    private double empSal;
    SalariedEmployee(String name, String id, int age){
        super(name, id, age);
    }

    void setEmpSal(double newEmpSal){
        this.empSal = newEmpSal;
    }
    void updatedSal(int x){
        if(x==1){
            empSal=empSal+2000;
        }
    }
    double getEmpSal(){
        return empSal;
    }

    void print(int j) {
        System.out.println("name of " + j + " employee is " + getName());
        System.out.println("ID of " + j + " employee is " + getId());
        System.out.println("age of " + j + " employee is " + getAge());
        System.out.println("Salary of " + j + " employee is " + empSal);
    }
}

