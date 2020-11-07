package lesson4;

public class Task2 {

    public static void main(String[] args) {

        TestModifier testModifier = new TestModifier();
        testModifier.someInt = 3;
        testModifier.someProtectedInt = 5;
        testModifier.somePublicInt = 10;
    }

}

class TestModifier {
    int someInt = 2;
    private int somePrivateInt = 2;
    protected int someProtectedInt = 2;
    public int somePublicInt = 2;
}

// задание добавить методы для каждого модификатора доступа

// создать паблик класс PublicТestModifier c таким же набором методов и параметров как и TestModifier, и создать объект этого класса в пакете lesson2