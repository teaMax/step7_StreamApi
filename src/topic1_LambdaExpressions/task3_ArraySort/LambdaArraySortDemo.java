package topic1_LambdaExpressions.task3_ArraySort;


import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] array = {"Java", "Lambda", "Stream", "API"};
        Arrays.sort(array, (name1, name2) -> name1.length() - name2.length());
        System.out.println(Arrays.toString(array));
    }
}
