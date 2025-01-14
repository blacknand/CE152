public class Exercise1 {
    // Exercise 1B
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

    // Exercise 2B
    // Return the latin alphabet from let1 up to let2
    String getABCFromTo(char let1, char let2) {
        // Terminate function is either characters are no letters
        if (!Character.isLetter(let1) || !Character.isLetter(let2)) {
            return "";
        }

        StringBuilder alphabet = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        // Convert let1 and let2 to strings for indexOf method
        String let1Str = String.valueOf(let1).toUpperCase();
        String let2Str = String.valueOf(let2).toUpperCase();
        int let1Index = alphabet.indexOf(let1Str);
        int let2Index = alphabet.indexOf(let2Str);

        return alphabet.substring(let1Index, let2Index + 1);
    }
}
