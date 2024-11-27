package org.example.command;

import org.example.receiver.BankAccount;

public class WithdrawCommand implements Command {

    private BankAccount bankAccount;
    private double amount;

    public WithdrawCommand(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(amount);
    }
}
