package Solution09;

public class Solver09 {
    int SquareFeet;
    int Gallons;
    int SquareFeetPerGallon = 350;

    Solver09(int length, int width){
        SquareFeet = length * width;
        Gallons = (int) Math.ceil((double) SquareFeet / SquareFeetPerGallon);
    }

}
