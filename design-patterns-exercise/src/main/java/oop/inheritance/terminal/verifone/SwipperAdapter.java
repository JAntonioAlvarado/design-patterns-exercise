package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.CardSwipper;

import oop.library.verifone.model.Card;
import oop.library.v240m.VerifoneV240mCardSwipper;

public class SwipperAdapter implements CardSwipper {
    private VerifoneV240mCardSwipper verifoneV240mCardSwipper = new VerifoneV240mCardSwipper();

    public SwipperAdapter() {
        this.verifoneV240mCardSwipper = new VerifoneV240mCardSwipper();
    }

    @Override
    public Card readCard() {
        return verifoneV240mCardSwipper.readCard();
    }
}
