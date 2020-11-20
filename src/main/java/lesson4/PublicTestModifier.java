package lesson4;

public class PublicTestModifier {
    int someInt = 2;
    public int somePrivateInt = 2;
    public int someProtectedInt = 2;
    public int somePublicInt = 2;

    public void print() {
        System.out.println("TestModifier");
    }

    public String getSomeString() {
        return "hello";
    }

    public void method(){}
}
