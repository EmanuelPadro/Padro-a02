package Solution13;

public class Solver13 {
    double Principal;
    double Rate;
    int Years;
    double Accrued;
    int n;

    Solver13(double PrincipalAmount, double InterestRate, int YearsInvested, int TimesCompounded){
        Principal = PrincipalAmount;
        Rate = InterestRate/100;
        Years = YearsInvested;
        n = TimesCompounded;
        //for readability purposes separated the formula for accrued and its round to cent component
        double Formula = Principal* Math.pow((1 + (Rate/n)),(n*Years));
        Accrued = ((Math.round(100*(Formula))))/(double)(100);
    }
}