package hexlet.code;

public class RandomUtils {

    public static int generateNumber(int min, int max) {
        return org.apache.commons.lang3.RandomUtils.nextInt(min, max);
    }
}
