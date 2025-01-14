public class MyClass {

    // Exercise 2
    int x;
    String s;
    double d = 1.52;

    // Exercise 3
    MyClass () {
        x = 10;
        s = "CE152";
    }

    MyClass(int x, String s) {
        this.x = x;
        this.s = s;
    }

    // Exercise 4
    int getX() {
        return x;
    }

    void printS() {
        System.out.println(s);
    }
}