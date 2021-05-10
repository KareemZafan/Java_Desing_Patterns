package design_patterns.factory.websites;

import design_patterns.factory.pages.CartPage;
import design_patterns.factory.pages.ItemPage;
import design_patterns.factory.pages.SearchPage;
import design_patterns.factory.websites.Website;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new CartPage()) ;
        pages.add(new ItemPage()) ;
        pages.add(new SearchPage());
    }
}
