package Solution12;

public class Solver12 {
    double Rate;
    int Years;
    double Accrued;

    Solver12(double Principal,double InterestRate,int YearsInvested){
        Rate = InterestRate/100;
        Years = YearsInvested;
        Accrued = ((Math.round(100*(Principal*(1+(Rate*Years)))))/(double)(100));
    }
}