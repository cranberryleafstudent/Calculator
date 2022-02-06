/**
 * AddTest.java
 * Author: Llewelyn Klaase
 * Student no: 216267072
 * Description: Program to add two numbers
 * Date: 06 February 2022
 */
package za.ac.cput.Domain;

import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class AddTest {

    private Add sum1;
    private Add sum2;
    private Add sum3;

    @Order(1)
    @Test
    @BeforeEach
    void setUp() {
        this.sum1 = new Add();
        this.sum2 = new Add();
        sum3 = sum1;
    }

    @Order(2)
    @Test
    void testEquality(){
        assertEquals(sum1, sum3);
    }

    @Order(3)
    @Test
    void testIdentity(){
        assertSame(sum1, sum3);
    }

    @Order(4)
    @Test
    void failTest() {
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
    @Disabled("Method not needed.")
    void afterAll() {

    }

    @Order(7)
    @Test
    @AfterEach
    void tearDown() {}

}