package Solution14;

public class Solver14 {
    String State;
    double Subtotal;
    double Tax;
    double Total;

    Solver14(double OrderAmount, String StateGiven) {
        State = StateGiven;
        Subtotal = OrderAmount;
        Tax = OrderAmount * 0.055;
        Total = Tax + OrderAmount;
    }
}
//could use an array and print array as many times as there are values wayyyy to complicated thoQQQQ