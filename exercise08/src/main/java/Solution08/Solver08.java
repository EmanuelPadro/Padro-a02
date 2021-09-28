package Solution08;

public class Solver08 {
    int SlicesTotal;
    int SlicesPerPerson;
    int SlicesLeftover;
    int People;
    int Pizzas;

    Solver08(int Ppl, int Pizz, int SlicesPerPizza){
        People = Ppl;
        Pizzas = Pizz;
        SlicesTotal = Pizzas * SlicesPerPizza;
        SlicesPerPerson = (int) Math.floor((double) SlicesTotal / People);
        SlicesLeftover = (int) Math.floor(SlicesTotal - (SlicesPerPerson*People));
    }
}
