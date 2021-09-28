package Solution20;

public class Solver20 {
    String State;
    double Order;
    double Total;
    double Tax;


    Solver20(double OrderAmount, String StateInput,String County){
        State = StateInput;
        Order = OrderAmount;
        double TaxRate = Taxer(State,County);
        Tax = OrderAmount*TaxRate;
        Total = Math.round(100*(Tax + OrderAmount))/(double) 100;
    }

    public double Taxer(String State,String County) {
        double Tax = 0;
        if(State.equals("Wisconsin")){
            Tax = 0.05;
            if(County.equals("Eau Claire")){
                Tax = Tax + 0.005;
            }
            if(County.equals("Dunn")){
                Tax = Tax + 0.004;
            }
        }
        if(State.equals("Illinois")){
            Tax = 0.08;
        }
        return Tax;
    }
}
