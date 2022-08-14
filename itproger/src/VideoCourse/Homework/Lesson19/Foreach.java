package VideoCourse.Homework.Lesson19;

public class Foreach {
    static String[] abc(String[]... array) {
        int dlina = 0;
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                dlina += array[i].length;
            }
        }
        String[] array2 = new String[dlina];
        int j = 0;
        for (String[] c : array) {
            UNNER:
            for (int k = 0; k < array2.length; k++) {
                for (; j < array2.length; ) {
                    for (String a : c) {
                        array2[j] = a;
                        j++;
                    }
                    break UNNER;
                }
            }
        }
        return array2;
    }


    public static void main(String[] args) {
        String[] array3 = {"Privet", "Poka", "ok"};
        String[] array4 = {"money", "hello", "volk", "jjj"};
        String[] array5 = {"money", "hello", "kkk"};
        String[] array6 = abc(array3, array4, array5);
        for (int i =0;i<array6.length;i++){
            for (int j=0; j<args.length; j++){
                if(args[j].equals(array6[i])){
                    array6[i]=null;
                }
            }
        }

        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i] + " ");
        }
    }
}

