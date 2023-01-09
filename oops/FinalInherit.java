package oops;

class FinalInherit {
    public int calculate(int a, int b) {
        return 1;
    }
}

class B extends FinalInherit {
    public int calculate(int a, int b) {
        return 2;
    }
}

class output {
    public static void main(String[] args) {
        FinalInherit o = new B();
        System.out.println("b is: " + o.calculate(0, 1));
    }
}
