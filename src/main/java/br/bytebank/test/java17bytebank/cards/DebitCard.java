package br.bytebank.test.java17bytebank.cards;

import br.bytebank.test.java17bytebank.dto.Operation;

public final record DebitCard() implements Card{

    @Override
    public boolean operates(Operation operation) {
        try {
            operation.account().substract(operation.value());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
