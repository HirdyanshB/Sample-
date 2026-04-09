public class student {
    String name;
    int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        student s = new student("Alice", 20);
        s.display();
    }
}