import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.PlannerService;


public class PlannerServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/planner.csv")

    public void testCalculatorDay(int income, int expenses, int threshold) {
        PlannerService service = new PlannerService();
        int actual = service.calculate(income, expenses, threshold);
        System.out.println(actual);
    }
}
