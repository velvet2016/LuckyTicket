import java.util.stream.IntStream;

public class LuckyTickets {

    public static void main(String[] args) {
        long count = IntStream
                .range(0, 1000000)
                .filter(i->isLuckyNumber(i))
                .count();
        System.out.println(count);
        //result: 55252
    }

    private static boolean isLuckyNumber(int inputInt) {
        String formatted = String.format("%06d", inputInt);
        int left  = getDigitByPos(formatted, 0) + getDigitByPos(formatted, 1) + getDigitByPos(formatted, 2);
        int right  = getDigitByPos(formatted, 3) + getDigitByPos(formatted, 4) + getDigitByPos(formatted, 5);
        return left == right;
    }
    private static int getDigitByPos(String str, int pos){
        return Character.getNumericValue(str.charAt(pos));
    }
}