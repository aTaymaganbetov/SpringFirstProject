package aidos.springcourse.models;

public class BookOfPerson {
    private String title;
    private String author;
    private Integer yearOfIssue;

    public BookOfPerson() {}

    public BookOfPerson(String title, String author, Integer yearOfIssue) {
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
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
