import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] doubles = {2.2, 5.4, -8.3, 4.8, -3.8, 1.1, 7.9, -6.3, 4.8, 2.1, -4.4, 6.3, -4.1, 8.4, 5.4};

        double average = 0.0;

        int count = 0;

        for (int x1 = 0; x1 < doubles.length; x1++) {
            if (doubles[x1] < 0) {

                for (int x2 = x1 + 1; x2 < doubles.length; x2++) {


                    if (doubles[x2] > 0) {

                        average = average + doubles[x2];

                        count++;

                    }

                }
                break;


            }

        }

        System.out.println(Arrays.toString(doubles) + " = " + average + " / " + count);

    }
}
