package test_dpatterns;

import design_patterns.abstract_factory.CardType;
import design_patterns.abstract_factory.CreditCard;
import design_patterns.abstract_factory.CreditCardFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM) ;

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600) ;
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD) ;
        System.out.println(card.getClass());
    }
}
