package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        if(user != null) {
            if(!this.users.get(user).contains(account)) {
                this.users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        return this.findListPassport(passport)
                .stream()
                .findFirst()
                .orElse(null);
    }

    public List<User> findListPassport(String passport) {
        return this.users.entrySet()
                .stream()
                .filter(x -> x.getKey().getPassport().equals(passport))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public Account findByRequisite(String passport, String requisite) {
        return this.findListRequisite(passport)
                .stream()
                .flatMap(List::stream)
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    public List<List<Account>> findListRequisite(String passport) {
        return this.users.entrySet()
                .stream()
                .filter(x -> x.getKey().getPassport().equals(passport))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = this.findByRequisite(srcPassport, srcRequisite);
        Account destAccount = this.findByRequisite(destPassport, dеstRequisite);
        if (srcAccount != null && destAccount != null) {
            rsl = srcAccount.transferMoney(destAccount, amount);
        }
        return rsl;
    }
}