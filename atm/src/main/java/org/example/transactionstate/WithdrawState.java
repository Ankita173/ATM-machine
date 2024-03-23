package org.example.transactionstate;

import org.example.ATMMachine;
import org.example.Exception.OperationNotSupported;
import org.example.model.DebitCard;
import org.example.model.UserAccount;

public class WithdrawState implements TransactionState {
    @Override
    public void insertCard(ATMMachine machine, DebitCard card) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public boolean withdrawAmount(ATMMachine machine, DebitCard card, int amount) {
        UserAccount account = machine.getUserAccount(card);
        System.out.println("Transaction validated for amount "+amount);
        if(account.getAmount() >= amount) {
            account.debitAmount(amount);
            machine.setState(new AmountDispenseState());
            return true;
        }
        System.out.println("Insufficient balance in account");
        machine.setState(new OptionState());
        return false;
    }

    @Override
    public boolean enterNewPin(ATMMachine machine, DebitCard card, String pin) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public void withdrawOption(ATMMachine machine) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public void changePinOption(ATMMachine machine) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public float checkBalanceOption(ATMMachine machine, DebitCard card) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public void cancelTransactionOption(ATMMachine machine) {
        System.out.println("User cancel the transaction");
        machine.setState(new CancelState());
    }

    @Override
    public boolean enterPin(ATMMachine machine, DebitCard card, String pin) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public boolean dispenseCash(ATMMachine machine, DebitCard card, int amount) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public void removeCard(ATMMachine machine) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }
}
