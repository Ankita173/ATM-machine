package org.example.amountdispense;

public class OneHundred implements AmountHandler {
    int count;
    final int value = 100;
    AmountHandler nextHandler;

    public OneHundred(int count, AmountHandler nextHandler) {
        this.count = count;
        this.nextHandler = nextHandler;
    }

    @Override
    public void addNotes(int count) {
        this.count += count;
    }

    @Override
    public int getNotesCount() {
        return this.count;
    }

    @Override
    public boolean useNotes(int amount) {
        if (amount >= this.value && this.count > 0) {
            int req = amount / value;
            if (req <= count) {
                this.count -= req;
                amount -= value * req;
            } else {
                amount -= value * count;
                count = 0;
            }
            System.out.println("Used "+req+" notes of "+value);
        }
        if (amount == 0)
            return true;
        if (nextHandler != null)
            return nextHandler.useNotes(amount);
        return false;
    }
}
