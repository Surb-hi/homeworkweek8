package encapsulation26;

public class Encapsulate {
    private String name;
    private int rollno;
    private int age;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setname("surbhi");
        obj.setAge(24);
        obj.setRollno(13);
        System.out.println("Surbhi's name: " + obj.getname());
        System.out.println("Surbhi's age: " + obj.getAge());
        System.out.println("Surbhi's rollNo: " + obj.getRollNo());

    }
}