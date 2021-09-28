package Solution17;

public class Solver17 {
    double BAC;
    String Output;


    Solver17(int genderInput,double ounces,int weight,int hours){
        double ADR;
        if(genderInput == 1){
            ADR = 0.73;
        }else{
            ADR = 0.66;
        }
        BAC = (ounces * 5.14/weight * ADR) - 0.015 * hours;
        Output = BAC > 0.08
                ? "It is illegal for you to drive"
                : "It is legal for you to drive";
    }
}
