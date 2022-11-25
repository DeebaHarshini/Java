package JavaAssignment.Maths;

public class TwoDigitEvenNumber {
    public void TwoDigit() {
        int count = 0;
        for (int number = 10; number < 100; number++) {
            int Unit = Math.floorDiv((number % 10), 1);
            int Ten = Math.floorDiv(number, 10);

            if ((Unit == 2) || (Unit == 4)) {
                if ((Ten == 2) || (Ten == 4) || (Ten == 1) || (Ten == 3) || (Ten == 5)) {
                    System.out.print(number + " , ");
                    count++;
                }
            }
        }
        System.out.print("\n\nTotal number two-digit even numbers can be formed from the digit 1, 2, 3, 4 and 5 if any of the digits can be repeated = " + count);

    }

    public static void main(String[] args) {
        TwoDigitEvenNumber methodCalling = new TwoDigitEvenNumber();
        methodCalling.TwoDigit();
    }

    public void PrimeNumber() {
    }
}
