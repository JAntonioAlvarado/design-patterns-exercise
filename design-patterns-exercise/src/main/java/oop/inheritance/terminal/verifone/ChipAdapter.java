package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.ChipReader;
import oop.library.verifone.model.Card;
import oop.library.v240m.VerifoneV240mChipReader;

public class ChipAdapter implements ChipReader {
    private VerifoneV240mChipReader verifoneV240mChipReader;

    public ChipAdapter() {
        this.verifoneV240mChipReader = new VerifoneV240mChipReader();
    }

    @Override
    public Card readCard() {
        return verifoneV240mChipReader.readCard();
    }
}
