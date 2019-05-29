package pojos;

public class CustomerDto {

    // TODO map this to "name:age"
    private String combinationKeyOfNameAndAge;
    private String location;
    private String age;
    private String isoTimeCreated;

    public String getCombinationKeyOfNameAndAge() {
        return combinationKeyOfNameAndAge;
    }

    public void setCombinationKeyOfNameAndAge(String combinationKeyOfNameAndAge) {
        this.combinationKeyOfNameAndAge = combinationKeyOfNameAndAge;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsoTimeCreated() {
        return isoTimeCreated;
    }

    public void setIsoTimeCreated(String isoTimeCreated) {
        this.isoTimeCreated = isoTimeCreated;
    }
}
