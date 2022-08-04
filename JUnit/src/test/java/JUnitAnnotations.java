import org.junit.jupiter.api.*;

public class JUnitAnnotations {
    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("Executed once before all test methods");
    }
    @BeforeEach
    public void beforeEach()
    {
        System.out.println("Execute before each test methods");
    }
    @Test
    public void testMethod1()
    {
        System.out.println("Execute test method1");
    }
    @Test
    @Disabled("implementation pending")
    public void testMethod3()
    {
        System.out.println("Execute test method3");
    }

    @DisplayName("TestMethod2")
    @Test
    public void abc()
    {
        System.out.println("Execute test TestMethod2");
    }
    @AfterAll
    public static void afterAll()
    {
        System.out.println("Executed once after all test methods");
    }
    @AfterEach
    public void afterEach()
    {
        System.out.println("Execute after each test methods");
    }
}


