package org.example;

import org.example.command.Command;
import org.example.command.DepositCommand;
import org.example.command.TransferCommand;
import org.example.command.WithdrawCommand;
import org.example.invoker.TransactionProcessor;
import org.example.receiver.BankAccount;

public class Main {
    public static void main(String[] args) {

                // Create bank accounts
                BankAccount account1 = new BankAccount("12345", 1000);
                BankAccount account2 = new BankAccount("67890", 500);

                // Create commands
                Command depositCommand = new DepositCommand(account1, 200);
                Command withdrawCommand = new WithdrawCommand(account1, 150);
                Command transferCommand = new TransferCommand(account1, account2, 100);

                // Create an invoker (Transaction Processor)
                TransactionProcessor processor = new TransactionProcessor();

                // Execute deposit
                System.out.println("Executing Deposit Command:");
                processor.setCommand(depositCommand);
                processor.executeCommand();

                // Execute withdrawal
                System.out.println("\nExecuting Withdraw Command:");
                processor.setCommand(withdrawCommand);
                processor.executeCommand();

                // Execute transfer
                System.out.println("\nExecuting Transfer Command:");
                processor.setCommand(transferCommand);
                processor.executeCommand();


    }
}