package portfolio;
import java.util.Scanner;

public class VariableAndDataTypes {

    public String name;
    public int age;
    public float height;
    public boolean isOver18;

    public VariableAndDataTypes(String name, int age, float height, boolean isOver18){
        this.name = name;
        this.age = age;
        this.height = height;
        this.isOver18 = isOver18;
    }


    @Override
    public String toString() {
        return String.format(
                "\nName: %s\nAge: %d\nHeight: %.2f\nOver 18? %b",
                name, age, height, isOver18
        );
    }


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Height: ");
            float height = scanner.nextFloat();

            // Determine if the user is over 18
            boolean isOver18 = age > 18;

            VariableAndDataTypes user = new VariableAndDataTypes(name, age, height, isOver18);

            System.out.println(user);
        }
    }
}
