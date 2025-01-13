package backend.models;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique ID for the course
    private String name; // Name of the course
    private String content;

    @ElementCollection
    private List<String> videoLinks;

    public Course(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
}
