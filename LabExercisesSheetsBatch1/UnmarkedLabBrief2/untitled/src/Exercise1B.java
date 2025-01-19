public class Exercise1B {
    String s = "University of Essex";

    void printLength() {
        System.out.println(s.length());
    }

    void printFirstThree() {
        System.out.println(s.substring(0, 3));
    }

    void printFirstSpace() {
        System.out.println(s.indexOf(" "));
    }

    void printUpperCase() {
        System.out.println(s.toUpperCase());
    }

    void printWithoutSpaces() {
        System.out.println(s.replaceAll("\\s+", ""));
    }

    void printNumberOfWords() {
        System.out.println(s.split("\\s").length);
    }

    public static void main(String[] args) {
        Exercise1B obj = new Exercise1B();
        obj.printLength();
        obj.printFirstThree();
        obj.printFirstSpace();
        obj.printUpperCase();
        obj.printWithoutSpaces();
        obj.printNumberOfWords();
    }
}
