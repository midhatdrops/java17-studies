package br.bytebank.test.java17bytebank.cards;

import br.bytebank.test.java17bytebank.accounts.Account;
import br.bytebank.test.java17bytebank.dto.Operation;

public sealed interface Card permits CreditCard, DebitCard{

     boolean operates(Operation operation);

}
