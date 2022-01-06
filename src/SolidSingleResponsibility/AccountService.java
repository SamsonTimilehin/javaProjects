package singleResponsibility;

public class AccountService {

   private  AccountRepository accountRepository = new AccountRepository();
   private NotificationService notificationService = new NotificationService();


    public void openAccount(Account account){
       // System.out.println("Opened account details: \n" + account);
        accountRepository.saveAccount(account);
        notificationService.sendNotification();
    }
}
