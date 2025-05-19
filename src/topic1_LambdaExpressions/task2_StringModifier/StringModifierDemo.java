package topic1_LambdaExpressions.task2_StringModifier;


public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier stringToUpper = (str) -> str.toUpperCase() + "!";
        System.out.println(stringToUpper.modify("hello world"));
    }
}
