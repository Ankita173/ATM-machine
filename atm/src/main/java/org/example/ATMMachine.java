package org.example;

import org.example.amountdispense.AmountHandler;
import org.example.amountdispense.Fifty;
import org.example.amountdispense.FiveHundred;
import org.example.amountdispense.OneHundred;
import org.example.model.DebitCard;
import org.example.model.UserAccount;
import lombok.Data;
import org.example.transactionstate.TransactionState;
import org.example.transactionstate.WelcomeState;

import java.util.HashMap;
import java.util.Map;

@Data
public class ATMMachine {

    Map<String, Integer> debitUsers;
    Map<Integer, UserAccount> account;
    TransactionState state;
    AmountHandler amountHandler;

    ATMMachine() {
        debitUsers = new HashMap<>();
        debitUsers.put("5522607003285651", 123);
        debitUsers.put("4422607003285651", 124);
        debitUsers.put("3322607003285651", 125);;
        account = new HashMap<>();
        account.put(123, UserAccount.builder()
                .userId(123)
                .amount(2000)
                .card(DebitCard.builder().cardNo("5522607003285651").validTill("12/1992").pin("2341").build()).build());
        account.put(124, UserAccount.builder()
                .userId(124)
                .amount(3000)
                .card(DebitCard.builder().cardNo("4422607003285651").validTill("12/1994").pin("5342").build()).build());
        account.put(125, UserAccount.builder()
                .userId(125)
                .amount(4000)
                .card(DebitCard.builder().cardNo("3322607003285651").validTill("12/1992").pin("6343").build()).build());
        state = new WelcomeState();


        amountHandler = new FiveHundred(20, new OneHundred(30, new Fifty(40, null)));
    }

    public UserAccount getUserAccount(DebitCard card) {
        return this.getAccount().get(this.getDebitUsers().get(card.getCardNo()));
    }


}
