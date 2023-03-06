public class Student {

    public static class Builder {

        private Student student = new Student();

        public Builder age(int age) {
            student.setAge(10);
            return this;
        }

        public Builder firstName(String name) {
            student.setName(name);
            return this;
        }

        public Student build() {
            return student;
        }
    }

    private String firstName;

    private String lastName;

    private int age;

    private String studentTicketNumber;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(int age) {
        this.age = age;
    }

    public static void main(String ... args) {
        Student student = Student.(Builder()).age(10).
                firstName("Vasia").
                lastName("Petrovych").
                build();
    }

}W