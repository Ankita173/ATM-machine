package org.example.amountdispense;

public interface AmountHandler {
    void addNotes(int count);
    int getNotesCount();
    boolean useNotes(int amount);
}
