package org.example.transactionstate;

import org.example.ATMMachine;
import org.example.Exception.OperationNotSupported;
import org.example.model.DebitCard;
public class WelcomeState implements TransactionState {

    public WelcomeState() {
        System.out.println("Please insert your card!");
    }

    @Override
    public void insertCard(ATMMachine machine, DebitCard card) {
        if(card == null ||
            card.getCardNo().length() != 16 ||
            card.getValidTill().matches("(0-9)(0-9)/(0-9)(0-9)(0-9)(0-9)")) {
            System.out.println("Invalid Card");
        }
        machine.setState(new PinState());
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
        System.out.println("Operation Not Supported here");
        throw new OperationNotSupported("Operation Not Supported here");
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
