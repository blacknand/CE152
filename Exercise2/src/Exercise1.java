public class Exercise1 {
    void printEvenUp(int num) {
        if (num <= 0) {
            return;         // If num is negative, terminate function
        }

        // Print all even numbers up to and including num
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
