/*
 * Andrew Thompson
 * September 18, 2018
 * This program calculates net pay
 */

package netpay;

/**
 *
 * @author antho6229
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hours = 40;
        double wage = 5.00;
        double insurance = 2.00;
        double tax = 0.22;
        double net = (hours*wage-insurance)-tax*(hours*wage-insurance);
        System.out.println("The net pay is " + net + " dollars.");
    }
    
}
