package SolidSingleResponsibility;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("kola","21344321","savings",500.0);
        Account account2 = new Account("John","21347891","current",0.0);

        AccountRepository accountRepository = new AccountRepository();
        accountRepository.saveAccount(account1);
        accountRepository.saveAccount(account2);
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification();
        //AccountService accountService = new AccountService();

        //accountService.openAccount(account1);




    }
}
