package patterns.abstaract.factory.website;

import patterns.abstaract.factory.Developer;
import patterns.abstaract.factory.ProjectManager;
import patterns.abstaract.factory.ProjectTeamFactory;
import patterns.abstaract.factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
