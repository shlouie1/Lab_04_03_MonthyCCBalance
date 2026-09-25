public class Main {
    static void main() {

        //intialized variables and set interest rate as a constant
        double creditBalance = 5000;
        final double INTEREST_RATE = 0.17;
        double creditOneMonth = 0;
        double creditTwoMonth = 0;

        //performed fake for loop to get balance of both months
        creditOneMonth = creditBalance + (creditBalance * INTEREST_RATE);
        creditTwoMonth = creditOneMonth + (creditOneMonth * INTEREST_RATE);

        //printed out results from both monts with sensible senctence
        System.out.println("Your interest rate is %" + (100 * INTEREST_RATE) + ". After 1 month your credit balance is $" + creditOneMonth);
        System.out.println("Your interest rate is %" + (100 * INTEREST_RATE) + ". After 2 months your credit balance is $" + creditTwoMonth);
    }
}
