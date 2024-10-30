package patterns.factory.method;

import patterns.factory.method.*;

public class FactoryMethodMain {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpecialty("Java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("java")){return new JavaDeveloperFactory();}
        else if(specialty.equalsIgnoreCase("c++")){return new CppDeveloperFactory();}
        throw new RuntimeException("specialty doesnt exists");
    }
}