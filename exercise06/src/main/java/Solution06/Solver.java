package Solution06;

import java.util.Calendar;

//Generalist class that will take input and perform operations so app can display and take care of other functions
public class Solver {
        int YearsToRetire;
        int RetireYear;
        int CurrentYear;

    Solver(int CurrentAge, int RetireAge){
        CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
        YearsToRetire = RetireAge - CurrentAge;
        RetireYear = YearsToRetire + CurrentYear;
    }

}
