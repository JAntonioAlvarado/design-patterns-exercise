package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.Modem;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.v240m.VerifoneV240mModem;

public class ModemAdapter implements Modem {
    private VerifoneV240mModem verifoneV240mModem;

    public ModemAdapter(){
        this.verifoneV240mModem = new VerifoneV240mModem();
    }

    @Override
    public void open() {
        verifoneV240mModem.open();
    }

    @Override
    public void send(Transaction transaction) {
        verifoneV240mModem.send(transaction);
    }

    @Override
    public TransactionResponse receive() {
        return verifoneV240mModem.receive();
    }

    @Override
    public void close() {
        verifoneV240mModem.close();
    }
}
