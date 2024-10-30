package patterns.builder;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildURL();
    abstract void buildLocation();

    Website getWebsite(){
        return website;
    }
}
