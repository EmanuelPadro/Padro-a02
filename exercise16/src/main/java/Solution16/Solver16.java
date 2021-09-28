package Solution16;

public class Solver16 {
    String Output;

    Solver16(int Age){
        Output = Age > 16
                ? "You are old enough to legally drive"
                : "You are not old enough to legally drive";
    }
}
