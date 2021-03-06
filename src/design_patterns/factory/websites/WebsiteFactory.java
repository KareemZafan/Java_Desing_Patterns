package design_patterns.factory.websites;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteTypes siteType){
        switch (siteType){
            case BLOG: {
                return new Blog();
            }
            case SHOP:{
                return  new Shop() ;
            }
            default: return  null ;
        }
    }
}
