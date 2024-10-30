package patterns.abstaract.factory.website;

import patterns.abstaract.factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
