package oops;

public class cChaining {
    int id;
    String name;
    double sal;

    public static void main(String[] args) {
        cChaining c = new cChaining(10, "Hrithik", 80000);
        System.out.print(c.id +" "+ c.name +" " + c.sal);
        // System.out.println(c.name);
        // System.out.println(c.sal);
    }

    cChaining(int id) {
        this.id = id;
    }

    cChaining(int id, String name) {
        this(id);
        this.name = name;
    }

    cChaining(int id, String name, double sal) {
        this(id, name);
        this.sal = sal;
    }

}
