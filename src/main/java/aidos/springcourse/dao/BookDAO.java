package aidos.springcourse.dao;

import aidos.springcourse.models.Book;
import aidos.springcourse.models.BookOfPerson;
import aidos.springcourse.models.Owner;
import aidos.springcourse.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index() {
        return jdbcTemplate.query("SELECT * FROM book ORDER BY id", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book show(int id) {
        return jdbcTemplate.query("SELECT * FROM book WHERE id =?", new Object[]{id},
                new BeanPropertyRowMapper<>(Book.class)).stream().findAny().orElse(null);
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO book(title, author, year_of_issue) VALUES(?, ?, ?)",
                book.getTitle(), book.getAuthor(), book.getYearOfIssue());
    }

    public void update(int id, Book book) {
        jdbcTemplate.update("UPDATE book SET title=?, author=?, year_of_issue=? WHERE id=?",
                book.getTitle(),
                book.getAuthor(),
                book.getYearOfIssue(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM book WHERE id=?", id);
    }

    public Owner checkOwner(int id) {
        String query = "SELECT person.full_name FROM person " +
                "RIGHT JOIN book ON book.person_id = person.id WHERE book.id = ?";
        return jdbcTemplate.query(query, new Object[]{id}, new BeanPropertyRowMapper<>(Owner.class)).stream()
                .findAny().orElse(null);
    }

    public void addOwner(int bookId, Integer personId) {
        jdbcTemplate.update("UPDATE book SET person_id = ? WHERE id = ?", personId, bookId);
    }
}
