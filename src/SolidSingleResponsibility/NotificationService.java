package SolidSingleResponsibility;



public class NotificationService {



    public void sendNotification(){
        AccountRepository accountRepository = new AccountRepository();

        for (Account acc : accountRepository.getAccounts()) {
            System.out.println("Account for"+ acc.getName() + "has been successfully opened");
        }

    }
}
