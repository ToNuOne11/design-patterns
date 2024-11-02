package patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMethodMain {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.developerGetDeveloperBySpecialty("java"));
        developers.add(developerFactory.developerGetDeveloperBySpecialty("java"));
        developers.add(developerFactory.developerGetDeveloperBySpecialty("java"));
        developers.add(developerFactory.developerGetDeveloperBySpecialty("java"));
        developers.add(developerFactory.developerGetDeveloperBySpecialty("java"));
        developers.add(developerFactory.developerGetDeveloperBySpecialty("c++"));
        developers.add(developerFactory.developerGetDeveloperBySpecialty("c++"));
        developers.add(developerFactory.developerGetDeveloperBySpecialty("c++"));

        for(Developer developer: developers){
            developer.writeCode();
        }
    }
}
