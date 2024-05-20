package Lesson9_TDD;

public class Calculator {

//    Sprint 1:
//    Phiên bản thứ 1 của Calculator
//    public int add(int x, int y) {
//        throw new UnsupportedOperationException("not support operator");
//    }

//    Sprint 2:
//    Phiên bản thứ hai của Calculator
//    public int add(int x, int y) {
//        return x + y;
//    }

    //    Sprint 3:
//    public int add(int x, int y) {
//        if (x / 2 + y / 2 >= Integer.MAX_VALUE / 2) {
//            throw new RuntimeException("out of range exception");
//        }
//        return x + y;
//    }

    //    Sprint 4:
    public int add(int x, int y) {
        if (x / 2 + y / 2 >= Integer.MAX_VALUE / 2) {
            throw new RuntimeException("out of range exception");
        }

        if (x / 2 + y / 2 <= Integer.MIN_VALUE / 2) {
            throw new RuntimeException("out of range exception");
        }

        return x + y;
    }
}
