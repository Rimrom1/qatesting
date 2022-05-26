package practice5.UnitTestCalc;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static file0.Calculator.add;

public class CalcAddTest {
    @DataProvider
    public static Object[][] addTestDataProvider() {

        //column count => argument count
        //row count => test execution count
        Object[][] result = new Object[][]{
                {0, 1},
                {2, 2},
                {13, 156},
                {132, -1},
                {-32, -1}
        };

        return result;
    }

    @Test(dataProvider = "addTestDataProvider")
    void calcAddTest(Integer a, Integer b){
        Integer expected = a + b;
        Assert.assertEquals(add(a, b), expected," invalid add operation");
    }

}
