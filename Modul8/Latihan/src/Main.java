public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Pemrograman Java");

        Student s1 = new Student("2350081003", "Muhamad Yusron Noval");
        Student s2 = new Student("2350081004", "Muhamad Yasir Noval");
        Student s3 = new Student("2350081008", "Ammar Bagas Fathurrahman Wantoro");

        CourseRecord cr1 = new CourseRecord();
        cr1.setStudent(s1);
        cr1.addAssignment(new Assignment("Tugas 1", 75, 0.3));
        cr1.addAssignment(new Assignment("Tugas 2", 80, 0.3));
        cr1.addAssignment(new Assignment("UTS", 90, 0.4));

        CourseRecord cr2 = new CourseRecord();
        cr2.setStudent(s2);
        cr2.addAssignment(new Assignment("Tugas 1", 90, 0.3));
        cr2.addAssignment(new Assignment("Tugas 2", 80, 0.3));
        cr2.addAssignment(new Assignment("UTS", 95, 0.4));

        CourseRecord cr3 = new CourseRecord();
        cr3.setStudent(s3);

        course.addCourseRecord(cr1);
        course.addCourseRecord(cr2);
        course.addCourseRecord(cr3);

        course.printCourseStudents();
        System.out.println();
        course.printBestStudent();
        System.out.println();
        course.printFinalExamStudents();
    }
}