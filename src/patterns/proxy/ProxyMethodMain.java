package patterns.proxy;

public class ProxyMethodMain {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/ToNuOne11/design-patterns");

        project.run();
    }
}
