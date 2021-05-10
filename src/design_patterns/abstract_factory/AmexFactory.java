package design_patterns.abstract_factory;

import javax.xml.validation.Validator;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD: return  new AmexGoldCreditCard() ;
            case PLATINUM: return  new PlatinumCreditCard() ;

            default: break;
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD ->{ return new AmexGoldValidator() ;}
            case PLATINUM ->{ return new AmexPlatiNumValidator() ;}
        }
        return null;
    }
}
