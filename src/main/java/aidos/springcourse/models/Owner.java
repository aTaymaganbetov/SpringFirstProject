package aidos.springcourse.models;

public class Owner {
    private String fullName;

    public Owner(){}

    public Owner(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
