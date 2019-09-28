
package heightestimation;

import java.util.Scanner;

/**
 *
 * author: Shahed A. Abedalwahab 
 * Date: 28/9/2019 
 * The adult height estimation of a child
 */
public class HeightEstimation {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do {

            System.out.println("Please enter your gender, type \"f\" for female, \"m\" for male :)");
            String gender = input.next();
            System.out.println("Please enter your mother height>>");
            int h1 = input.nextInt();
            System.out.println("enter the unit, type \"in\" for inch or \"ft\" for feet>>");
            String u1 = input.next();
            System.out.println("Please enter your father height>>");
            int h2 = input.nextInt();
            System.out.println("enter the unit, type \"in\" for inch or \"ft\" for feet>>");
            String u2 = input.next();
            if (gender.equalsIgnoreCase("m")) {
                int h = ((h1 * 12 / 13) + h2) / 2;
                if (u1.equalsIgnoreCase("in") && u1.equalsIgnoreCase("in")) {
                    System.out.println("the adult height in inch " + h + "in");
                    System.out.println("the adult height in feet " + (h / 12) + "ft");
                }
                /////////////////////////////////////////////////////////////

                if (u1.equalsIgnoreCase("in") && u1.equalsIgnoreCase("ft")) {
                    h2 = h2 * 12;
                    System.out.println("the adult height in inch " + h + "in");
                    System.out.println("the adult height in feet " + (h / 12) + "ft");
                }
                if (u1.equalsIgnoreCase("ft") && u1.equalsIgnoreCase("in")) {
                    h1 = h1 * 12;
                    System.out.println("the adult height in inch " + h + "in");
                    System.out.println("the adult height in feet " + (h / 12) + "ft");
                }

            } /////////////////////////////////////
            else if (gender.equalsIgnoreCase("f")) {
                int h = ((h2 * 12 / 13) + h1) / 2;
                if (u1.equalsIgnoreCase("in") && u1.equalsIgnoreCase("in")) {
                    System.out.println("the adult height in inch " + h + "in");
                    System.out.println("the adult height in feet " + (h / 12) + "ft");
                }
                /////////////////////////////////////////////////////////////

                if (u1.equalsIgnoreCase("in") && u1.equalsIgnoreCase("ft")) {
                    h2 = h2 * 12;
                    System.out.println("the adult height in inch " + h + "in");
                    System.out.println("the adult height in feet " + (h / 12) + "ft");
                }
                if (u1.equalsIgnoreCase("ft") && u1.equalsIgnoreCase("in")) {
                    h1 = h1 * 12;
                    System.out.println("the adult height in inch " + h + "in");
                    System.out.println("the adult height in feet " + (h / 12) + "ft");
                }
            }
            System.out.println("exite? type \"y\" for yes or\"n\" for no? ");
            String answer = input.next();
            if (answer.equalsIgnoreCase("y")) {
                flag = false;
            } else if (answer.equalsIgnoreCase("n")) {
                flag = true;
            }

        } while (flag == true);

    }

}