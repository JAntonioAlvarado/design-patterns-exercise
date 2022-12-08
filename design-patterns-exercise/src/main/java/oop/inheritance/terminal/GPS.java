package oop.inheritance.terminal;

import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;

public interface GPS {
    void open();

    TransactionResponse receive();

    void send(Transaction transaction);

    void close();
}
