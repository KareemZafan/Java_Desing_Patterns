package design_patterns.factory.websites;

import design_patterns.factory.pages.AboutPage;
import design_patterns.factory.pages.CommentPage;
import design_patterns.factory.pages.ContactPage;
import design_patterns.factory.pages.PostPage;
import design_patterns.factory.websites.Website;

public class Blog extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new PostPage()) ;
        pages.add(new ContactPage()) ;
        pages.add(new CommentPage()) ;
        pages.add(new AboutPage());


    }
}
