package pojos;

public class Customer {

    private String name;
    private int age;
    private String location;
    private long epocTimeCreated;
    private String countryCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getEpocTimeCreated() {
        return epocTimeCreated;
    }

    public void setEpocTimeCreated(long epocTimeCreated) {
        this.epocTimeCreated = epocTimeCreated;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
