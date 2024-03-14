public class Main {
    public static void main(String[] args) {


        public class Main {
    private static int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0};

    public static void main(String[] args) {
        // Tạo hai đối tượng luồng
        SumThread thread1 = new SumThread(0, numbers.length / 2);
        SumThread thread2 = new SumThread(numbers.length / 2, numbers.length);

        // Bắt đầu thực thi các luồng
        thread1.start();
        thread2.start();

        try {
            // Đợi cho tất cả các luồng kết thúc
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Tổng của hai phần tử tổng hợp từ hai luồng
        int totalSum = thread1.getPartialSum() + thread2.getPartialSum();
        System.out.println(totalSum);
    }

    static class SumThread extends Thread {
        private int start;
        private int end;
        private int partialSum;

        public SumThread(int start, int end) {
            this.start = start;
            this.end = end;
            this.partialSum = 0;
        }

        public void run() {
            // Tính tổng của các phần tử từ start đến end
            for (int i = start; i < end; i++) {
                partialSum += numbers[i];
            }
        }

        public int getPartialSum() {
            return partialSum;
        }
    }
}

    }
}
