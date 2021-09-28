package Solution11;

public class Solver11 {
    double euros;
    double rate;
    double dollars;

    Solver11(double var1, double var2){
        euros = var1;
        rate = var2;
        //Multiplies number by 100 then get int to remove extra decimals and convert back to double
        dollars = ((int)(100*euros*rate))/(double)100;
    }
}
