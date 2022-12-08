package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Keyboard;
import oop.library.ingenico.services.IngenicoKeyboard;

public class KeyboardAdapter implements Keyboard {
    private IngenicoKeyboard ingenicoKeyboard;

    public KeyboardAdapter() {
        this.ingenicoKeyboard = new IngenicoKeyboard();
    }

    @Override
    public String readLine() {
        return ingenicoKeyboard.readLine();
    }

    @Override
    public String getChar() {
        return ingenicoKeyboard.getChar();
    }
}
