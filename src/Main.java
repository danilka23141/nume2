import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес в килограммах: ");
        double weightKg = scanner.nextDouble();

        System.out.print("Введите рост в метрах: ");
        double heightM = scanner.nextDouble();

        BmiService service = new BmiService();
        int bmi = service.calculate(weightKg, heightM);
        System.out.println("Индекс массы тела: " + bmi);
    }
}