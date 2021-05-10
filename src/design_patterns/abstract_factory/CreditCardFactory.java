package design_patterns.abstract_factory;

import javax.xml.validation.Validator;

public abstract  class  CreditCardFactory {
public static CreditCardFactory getCreditCardFactory(int creditScore){
     if(creditScore > 650){
         return  new AmexFactory() ;
     }
     else {
         return  new VisualFactory();
     }
}

public abstract CreditCard getCreditCard(CardType cardType) ;

public abstract Validator getValidator(CardType cardType);

}
