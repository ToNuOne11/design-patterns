package patterns.builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildURL();
        builder.buildLocation();

        Website website = builder.getWebsite();

        return website;
    }
}
