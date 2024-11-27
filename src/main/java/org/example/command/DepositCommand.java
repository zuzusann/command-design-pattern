package org.example.command;

import org.example.receiver.BankAccount;

public class DepositCommand implements Command {

        private BankAccount bankAccount;
        private double amount;

        public DepositCommand(BankAccount bankAccount, double amount) {
            this.bankAccount = bankAccount;
            this.amount = amount;
        }

        @Override
        public void execute() {
            bankAccount.deposit(amount);
        }


}
