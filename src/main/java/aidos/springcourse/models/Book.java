package aidos.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    private Integer person_id;
    @NotEmpty(message = "Title should not be empty")
    @Size(min = 2, max = 30, message = "Book's title be between 2 and 30 characters")
    private String title;
    @NotEmpty(message = "Author's name should not be empty")
    @Size(min = 2, max = 30, message = "Author's name should be between 2 and 30 characters")
    private String author;
    @Min(value = 1800, message = "Year of issue should be greater than 1800")
    private Integer yearOfIssue;

    public Book() {}

    public Book(int id, int person_id, String title, String author, Integer yearOfIssue) {
        this.id = id;
        this.person_id = person_id;
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return person_id;
    }

    public void setPersonId(Integer person_id) {
        this.person_id = person_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
