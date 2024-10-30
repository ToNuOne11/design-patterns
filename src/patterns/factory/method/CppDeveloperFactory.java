package patterns.factory.method;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
