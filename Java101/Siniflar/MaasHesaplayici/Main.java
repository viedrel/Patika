package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kemal", 2000, 45, 1985);

        System.out.println(employee1.toString());

        System.out.println("Tax: " + employee1.tax());
        System.out.println("Bonus: " + employee1.bonus());

        employee1.raiseSalary();
        System.out.println("New Salary: " + employee1.getSalary());
    }
}