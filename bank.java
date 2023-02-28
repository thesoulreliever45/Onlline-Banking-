import java.util.*;

class account {
    Scanner sc = new Scanner(System.in);
    String accno, accna;
    double bal;

    public account(String accno, String accna, double bal) {
        this.accno = accno;
        this.accna = accna;
        this.bal = bal;
    }

    public void accountd() {
        System.out.println("Your Account Number: " + accno);
        System.out.println("Your Name : " + accna);
    }

    public void balance() {
        System.out.println("Your Account Balance: " + bal);
    }

    public void deposit() {
        System.out.println("Enter the amount to be deposited");
        double amt = sc.nextDouble();
        bal = bal + amt;
        System.out.println("The Updsdated Balance:" + bal);
    }

    public void withdrawl() {
        System.out.println("Enter the amount to be deposited");
        double amt = sc.nextDouble();
        if (amt <= bal) {
            bal = bal - amt;
            System.out.println("The Updated Balance:" + bal);
        } else
            System.out.println("Insufficient Funds");
    }

}

class bank {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accno = sc.next();
        System.out.println("Enter the Account Holder Name");
        String accna = sc.next();
        System.out.println("Enter the Balance");
        double bal = sc.nextDouble();

        account b = new account(accno, accna, bal);

        System.out.println("Enter your Choice");
        System.out.println("1. Account Details");
        System.out.println("2. Balance Check");
        System.out.println("3. Deposit");
        System.out.println("4. Withdrawls");
        System.out.println("5. Exit");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                b.accountd();
                break;

            case 2:
                b.balance();
                break;

            case 3:
                b.deposit();
                break;

            case 4:
                b.withdrawl();
                break;

            case 5:
                System.out.println("Thank You for banking with us");
                System.exit(0);
        }

    }

}