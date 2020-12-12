public class ReverseNumber {
    public static void run(int nr) {
        int lastDigit = nr%10;
        int reverse = 0;
        reverse = ((reverse*10)+lastDigit);
        nr = nr/10;
        while (nr>0) {
            lastDigit = nr%10;
            reverse = (reverse*10)+lastDigit;
            nr = nr/10;
        }
        System.out.println(reverse);
    }
    
    public static void main(final String[] args) {
        int ARG0 = Integer.parseInt(args[0]);
        run(ARG0);
    }
}
