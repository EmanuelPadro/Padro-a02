package Solution15;

public class Solver15 {
    String Password = "abc$123";
    String Output;

    Solver15(String Input){
        if(Input.equals(Password)){
            Output = "Welcome ";
        }else{
            Output = "I don't know you bro";
        }
    }
}
