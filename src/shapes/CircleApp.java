package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        System.out.print("Enter a radius: ");
        double userDouble = Input.getDouble();
        Circle circle = new Circle(userDouble);

    }

}
