package patterns.abstaract.factory.banking;

import patterns.abstaract.factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manage banking project...");
    }
}
