package br.bytebank.test.java17bytebank.cards;

import br.bytebank.test.java17bytebank.accounts.Account;
import br.bytebank.test.java17bytebank.dto.Operation;

public final record CreditCard(String tax) implements Card {

    @Override
    public boolean operates(Operation operation) {
        final double finalValue = Double.parseDouble(operation.value()) * Double.parseDouble(tax);
        try {
            operation.account().substract(Double.toString(finalValue));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
