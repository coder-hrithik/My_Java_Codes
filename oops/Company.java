package oops;
class Emp{
    int id;
    String name;
    private double sal;

    public double getSal(){ //read--getter method-- 02--to access the date
        return sal;
    }
    public void setSal(double sal){ //write-- setter method--to change the data
        this.sal=sal;
    }

    Emp(int id,String name,double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
}

public class Company {
    public static void main(String[] args) {
        Emp ref = new Emp(10,"Hrithik",20000);
        Emp ref1 = new Emp(20,"Pqr",30000);
        Emp ref2 = new Emp(30,"Xyz",40000);


        ref.setSal(50000);
        System.out.println("Id: " + ref.id);
        System.out.println("Name: " + ref.name);
        System.out.println("Sal: "+ ref.getSal());
 
        
        ref1.setSal(60000);
        System.out.println("Id: " + ref1.id);
        System.out.println("Name: " + ref1.name);
        System.out.println("Sal: "+ ref1.getSal());

        
        ref2.setSal(70000);
        System.out.println("Id: " + ref2.id);
        System.out.println("Name: " + ref2.name);
        System.out.println("Sal: "+ ref2.getSal());
    }
}

