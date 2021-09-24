package exercise26.baseline;

public class PaymentCalculator {

    double currentBalance;
    double aprPercentage;
    double monthlyPayment;


    public PaymentCalculator(double currentBalance, double aprPercentage, double monthlyPayment) {
       this.currentBalance = currentBalance;
       this.aprPercentage = aprPercentage;
       this.monthlyPayment = monthlyPayment;
    }

    public int calculateMonthsUntilPaidOff(){
        //return number of months
        /*
         * The formula for this is
         * n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
         *
         * where
         * n is the number of months.
         * i is the daily rate (APR divided by 365). **be sure to divide apr % by 100 to get it as decimal.**
         * b is the balance.
         * p is the monthly payment.
         */

        int months = 0;
        double answer = 0;

        answer = Math.ceil(-(1/30.0) * Math.log(1 + (currentBalance/monthlyPayment)
                    * (1 - Math.pow((1 + ((aprPercentage/100)/365)), 30))) / Math.log(1 + ((aprPercentage/100)/365)));

        months = (int)answer;

        return months;

    }
}
