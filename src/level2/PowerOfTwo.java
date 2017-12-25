package level2;

public class PowerOfTwo {

    public static void main(String[] args) {
        boolean isPowOfTwo = isPowOfTwo(9);
        System.out.println(isPowOfTwo);
    }

    public static boolean isPowOfTwo(int num) {
        return (num & (num-1)) == 0;
    }

}
