package singleResponsibility;



public class NotificationService {

    private final AccountRepository accountRepository = new AccountRepository();

    public void sendNotification(){


        for (Account acc : accountRepository.getAccounts()) {
            System.out.println("Account for"+ acc.getName() + "has been successfully opened");
        }

    }
}
