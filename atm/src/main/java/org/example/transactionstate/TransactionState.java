package org.example.transactionstate;


import org.example.ATMMachine;
import org.example.model.DebitCard;

public interface TransactionState {
    void insertCard(ATMMachine machine, DebitCard card);
    boolean withdrawAmount(ATMMachine machine, DebitCard card, int amount);
    boolean enterNewPin(ATMMachine machine, DebitCard card, String pin);
    void withdrawOption(ATMMachine machine);
    void changePinOption(ATMMachine machine);
    float checkBalanceOption(ATMMachine machine, DebitCard card);
    void cancelTransactionOption(ATMMachine machine);
    boolean enterPin(ATMMachine machine, DebitCard card, String pin);
    boolean dispenseCash(ATMMachine machine, DebitCard card, int amount);
    void removeCard(ATMMachine machine);
}
 