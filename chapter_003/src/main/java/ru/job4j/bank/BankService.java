package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        this.users.entrySet()
                .stream()
                .filter(user -> passport.equals(user.getKey().getPassport()))
                .filter(acc -> !acc.getValue().contains(account))
                .findFirst()
                .ifPresent(x -> x.getValue().add(account));
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
        return this.findListRequisite(passport, requisite)
                .stream()
                .flatMap(List::stream)
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    public List<List<Account>> findListRequisite(String passport, String requisite) {
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