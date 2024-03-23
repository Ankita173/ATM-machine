package org.example;

import org.example.model.DebitCard;

public class ATMClient {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        DebitCard card = DebitCard.builder().cardNo("5522607003285651").validTill("12/1992").build();
        atm.state.insertCard(atm, card);
        atm.state.enterPin(atm, card, "2341");
        atm.state.changePinOption(atm);
        atm.state.enterNewPin(atm, card, "0990");
        atm.state.withdrawOption(atm);
        if(atm.state.withdrawAmount(atm, card, 1750))
            atm.state.dispenseCash(atm ,card, 1750);
        System.out.println(atm.state.checkBalanceOption(atm, card));
        atm.state.cancelTransactionOption(atm);
        atm.state.removeCard(atm);
    }
}
