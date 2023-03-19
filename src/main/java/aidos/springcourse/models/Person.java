package aidos.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private Integer id;
    @NotEmpty(message = "Full name should not be empty")
    @Size(min = 2, max = 50, message = "Full name should be between 2 and 50 characters")
    private String fullName;
    @Min(value = 1901, message = "Year of birth should be greater than 1900")
    private int yearOfBirth;

    public Person() {}

    public Person(Integer id, String fullName, int yearOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
