package Solution07;

public class Solver07 {
    double AreaFeet;
    double AreaMeters;

    Solver07(double length, double width){
        AreaFeet = length * width;
        AreaMeters = AreaFeet * 0.09290304;
    }
}
