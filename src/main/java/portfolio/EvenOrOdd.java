package portfolio;

public class EvenOrOdd {

    public String isEven(int number){

        if (number % 2 == 0) return "Even";
        return "odd";
    }

    public static void main(String[] args){
        EvenOrOdd isEven = new EvenOrOdd();
        System.out.println(isEven.isEven(5));
    }
}
