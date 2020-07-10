package Exception_Handling.CustomException;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
