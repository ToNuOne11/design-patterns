package patterns.abstaract.factory.website;

import patterns.abstaract.factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manage website project...");
    }
}
