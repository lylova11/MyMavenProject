import hw4.ExampleClass;
import hw4.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {

    @Test
    void test() throws MyException {
        ExampleClass exampleClass = new ExampleClass();
        Assertions.assertEquals(30,exampleClass.someMethod(1,2, 3));
        Assertions.assertThrows(MyException.class,()-> exampleClass.someMethod(10,20, 40));
    }


}
