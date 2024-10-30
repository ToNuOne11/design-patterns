package patterns.abstaract.factory;

import patterns.abstaract.factory.Developer;
import patterns.abstaract.factory.ProjectManager;
import patterns.abstaract.factory.ProjectTeamFactory;
import patterns.abstaract.factory.Tester;
import patterns.abstaract.factory.banking.BankingTeamFactory;
import patterns.abstaract.factory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
