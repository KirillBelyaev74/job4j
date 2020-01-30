package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!this.users.containsKey(user)) {
            this.users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        List<Account> result = this.users.get(this.findByPassport(passport));
        if (!result.contains(account)) {
            this.users.get(this.findByPassport(passport)).add(account);
        }
    }

    public User findByPassport(String passport) {
        User result = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
            }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = this.users.get(this.findByPassport(passport));
        Account result = null;
        for (Account acc : accounts) {
            if (acc.getRequisite().equals(requisite)) {
                result = acc;
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = this.findByRequisite(srcPassport, srcRequisite);
        Account destAccount = this.findByRequisite(destPassport, dеstRequisite);
        if (srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}