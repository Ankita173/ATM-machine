package org.example.transactionstate;

import org.example.ATMMachine;
import org.example.Exception.OperationNotSupported;
import org.example.model.DebitCard;
import org.example.model.UserAccount;

public class PinChangeState  implements TransactionState {
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
        UserAccount account = machine.getUserAccount(card);
        try {
            if (account != null) {
                account.setPin(pin);
                System.out.println("Pin changed successfully!");
                return true;
            }
            System.out.println("Pin couldn't be changed!");
            return false;
        } finally {
            machine.setState(new OptionState());
        }
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
