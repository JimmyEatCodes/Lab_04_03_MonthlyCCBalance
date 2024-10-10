public class Main {



    public static void main(String[] args) {

        System.out.println("Welcome! These are your outstanding credit card balances.");

        double startBalance = 5000;
        double interest = 1.17;
        double monthOneBalance = startBalance * interest;
        double monthTwoBalance = monthOneBalance * interest;

        System.out.println("The starting balance of the credit card is $5000, the total balance with interest after one month is $" + monthOneBalance + ", the total balance with interest after two months is $" + monthTwoBalance);





    }
}