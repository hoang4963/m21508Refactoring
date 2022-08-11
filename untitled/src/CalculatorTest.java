public class CalculatorTest {
    boolean testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;
        int result = Calculator.calculate(a, b, o);
        if (expected == result)
            return true;
        else return false;

    }
    boolean testCalculateSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;
        int result = Calculator.calculate(a,b,o);
        if (expected == result)
            return true;
        else return false;
    }
    boolean testCalculateMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a, b, o);
        if (expected == result)
            return true;
        else return false;
    }
    boolean testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        if (expected == result)
            return true;
        else return false;
    }
}
