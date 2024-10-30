package patterns.abstaract.factory.banking;

import patterns.abstaract.factory.Developer;
import patterns.abstaract.factory.ProjectManager;
import patterns.abstaract.factory.ProjectTeamFactory;
import patterns.abstaract.factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
