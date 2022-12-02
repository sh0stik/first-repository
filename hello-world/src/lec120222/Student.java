package lec120222;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String studentPhoneNumber;

    public Student() {
    }

    public Student(String studentId, String firstName, String lastName, String studentEmail, String studentPhoneNumber) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentEmail = studentEmail;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    @Override
    public String toString() {
        return "Student ID: '" + studentId + '\'' +
                "\nStudent First Name: '" + firstName + '\'' +
                "\nStudent Last Name: '" + lastName + '\'' +
                "\nStudent Email: '" + studentEmail + '\'' +
                "\nStudent Phone Number: '" + studentPhoneNumber;
    }
}
