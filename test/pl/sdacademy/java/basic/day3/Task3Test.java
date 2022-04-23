package pl.sdacademy.java.basic.day3;


import org.junit.jupiter.api.*;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static pl.sdacademy.java.basic.day3.Task3.isValidNumber;

class Task3Test {

    @BeforeAll
    static void beforeAll() {
        System.out.println("START TESTÓW");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("KONIEC TESTÓW");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Rozpoczynam test!");
    }
    @AfterEach
    void tearDown() {
        System.out.println("Kończę test!");
    }

    //@Disabled //adnotacja wylaczajac test
    @Test
    @DisplayName("Test metody isValidNumber")
    void isValidNumberTest() {
        //given
        //when
        //then
        assertTrue(isValidNumber("123"));
        assertTrue(isValidNumber("0"));
        assertTrue(isValidNumber("123,4"));
        assertTrue(isValidNumber("123,456789999"));
        assertTrue(isValidNumber("-123"));
        assertTrue(isValidNumber("-123,45"));
        assertTrue(isValidNumber("0,1"));


        assertFalse(isValidNumber("0123"));
        assertFalse(isValidNumber("0123,45"));
        assertFalse(isValidNumber("123,"));
        assertFalse(isValidNumber(",45"));
        assertFalse(isValidNumber(","));
        assertFalse(isValidNumber("-0"));
        assertFalse(isValidNumber("-0,123"));
        assertFalse(isValidNumber("-,1"));
        assertFalse(isValidNumber("123,456,789"));
        assertFalse(isValidNumber("123a456"));
        assertFalse(isValidNumber("00,123"));


    }

    @Test
    @DisplayName("Test AssertJ")
    void testAssertJ() {
        //String test = "Testowy tekst";
        //assertThat(test).startsWith("Te").endsWith("tekst");
        assertThat(isValidNumber("123")).isTrue();
    }



    @Test
    @DisplayName("Test JUnit")
    void testJUnit() {
        //given
        //String test = "Testowy tekst";
        //when
        //then
        //assertEquals(true,test.startsWith("Te") && test.endsWith("tekst"));

        assertEquals(true,isValidNumber("123") && isValidNumber("-555,58"));
    }


}