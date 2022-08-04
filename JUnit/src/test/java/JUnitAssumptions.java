import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class JUnitAssumptions {
    @Test
    void testAssumeTrue(){
        boolean b = 'a'=='a';
        assumeTrue(b);
        assertEquals("Hello","Hello");

    }

    @Test
    @DisplayName("Test Execute only Friday")
    public void testassumeTrue(){
        LocalDateTime dt = LocalDateTime.now();

        assumeTrue(dt.getDayOfWeek().getValue()==5);
        System.out.println("Further code will execute only if above assumption hold true");
    }
    @Test
    void testassumeFalse(){
        boolean b = 'a' != 'a';
        assumeFalse(b);
        assertEquals("Hello", "Hello");
    }

    @Test
    void testassumeflaseEnvProp(){
        System.setProperty("env","Prod");
        assumeFalse("dev".equals((System.getProperty("env"))));
        System.out.println("Further code will execute only if above assumption hold");
    }
}
