public class first {
    public static void main(String[] args) {
        try {
            int a = 9/0;
        }
        catch (ArithmeticException e){
            System.err.println("Cannot divide by 0");
        }
        finally {
            System.out.println("bye");
        }
    }
}
