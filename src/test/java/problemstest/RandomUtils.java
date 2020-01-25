package problemstest;

import java.util.Random;

public class RandomUtils {
    private Random random = new Random();

    // returns a random float between the min and max
    public Double createDouble(double min, double max) {
        return random.nextDouble() * (max - min) + min;
    }

    // returns a random integer between the min and max
    public Integer createInteger(int min, int max) {
        return createDouble(min, max).intValue();
    }

    public Integer[] createIntegerArray(int min, int max, int length) {
        Integer[] array = new Integer[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = createInteger(min, max);
        }
        return array;
    }
}