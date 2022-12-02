package lec120222;

public class EncapsulationPractice {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.setStudentId("0001");
        firstStudent.setFirstName("Michael");
        firstStudent.setLastName("Gabriel");
        firstStudent.setStudentEmail("mgabriel@perscholas.org");
        firstStudent.setStudentPhoneNumber("123-456-7890");

        System.out.println(firstStudent);

        Student secondStudent = new Student("0002", "Bairon", "Vasquez",
                "bvasquez@perscholas.org", "123-456-7891");
        System.out.println(secondStudent);
    }
}
