class Mother{
    int x;
    public static void show(){
        System.out.println("mother class called");
    }
}

class Child extends Mother{
    public static void show(){
        System.out.println("child class called");
    }
}

public class Main {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show();

        Mother m1 = new Child();
        m1.show();

//        int[] arr = {1,2,3};
//        System.out.println(arr.);
        Child c = new Child();
        c.show();


    }
}