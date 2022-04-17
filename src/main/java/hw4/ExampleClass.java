package hw4;



public class ExampleClass {
    public static void main(String[]args) {

    }
    public int someMethod(int a, int b, int c) throws MyException {
        if (a + b <= c || b + c <= a || c + a <= b) throw new MyException("Ошибка");
        float result1 = (a + b + c) / 2f;
        float result2 = (float) Math.sqrt(result1 * (result1 - a) * (result1 - b) * (result1 - c));
        return (int) result2;
    }

}


