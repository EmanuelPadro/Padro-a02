package Solution19;

public class Solver19 {
    double Height;
    double Weight;
    double BMI;


    Solver19(double InputHeight, double InputWeight){
        Height = InputHeight;
        Weight = InputWeight;

        BMI = Math.round(((Weight / (Height*Height)) * 703)*100)/(double) 100;
    }
}
