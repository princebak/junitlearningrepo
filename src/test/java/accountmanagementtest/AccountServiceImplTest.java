package accountmanagementtest;
import static org.junit.Assert.*;

import accountmanagement.entities.Account;
import accountmanagement.implementations.AccountServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class AccountServiceImplTest {

    AccountServiceImpl accountService = new AccountServiceImpl();

    @Test
    public void testCreateNewAccount() {
        Account newAccount = new Account();
        newAccount.setName("Alvin Reyes");
        newAccount.setDescription("This is the description");
        Account newAccountInserted = accountService.createNewAccount(newAccount);
        assertThat(newAccount, isA(Account.class));
        assertEquals(newAccount.getName(), newAccountInserted.getName());
    }

    @Test
    public void testUpdateAccount() {
        Account oldAccount = new Account();
        oldAccount.setName("Alvin Reyes");
        oldAccount.setDescription("This is the description");
        String name = oldAccount.getName();
        Account expectedAccountObj = new Account();
        expectedAccountObj = accountService.updateAccount(oldAccount);
        oldAccount.setName("Alvin Meyes");
        assertThat(expectedAccountObj, isA(Account.class));
        assertNotEquals(name, expectedAccountObj.getName());//false expected but true got
    }

    @Test
    public void testRemoveAccount() {
        Account toBeRemovedAccount = new Account();
        toBeRemovedAccount.setName("Alvin Reyes");
        toBeRemovedAccount.setDescription("This is the description");

        assertTrue(accountService.removeAccount(toBeRemovedAccount));
    }

    @Test
    public void testListAllTransactions() {
        Account account = new Account();
        account.setName("Alvin Reyes");
        accountService.listAllTransactions(account);
        assertTrue(accountService.listAllTransactions(account).size() > 1);
    }
}
