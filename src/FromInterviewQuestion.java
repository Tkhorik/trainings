public class FromInterweuQuesttion {
    public static void main(String[] args) {
        int n = 333;
        numberOfDigits(n);
        sumOfAllDigits(n);
    }


    private static void numberOfDigits(int num) {
        int count = 0;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        System.out.println("Number Of Digits "+count);
    }

    private static void sumOfAllDigits(int n) {
        int n1 = n / 100;
        int n2 = n / 10 % 10;
        int n3 = n % 10;
        int n4 = n1 + n2 + n3;
        System.out.println("Sum Of All Digits " + n4);
    }
}