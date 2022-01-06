package SolidSingleResponsibility;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {

  private final List<Account> accounts = new ArrayList<>();

    public void saveAccount(Account accountObj){
        accounts.add(accountObj);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
