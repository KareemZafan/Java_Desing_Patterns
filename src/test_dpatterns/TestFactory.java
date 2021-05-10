package test_dpatterns;

import design_patterns.factory.websites.Website;
import design_patterns.factory.websites.WebsiteFactory;
import design_patterns.factory.websites.WebsiteTypes;

public class TestFactory {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteTypes.BLOG) ;

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteTypes.SHOP) ;
        System.out.println(site.getPages());

    }
}
