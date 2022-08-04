import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitAssertions {
    @Test
    void testassertequal(){
        assertEquals("ABC","ABC");
    }

    @Test
    void testassertequal2(){
        assertEquals("ABC","ABC","message");

    }

    @Test
    void testassertequal3(){
        assertEquals(2+2,4,"message");
    }

    @Test
    void testassertNull(){
        String str1 =  "sid";
        String str2 = "Intellipaat";
        String str3 = null;

        assertNull(str3);
        assertNull(str1);

        assertNotNull(str1);
        assertNotNull(str2);
    }

    // assert - true and false;

    @Test
    void testassertTrue(){
        assertTrue("Sid".startsWith("S"));
    }
}
