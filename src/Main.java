import hu.helixlab.tb.Rectangle;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Double.sum;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 =
                new Rectangle(10.2,30.1,"Blue");


        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Color: " + rectangle2.getColor());

        rectangle1.setLength(5.9);
        rectangle1.setWidth(6);
        rectangle1.setColor("Red");

        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Color: " + rectangle1.getColor());




        /**int number = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Next number:");
        number = scanner.nextInt();

        System.out.println("Number - " + number);*/

        /**Random random = new Random();
        int randomNumber = random.nextInt();

        System.out.println("random number: " + randomNumber);*/

        /**System.out.println(Math.abs(10.0));*/

        System.out.println(Math.sum(2,5));
        System.out.println(Math.multiplication(2,5));
        System.out.println(Math.substraction(2,5));
        System.out.println(Math.dividing(2,5));
    }



}
