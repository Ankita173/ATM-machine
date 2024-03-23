package org.example.transactionstate;

import org.example.ATMMachine;
import org.example.Exception.OperationNotSupported;
import org.example.model.DebitCard;
import org.example.model.UserAccount;

public class OptionState implements TransactionState {

    public OptionState() {
        System.out.println("Please select the option \n1. Withdraw amount\n2. Change PIN\n3.Check Balance\n4. Cancel");
    }

    @Override
    public void insertCard(ATMMachine machine, DebitCard card) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public boolean withdrawAmount(ATMMachine machine, DebitCard card, int amount) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public boolean enterNewPin(ATMMachine machine, DebitCard card, String pin) {
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
    }

    @Override
    public void withdrawOption(ATMMachine machine) {
        System.out.println("Withdrawl amount option selected");
        machine.setState(new WithdrawState());
    }

    @Override
    public void changePinOption(ATMMachine machine) {
        System.out.println("Pin change option selected");
        machine.setState(new PinChangeState());
    }

    @Override
    public float checkBalanceOption(ATMMachine machine, DebitCard card) {
        System.out.println("Check balance option selected");
        UserAccount account = machine.getUserAccount(card);
        return account.getAmount();
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
