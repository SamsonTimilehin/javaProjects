package singleResponsibility;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("kola","21344321","savings",500.0);
        Account account2 = new Account("kola","21344321","savings",500.0);

        AccountRepository accountRepository = new AccountRepository();
        NotificationService notificationService = new NotificationService();

        //AccountService accountService = new AccountService();
        accountRepository.saveAccount(account1);
        accountRepository.saveAccount(account2);
        //accountService.openAccount(account1);
        notificationService.sendNotification();



    }
}
