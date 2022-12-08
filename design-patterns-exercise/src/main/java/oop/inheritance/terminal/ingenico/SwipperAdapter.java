package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.CardSwipper;
import oop.library.ingenico.services.IngenicoCardSwipper;
import oop.library.ingenico.model.Card;

public class SwipperAdapter implements CardSwipper {
    private IngenicoCardSwipper ingenicoCardSwipper;

    public SwipperAdapter() {
        this.ingenicoCardSwipper = new IngenicoCardSwipper();
    }

    @Override
    public Card readCard() {
        return ingenicoCardSwipper.readCard();
    }
}
