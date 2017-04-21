/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import Package.DebtClear;

import java.util.Scanner;

/**
 *
 * @author Monish De
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DebtClear dc = new DebtClear();
        BankApplication application = new BankApplication();
        System.out.println("Enter Balance ");
        application.setBalance(sc.nextDouble());
        System.out.println("Enter Time ");
        application.setTime(sc.nextInt());
        System.out.println("Enter Minimum monthly Payment Rate ");
        application.setMinimumMonthlyPaymentRate(sc.nextDouble());
        System.out.println("Enter Annual Interest Rate ");
        application.setAnnualInterestRate(sc.nextDouble());
        System.out.println("Enter Choice ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int month = 0;
                while (application.getTime() != 0) {
                    month++;
                    application.creditCardDebt();
                    System.out.println("Month " + month
                            + " Minimum Payment " + application.getMinimumMonthlyPayment()
                            + " Unpaid Balance " + application.getUnpaidBalnce()
                            + " Interset Made " + application.getInterest());
                    if (month % 12 == 0) {
                        System.out.println("Total Paid " + application.getTotal());
                        System.out.println("Remaining Balnce " + application.getBalance());
                    }
                    application.time = application.getTime() - 1;

                }
                break;
            case 2:
                double money = dc.payInAYear(10.0, application);
                System.out.println("Balance " + money);
                break;
                
        }
// TODO code application logic here
    }

}
