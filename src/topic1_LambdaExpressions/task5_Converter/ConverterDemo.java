package topic1_LambdaExpressions.task5_Converter;

import java.util.Arrays;

public class ConverterDemo {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        intArray = convertArray(intArray, x -> x * x);

        System.out.println(Arrays.toString(intArray));
    }

    public static int[] convertArray(int[] array, Converter converter){
        int[] resultArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            resultArray[i] = converter.convert(array[i]);
        }

        return resultArray;
    }
}
