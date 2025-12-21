import java.util.Enumeration;
import java.util.Vector;

public class Course {
    private String title;
    private Vector courseRecords;

    Course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

    public void printCourseStudents() {
        System.out.println("Daftar mahasiswa untuk mata kuliah: " + title);
        Enumeration e = courseRecords.elements();
        if (!e.hasMoreElements()) {
            System.out.println("(Belum ada mahasiswa)");
            return;
        }

        while (e.hasMoreElements()) {
            CourseRecord cr = (CourseRecord) e.nextElement();
            Student s = cr.getStudent();
            if (s != null) {
                System.out.println("- " + s.getId() + ": " + s.getName());
            }
        }
    }

    public void printBestStudent() {
        System.out.println("Mahasiswa dengan nilai terbaik di mata kuliah: " + title);

        double bestMark = -1.0;
        Student bestStudent = null;

        Enumeration e = courseRecords.elements();
        while (e.hasMoreElements()) {
            CourseRecord cr = (CourseRecord) e.nextElement();

            try {
                double finalMark = cr.getFinalMark();
                if (finalMark > bestMark) {
                    bestMark = finalMark;
                    bestStudent = cr.getStudent();
                }
            } catch (NotYetSetException ex) {

            }
        }

        if (bestStudent == null) {
            System.out.println("Belum ada data nilai untuk menentukan mahasiswa terbaik.");
        } else {
            System.out.println("Best student: " + bestStudent.getId() + " - " + bestStudent.getName() + " (Nilai akhir: " + bestMark + ")");
        }
    }

    public void printFinalExamStudents() {
        System.out.println("Mahasiswa yang harus mengikuti ujian final untuk: " + title);

        boolean any = false;
        Enumeration e = courseRecords.elements();
        while (e.hasMoreElements()) {
            CourseRecord cr = (CourseRecord) e.nextElement();
            try {
                double finalMark = cr.getFinalMark();
                if (finalMark < 50.0) {
                    Student s = cr.getStudent();
                    if (s != null) {
                        System.out.println("- " + s.getId() + " : " + s.getName() + " (Nilai: " + finalMark + ")");
                        any = true;
                    }
                }
            } catch (NotYetSetException ex) {
                Student s = cr.getStudent();
                if (s != null) {
                    System.out.println("- " + s.getId() + " : " + s.getName() + " (Belum ada nilai, diasumsikan ikut final)");
                    any = true;
                }
            }
        }

        if (!any) {
            System.out.println("Tidak ada mahasiswa yang perlu mengikuti ujian final.");
        }
    }
}