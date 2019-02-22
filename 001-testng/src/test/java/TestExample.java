import com.company.Calculate;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExample {
    private Calculate calculate = null;

    @BeforeClass
    public void setup() {
        calculate = new Calculate();
    }

    @DataProvider
    public Object[][] dataProvider() {
        return new Object[][]{{1, 2}, {2, 3}, {3, 4}};
    }

    @Test(dataProvider = "dataProvider")
    public void canDivideTwoNumbers(Integer first, Integer second) {
        Assert.assertEquals(calculate.divide((int) first, (int) second), (int) 0);
    }


    @Test(expectedExceptions = ArithmeticException.class)
    public void canGetExceptionDivideByZero() {
        Assert.assertEquals(calculate.divide(1, 0), 0);
    }
}
