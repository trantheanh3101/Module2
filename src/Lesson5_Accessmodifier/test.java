//package Lesson5_Accessmodifier;
//
//public class test {
//    int code;
//    String name;
//    static String nameSchool;
//
//    public test(int code, String name, String nameSchool) {
//        this.code = code;
//        this.name = name;
//        this.nameSchool = nameSchool;
//    }
//
//    public static void  changeSchool(String nameSchool){
//        this.nameSchool = nameSchool;
//        // this dung tham chieu Object da khoi tao => trong static nay , ob chua dc khoi tao
//    }
//
//    public class MyClass {
//        static String nameS = "a";
//        String name = "h";
//
//        private static int count = 0; // Lỗi: Biến static không được phép trong phương thức phi static
//
//        public void incrementCount() {
//            count++; // Lỗi: Không thể truy cập biến static từ phương thức phi static
//        }
//
//        static {
//            nameS = "coo";
//            this.name = "h";
//            // Trong khối static initializer, không thể tham chiếu đến biến instance `name`.
//        }
//
//        public static void changeName(String t) {
//            this.name = " tttt ";
//            // Trong phương thức static, không thể tham chiếu đến biến instance `name`.
//        }
//
//        public void changeNameSchool(String nameS) {
//            // Sử dụng từ khóa `this` để tham chiếu đến biến instance `nameS`.
//            this.nameS = nameS;
//        }
//    }
//
//
//
//}
