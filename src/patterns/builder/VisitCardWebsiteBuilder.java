package patterns.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildURL() {
        website.setURL("visit-card.ru");
    }

    @Override
    void buildLocation() {
        website.setLocation("Moscow");
    }
}
