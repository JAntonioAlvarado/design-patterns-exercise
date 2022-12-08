package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.*;

public class Verifone240TerminalFactory extends TerminalFactory {
    @Override
    public Ethernet getEthernet() {
        return new EthernetAdapter();
    }

    @Override
    public Printer getPrinter() {
        return new PrinterAdapter();
    }

    @Override
    public Display getDisplay() {
        return new DisplayAdapter();
    }

    @Override
    public Keyboard getKeyboard() {
        return new KeyboardAdapter();
    }

    @Override
    public CardSwipper getSwipper() {
        return new SwipperAdapter();
    }

    @Override
    public ChipReader getChipReader() {
        return new ChipAdapter();
    }

    @Override
    public Modem getModem() {
        return new ModemAdapter();
    }

    @Override
    public GPS getGPS() {
        return new GPSAdapter();
    }
}
