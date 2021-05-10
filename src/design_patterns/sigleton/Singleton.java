package design_patterns.sigleton;

public class Singleton {
    /* Only one instance */
    private static volatile  Singleton singleton = null ;
    /*Private Constructor */
    private Singleton(){
        if(singleton != null){

            throw  new RuntimeException("Use getInstance() create and instance ") ;
        }
    }

    public  static Singleton getInstance(){
       if( null == singleton){
           /* Improve your code as you occupy memory only when you need in the method */
           synchronized (Singleton.class){
               if( null == singleton)
               {
                   singleton = new Singleton() ;
               }
           }

       }
        return  singleton ;
    }

 }
