package topic1_LambdaExpressions.task1_Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = (a,b) -> a + b;

        System.out.println(calculator.operate(1, 10));
        System.out.println(calculator.operate(28, 20));
    }
}
