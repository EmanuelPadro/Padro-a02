package Solution10;

public class Solver10 {
    double Subtotal;
    double Tax;
    double Total;


    Solver10(double Item1P,int Item1Q,double Item2P,int Item2Q,double Item3P,int Item3Q){
        Subtotal = (Item1P*Item1Q)+(Item2P*Item2Q)+(Item3P*Item3Q);
        Tax = Subtotal * 0.055;
        Total = Subtotal + Tax;
    }

}
