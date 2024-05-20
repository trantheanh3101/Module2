package Lesson9_TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoSumTest {

    // Test a + b > Integer.MAX>VALUE
    @Test
    void  sum(){
        DemoSum demoSum = new DemoSum();
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c =demoSum.sum(a,b);
        assertEquals(4294767294L,c);
    }

    // kiem tra a = chu
    @Test
    void sum2(){
        int a = Integer.parseInt("a");
        int b = 1;
        assertEquals(1,a + b );
    }

}