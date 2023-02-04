package br.bytebank.test.java17bytebank;

import br.bytebank.test.java17bytebank.accounts.Account;
import br.bytebank.test.java17bytebank.cards.Card;
import br.bytebank.test.java17bytebank.cards.CreditCard;
import br.bytebank.test.java17bytebank.cards.DebitCard;
import br.bytebank.test.java17bytebank.vendorMachine.VendorMachine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Java17BytebankApplication {

	public static void main(String[] args) {

		final Account account = new Account("01", "01", BigDecimal.valueOf(Double.parseDouble("1000")), List.of(new CreditCard("2"), new DebitCard()));
		final VendorMachine vendorMachine = new VendorMachine();
		vendorMachine.debitOperation(account,"100");

		System.out.println(account.getBalance());

		vendorMachine.creditOperation(account,"100");

		System.out.println(account.getBalance());
	}

}
