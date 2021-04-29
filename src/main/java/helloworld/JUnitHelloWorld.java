package helloworld;

public class JUnitHelloWorld {
    public boolean isGreater(int num1, int num2) {
        return num1 > num2;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public int isOdd(int number) {
        return number % 2 != 0 ? number : -1;
    }
}
