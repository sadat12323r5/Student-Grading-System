package backend.models.archive;

import java.util.List;

import backend.models.Course;
import backend.models.Student;

public class courseAdmin {
    private int id;
    private String name;
    private String email;
    private List<Course> courses;

    public courseAdmin(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Course createCourse(Long id, String Name) {
        return null;
    }

    public void removeCourse(Course course) {
    }

    public void addTeacherToCourse(courseAdmin teacher, Course course) {
    }

    public void removeTeacherFromCourse(courseAdmin teacher, Course course) {
    }

    public void enrolStudentToCourse(Student student, Course course) {
    }

    public void removeStudentToFromCourse(Student student, Course course) {
    }

    public void generateTranscript(Student student) {
    }
}