import ru.netology.services.CalculateService;

public class Main {
    public static void main(String[] args) {

        CalculateService service = new CalculateService();
        System.out.println();
        System.out.println("Количество месяцев для отдыха: " + service.calculate(100_000, 60_000, 150_000));
        System.out.println();
    }
}
