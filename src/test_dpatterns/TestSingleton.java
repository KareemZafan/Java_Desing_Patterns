package test_dpatterns;

import design_patterns.sigleton.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance() ;
       /* it will print the instance address */
        System.out.println(singleton);

        Singleton anotherSingleton =Singleton.getInstance() ;
        /* it will print the same address as it static (so only one instance needed )*/
        System.out.println(anotherSingleton);
    }
}
