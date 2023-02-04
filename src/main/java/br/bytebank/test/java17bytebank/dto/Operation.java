package br.bytebank.test.java17bytebank.dto;

import br.bytebank.test.java17bytebank.accounts.Account;

public record Operation(Account account, String value) {


}
