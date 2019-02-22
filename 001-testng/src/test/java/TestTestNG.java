import org.testng.annotations.*;


public class TestTestNG {
    @BeforeClass(alwaysRun = true)
    public static void beforeClass() {
        System.out.println("before class");
    }

    @BeforeSuite(enabled = true)
    public void beforeSuite() {
        System.out.println("before suite");
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("before test");
    }

    @BeforeMethod(alwaysRun = true, groups = "group1")
    public void beforeMethod() {
        System.out.println("before method");
    }

    @BeforeGroups(groups = "test")
    public void beforeGroups() {
        System.out.println("before groups");
    }

    @Test(groups = "test", description = "testcase test1", dataProvider = "data provider for test1")
    public void test1(String testData1, String testData2) {
        System.out.println("test 1:" + testData1 + " " + testData2);
    }

    @Test(description = "testcase atest2", priority = -1, dependsOnGroups = "test")
    public void atest2() {
        System.out.println("test 2");
    }

    @Test(groups = "test", description = "testcase test3")
    public void test3() {
        System.out.println("test 3");
    }

    @AfterGroups(groups = "test")
    public void afterGroups() {
        System.out.println("after groups");
    }

    @DataProvider(name = "data provider for test1")
    public Object[][] createDataForTest1() {
        return new String[][]{
                {"data1", "data2"},
                {"data3", "data4"},
                {"data5", "data6"},
        };
    }


    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }
}
