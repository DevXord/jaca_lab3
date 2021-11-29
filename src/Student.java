class Student {

    String name;
    String surname;
    int age;
    boolean isActive;



    @Override
    public String toString() {
        return "Student: Name: " + name + ", Surname: " + surname  + ", Age: " + age + ", Status: " + ((isActive) ? "Active" :  "No active");
    }
}
