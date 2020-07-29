/*   Created by IntelliJ IDEA.
 *   Author: Karan Mishra
 *   Date: 29-07-2020
 *   Time: 13:47
 *   File: Lab3Task.java
 */
package course.lab.labTasks;

import java.util.Scanner;

public class Lab3Task {
    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String clientInputDiscountCode = scannerObject.nextLine();
        scannerObject.close();
        clientInputDiscountCode = clientInputDiscountCode.trim();
        if (clientInputDiscountCode.isEmpty())
            System.out.println("The coupon code cannot be blank or empty");
        else if (clientInputDiscountCode.toUpperCase().equals(DISCOUNT_CODE.toUpperCase()))
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
    }
}