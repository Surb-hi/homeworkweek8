package javahomeworkweek7;

public class Program_25_Student5 {
    int id;
    String name;
    int age;

    Program_25_Student5(int i, String n) {
        id = i;
        name = n;
    }

    Program_25_Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);

    }
//Main method
    public static void main(String[] args) {
        Program_25_Student5 S1 = new Program_25_Student5(111, "KARAN");
        Program_25_Student5 S2 = new Program_25_Student5(222, "ARAYN", 25);
        S1.display();
        S2.display();
    }
}