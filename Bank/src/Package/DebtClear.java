/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;
import bank.*;

/**
 *
 * @author Monish De
 */
public class DebtClear extends BankApplication{
    
    public double payInAYear(double rate, BankApplication application){
       for (int trial = 1; trial < 12; ++trial) {
           application.setUnpaidBalnce(application.getBalance() - getMinimumMonthlyPaymentRate());
           application.setInterest((application.getAnnualInterestRate()/1200) * application.getUnpaidBalnce());
           application.setBalance(application.getUnpaidBalnce() + application.getInterest());
         }
        return application.getBalance();
    }
}
