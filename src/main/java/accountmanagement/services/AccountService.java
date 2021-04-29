package accountmanagement.services;

import accountmanagement.entities.Account;

import java.util.List;

public interface AccountService {
   Account createNewAccount(Account account);
   Account updateAccount(Account account);
   boolean removeAccount(Account account);
   List<Account> listAllTransactions(Account account);
}
