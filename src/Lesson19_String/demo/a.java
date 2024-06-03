package Lesson19_String.demo;

class StringBufferExample_daluong {
    public static void main(String[] args) {
        StringBuffer sharedBuffer = new StringBuffer("Start");

        // Tạo nhiều luồng để ghi vào sharedBuffer
        Thread thread1 = new Thread(new BufferWriter(sharedBuffer, "Thread1"));
        Thread thread2 = new Thread(new BufferWriter(sharedBuffer, "Thread2"));
        Thread thread3 = new Thread(new BufferWriter(sharedBuffer, "Thread3"));

        // Bắt đầu các luồng
        thread1.start();
        thread2.start();
        thread3.start();

        // Đợi các luồng hoàn thành
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // In kết quả cuối cùng
        System.out.println("Final buffer content: " + sharedBuffer.toString());
    }
}

class BufferWriter implements Runnable {
    private StringBuffer buffer;
    private String text;

    public BufferWriter(StringBuffer buffer, String text) {
        this.buffer = buffer;
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            buffer.append(" " + text + " " + i);
        }
    }
}

