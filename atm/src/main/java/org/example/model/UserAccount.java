package org.example.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAccount {
    int userId;
    int amount;
    DebitCard card;

    public void debitAmount(int amount) {
        this.amount -= amount;
    }
    public void creditAmount(int amount) {
        this.amount += amount;
    }
    public void setPin(String pin) {
        this.card.setPin(pin);
    }
}
