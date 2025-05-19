package topic1_LambdaExpressions.task4_Filter;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterDemo {
    public static void main(String[] args) {
        Integer[] intArray = {5, 12, 7, 20, 3, 10};

        MyPredicate<Integer> predicate = i -> i >= 10;

        System.out.println(filterArray(intArray, predicate));
    }

    public static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for(T elem : array) {
            if(predicate.test(elem))
                result.add(elem);
        }
        return result;
    }
}
