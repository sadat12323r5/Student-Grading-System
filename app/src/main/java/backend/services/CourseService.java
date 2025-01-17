package backend.services;

import backend.models.Course;
import backend.repositories.CourseRepository;
import backend.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id " + id));
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Long id, Course updatedCourse) {
        return courseRepository.findById(id).map(course -> {
            course.setName(updatedCourse.getName());
            course.setContent(updatedCourse.getContent());
            course.setVideoLinks(updatedCourse.getVideoLinks());
            return courseRepository.save(course);
        }).orElseThrow(() -> new ResourceNotFoundException("Course not found with id " + id));
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}