public class fastFood {
    public static void main(String[] args) {

    }
}

interface EatItHere{
    public double totalPrice(double ogPrice);
}

interface TakeAway{
    public double deliverOrder(double ogPrice);

}

class Consumer implements EatItHere, TakeAway{

    public double totalPrice(double ogPrice) {

    }

    public double deliverOrder(double ogPrice) {
        return 0;
    }
}