package patterns.builder;

public class Website {
    private String name;
    private Cms Cms;
    private String URL;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(patterns.builder.Cms cms) {
        Cms = cms;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", Cms=" + Cms +
                ", URL='" + URL + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
