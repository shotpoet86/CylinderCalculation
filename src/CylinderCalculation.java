/*Programmer - Austin Parker
 * Purpose - Calculates base surface area and total volume of a cylinder*/

import java.util.Scanner;
import java.lang.Math;

public class CylinderCalculation {
    public static void main(String[] args) {

        /*stores results of methods to variables*/
        float radius = getRadius();
        float height = getHeight();

        /*calculates input*/
        float totalArea = (float) (radius * radius * Math.PI);
        float totalVolume = totalArea * height;

        /*prints message to user*/
        System.out.println("Base surface area is: " + totalArea +
                "\nTotal volume is: " + totalVolume);
    }

    /*method asks user for radius of cylinder, then returns input.*/
    private static Float getRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        return Float.parseFloat(scanner.nextLine());
    }

    /*method asks user for height of cylinder, then returns input.*/
    private static Float getHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of cylinder: ");
        return Float.parseFloat(scanner.nextLine());
    }

}
