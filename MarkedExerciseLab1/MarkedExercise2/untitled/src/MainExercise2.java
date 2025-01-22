public class MainExercise2 {
    public static void main(String[] args) {
        Employee e0 = new Employee("Tim", 1000);
        e0.printEmployeeDetails();
        Programmer l0 = new Programmer("Bob", 1250, "Python");
        l0.printEmployeeDetails();
        Programmer l1 = new Programmer("Winston", 4000, "C#");
        l1.printEmployeeDetails();
        Programmer l2 = new Programmer("Alice", 8000, "Java");
        l2.printEmployeeDetails();
    }
}