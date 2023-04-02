package hexlet.code;

public class RandomUtils {
    private static final int MAX_RANDOM_NUMBERS = 20;
    private static final int MIN_RANDOM_NUMBERS = 0;


        public static int generateNumber(int min, int max) {
            return org.apache.commons.lang3.RandomUtils.nextInt(min, max);
    }
        public static int generateNumber() {
            return org.apache.commons.lang3.RandomUtils.nextInt(MIN_RANDOM_NUMBERS, MAX_RANDOM_NUMBERS);
    }
}
