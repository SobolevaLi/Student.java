package VideoCourse.Homework.Lesson18;
import java.util.Arrays;

public class Sort {
    public static void sortirovka(int[] array) {
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int c = array[i];
                    int b = array[j];
                    array[i] = b;
                    array[j] = c;
                }
            }
        }
    }




    public static void main(String[] args) {
        int[] array1 = {6, 3,9,55,76,8, 8, 2, 4, 0};
        sortirovka(array1);
        System.out.println(Arrays.toString(array1));

    }
}

