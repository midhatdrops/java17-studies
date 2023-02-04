package br.bytebank.test.java17bytebank.vendorMachine;

import br.bytebank.test.java17bytebank.accounts.Account;
import br.bytebank.test.java17bytebank.dto.Operation;

public record VendorMachine() {


    public void debitOperation(Account account, String value) {
        final Operation operation = new Operation(account, value);
        account.getCardOfType("D").operates(operation);
    }

    public void creditOperation(Account account, String value) {
        final Operation operation = new Operation(account, value);
         account.getCardOfType("C").operates(operation);
    }



}
