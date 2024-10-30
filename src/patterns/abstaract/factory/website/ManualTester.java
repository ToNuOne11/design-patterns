package patterns.abstaract.factory.website;

import patterns.abstaract.factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests banking code...");
    }
}
