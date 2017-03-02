import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        long count = IntStream
                .range(0, 1000000)
                .filter(Main::isLuckyNumber)
                .count();
        System.out.println(count);
        //result: 55252
    }

    private static boolean isLuckyNumber(int inputInt) {
        String formatted = String.format("%06d", inputInt);
        int left  = getIntByPos(formatted, 0) + getIntByPos(formatted, 1) + getIntByPos(formatted, 2);
        int right  = getIntByPos(formatted, 3) + getIntByPos(formatted, 4) + getIntByPos(formatted, 5);
        return left == right;
    }
    private static int getIntByPos(String str, int pos){
        return Character.getNumericValue(str.charAt(pos));
    }
}