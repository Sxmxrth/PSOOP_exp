public class bank {
    public static void main(String[] args) {
        
    }
}

class Bank{
    double get_rate_of_interest(double p, int n){
        return (p*0.02*n)/365;
    }
}

class Axis extends Bank{
    double get_rate_of_interest(double p, int n){
        if(n>7 && n<=45){
            return (p*0.03*n)/365;
        }
        if(n>45 && n<=180){
            return (p*0.04*n)/365;
        }
        if(n>180 && n<=365){
            return (p*0.06*n)/365;
        }
        if(n>365){
            return (p*0.08*n)/365;
        }
        return (p*0.10*n)/365;
    }
}

class Icici extends Bank{
    double get_rate_of_interest(double p, int n){
        if(n>7 && n<=45){
            return (p*0.028*n)/365;
        }
        if(n>45 && n<=180){
            return (p*0.035*n)/365;
        }
        if(n>180 && n<=365){
            return (p*0.07*n)/365;
        }
        if(n>365){
            return (p*0.08*n)/365;
        }
        return (p*0.09*n)/365;
    }
}

class Sbi extends Bank{
    double get_rate_of_interest(double p, int n){
        if(n>7 && n<=45){
            return (p*0.031*n)/365;
        }
        if(n>45 && n<=180){
            return (p*0.04*n)/365;
        }
        if(n>180 && n<=365){
            return (p*0.065*n)/365;
        }
        if(n>365){
            return (p*0.08*n)/365;
        }
        return (p*0.11*n)/365;
    }
}