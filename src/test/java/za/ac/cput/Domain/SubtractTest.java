/**
 * MultiplyTest.java
 * Author: Llewelyn Klaase
 * Student no: 216267072
 * Description: Program to divide two numbers
 * Date: 06 February 2022
 */
package za.ac.cput.Domain;

import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class SubtractTest {

    private Subtract num1;
    private Subtract num2;
    private Subtract num3;

    @Order(1)
    @Test
    @BeforeEach
    void setUp() {
        this.num1 = new Subtract();
        this.num2 = new Subtract();
        num3 = num1;
    }

    @Order(2)
    @Test
    void testEquality(){
        assertEquals(num1, num3);
    }

    @Order(3)
    @Test
    void testIdentity(){
        assertSame(num1, num3);
    }

    @Order(4)
    @Test
    void failTest(){
        fail("This test will fail");
    }

    @Order(5)
    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    void testThis(){
        System.out.println("Test time out");
    }

    @Order(6)
    @Test
    @Disabled("Method not needed")
    void afterAll(){}

    @Order(7)
    @AfterEach
    @Test
    void tearDown() {
        System.out.println("Test completed");
    }
}