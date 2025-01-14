//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Exercise 5
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        mc1.printS();

        // Additional exercise 1
        MyClass mc2 = new MyClass(10, "Hello world");

        // Additional exercise 2
        int x = mc2.getX();

        // Additional exercise 3
        System.out.println("mc1.d: " + mc1.d);

        // Additional exercise 4
        mc2.d = 1.89;
        System.out.println("mc2.d: " + mc2.d);
    }
}