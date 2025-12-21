import java.util.Enumeration;
import java.util.Vector;

public class CourseRecord {
    private Student student;
    private Vector assignments;

    CourseRecord() {
        assignments = new Vector();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s) {

        student = s;
    }

    public void addAssignment(Assignment a) {

        assignments.addElement(a);
    }

    public Enumeration getAssignments() {

        return assignments.elements();
    }

    public double getFinalMark() throws NotYetSetException {
        if (assignments.isEmpty()) {
            throw new NotYetSetException("Belum ada assignment untuk mahasiswa: " + (student != null ? student.getName() : "unknown"));
        }
        double total = 0.0;
        Enumeration e = assignments.elements();
        while (e.hasMoreElements()) {
            Assignment a = (Assignment) e.nextElement();
            total += a.getMark() * a.getWeight();
        }
        return total;
    }
}