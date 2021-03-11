package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.print("Enter a radius: ");
        double userDouble = input.getDouble();
        Circle circle = new Circle(userDouble);

    }

}
