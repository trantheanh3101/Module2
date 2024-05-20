package Lesson9_TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

//    Sprint 1: Tạo kiểm thử và làm cho nó thất bại
    @Test
    public void testAdd() {
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }

//    Sprint 3: Tạo tiếp kiểm thử thứ hai kiểm tra xem nếu cộng một số với
//    một số có giá trị bằng giá trị lớn nhất theo kiểu dữ liệu lưu trữ.

    @Test
    public void testAdd2() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        Calculator instance = new Calculator();
        try {
            int result = instance.add(x, y);
            assertFalse(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testAdd3() {
        int x = Integer.MIN_VALUE;
        int y = -1;
        Calculator instance = new Calculator();
        try {
            int result = instance.add(x, y);
            assertFalse(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
