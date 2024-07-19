public class StudentPortal {

    public static void main(String[] args) {
        // Creating courses
        Course course1 = new Course("CSE101", "Introduction to Computer Science");
        Course course2 = new Course("MAT201", "Linear Algebra");

        // Creating students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        // Enrolling students in courses
        student1.enroll(course1.getCourseId());
        student1.enroll(course2.getCourseId());
        student2.enroll(course1.getCourseId());

        // Withdrawing from a course
        student1.withdraw(course2.getCourseId());

        // Displaying enrolled courses for each student
        displayEnrolledCourses(student1);
        displayEnrolledCourses(student2);
    }

    // Helper method to display enrolled courses for a student
    public static void displayEnrolledCourses(Student student) {
        System.out.println(student.getName() + "'s enrolled courses:");
        for (String courseId : student.getEnrolledCourses()) {
            System.out.println(" - " + courseId);
        }
    }
}
