import java.util.*;

class Student {
    private String studentId;
    private String name;
    private List<String> enrolledCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    // Method to enroll in a course
    public void enroll(String courseId) {
        enrolledCourses.add(courseId);
        System.out.println(name + " enrolled in course: " + courseId);
    }

    // Method to withdraw from a course
    public void withdraw(String courseId) {
        if (enrolledCourses.contains(courseId)) {
            enrolledCourses.remove(courseId);
            System.out.println(name + " withdrew from course: " + courseId);
        } else {
            System.out.println(name + " is not enrolled in course: " + courseId);
        }
    }
}

// Define Course class
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}
