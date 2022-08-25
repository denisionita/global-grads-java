package task2;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAmount(100);
        a1.deposit(22);
        System.out.println(a1.getAmount());

        try {
            a1.withdraw(50);
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        System.out.println(a1.getAmount());
        try {
            a1.withdraw(100);
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        System.out.println(a1.getAmount());

        try {
            a1.linkToNationalId(1312);
        } catch (InvalidNationalIdException e) {
            e.printStackTrace();
        }

        a1.setAccountNo("A12ADA233");
        a1.setNationalId(1234567890);

        System.out.println(a1);
    }

}
