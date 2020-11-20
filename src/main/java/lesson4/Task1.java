package lesson4;

public class Task1 {

    public static void main(String[] args) {
//        Test test1 = new Test();
//        test1.someInt = 500;
//        Test test2 = new Test();
//        test2 = test1;
//
//        test1.someInt = 1000;
//
//        System.out.println(test2.someInt);
//        System.out.println(test1.someInt);

        MyClass myclass = new MyClass();
        System.out.println(myclass.str);
        myclass.str = "cat";
        System.out.println(myclass.str);
    }

}

//class Test {
//    int someInt = 2;
//}

class MyClass {
    String str = "HELLO";
}


// создать новый класс, который будет содержать строку