package br.bytebank.test.java17bytebank.accounts;

import br.bytebank.test.java17bytebank.cards.Card;
import br.bytebank.test.java17bytebank.cards.CreditCard;
import br.bytebank.test.java17bytebank.cards.DebitCard;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
public class Account {

    private final String number;
    private final String branch;
    private BigDecimal balance;
    private List<Card> cards;

    public void substract(String value) {
        try {
            this.balance = this.balance.subtract(BigDecimal.valueOf(Double.parseDouble(value)));
        } catch (Exception e) {
            e.printStackTrace();
            throw  e;
        }
    }

    public Card getCardOfType(String type) {
        Card returnCard = null;
        switch (type) {
            case "D", "C" -> {
                for(Card card : getCards()) {
                    if(card instanceof DebitCard that) {
                        returnCard = that ;
                        break;
                    } else if (card instanceof CreditCard that ) {
                         returnCard = that;
                         break;
                    }
                }
            }
        }

        return returnCard;
    }


}
