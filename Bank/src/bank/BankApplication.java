/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Monish De
 */
public class BankApplication {

    private double balance;
    private double minimumMonthlyPaymentRate;
    private double minimumMonthlyPayment;
    private double unpaidBalnce;
    private double interest;
    private double annualInterestRate;
    int time;
    private double total;

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the minimumMonthlyPaymentRate
     */
    public double getMinimumMonthlyPaymentRate() {
        return minimumMonthlyPaymentRate;
    }

    /**
     * @param minimumMonthlyPaymentRate the minimumMonthlyPaymentRate to set
     */
    public void setMinimumMonthlyPaymentRate(double minimumMonthlyPaymentRate) {
        this.minimumMonthlyPaymentRate = minimumMonthlyPaymentRate;
    }

    /**
     * @return the minimumMonthlyPayment
     */
    public double getMinimumMonthlyPayment() {
        return minimumMonthlyPayment;
    }

    /**
     * @param minimumMonthlyPayment the minimumMonthlyPayment to set
     */
    public void setMinimumMonthlyPayment(double minimumMonthlyPayment) {
        this.minimumMonthlyPayment = minimumMonthlyPayment;
    }

    /**
     * @return the unpaidBalnce
     */
    public double getUnpaidBalnce() {
        return unpaidBalnce;
    }

    /**
     * @param unpaidBalnce the unpaidBalnce to set
     */
    public void setUnpaidBalnce(double unpaidBalnce) {
        this.unpaidBalnce = unpaidBalnce;
    }

    /**
     * @return the interest
     */
    public double getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     * @return the annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @param annualInterestRate the annualInterestRate to set
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    public void creditCardDebt() {
        minimumMonthlyPayment = balance * (minimumMonthlyPaymentRate / 100);
        total += minimumMonthlyPayment;
        unpaidBalnce = balance - minimumMonthlyPayment;
        interest = (annualInterestRate / 1200) * unpaidBalnce;
        balance = unpaidBalnce + interest;
    }
}
