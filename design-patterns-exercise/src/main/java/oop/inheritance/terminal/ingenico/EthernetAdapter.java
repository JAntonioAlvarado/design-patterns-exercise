package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Ethernet;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.ingenico.services.IngenicoEthernet;

public class EthernetAdapter implements Ethernet {
    private IngenicoEthernet ingenicoEthernet;

    public EthernetAdapter() {
        this.ingenicoEthernet = new IngenicoEthernet();
    }

    @Override
    public void open() {
        ingenicoEthernet.open();
    }

    @Override
    public void send(Transaction transaction) {
        ingenicoEthernet.send(transaction);
    }

    @Override
    public TransactionResponse receive() {
        return ingenicoEthernet.receive();
    }

    @Override
    public void close() {
        ingenicoEthernet.close();
    }
}
