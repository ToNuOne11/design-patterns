package patterns.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildURL() {
        website.setURL("Enterprise-web.com");
    }

    @Override
    void buildLocation() {
        website.setLocation("London");
    }
}
