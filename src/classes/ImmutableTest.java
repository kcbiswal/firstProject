package classes;

public class ImmutableTest {
    public static void main(String[] args) {
        Student s=new Student(100,"kanha");
        System.out.println(s.getId());
        System.out.println(s.getName());
        // s.id = 200; // ❌ Error: cannot assign value to final variable
        // s.setName("Amit"); // ❌ No setter available
    }
}
