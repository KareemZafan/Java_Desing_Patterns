package design_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String , Item> items = new HashMap<String , Item>() ;
    public Registry(){
        loadItems() ;
    }

    private void loadItems() {
        Movie movie = new Movie() ;
        movie.setTitle("The Mask Of Zoro");
        movie.setPrice(1000000);
        movie.setRuntime("2 Hours ");
        items.put("Movie",movie) ;


        Book book = new Book() ;
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Design Patterns");
        items.put("Book",book) ;




    }

    public Item createItem(String type){
        Item item = null ;
        try {
              item = (Item)(items.get(type)).clone() ;

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  item ;

    }



}
