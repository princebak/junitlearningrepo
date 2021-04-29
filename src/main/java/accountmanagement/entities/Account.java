package accountmanagement.entities;

import java.util.List;

public class Account {
    String name;
    String description;
    List<Transaction> transactions;

    public Account() {
    }

    public Account(String name, String description, List<Transaction> transactions) {
        this.name = name;
        this.description = description;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
