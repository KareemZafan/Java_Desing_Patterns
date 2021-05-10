package design_patterns.abstract_factory;

import javax.xml.validation.Validator;

public class VisualFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
