package OtherProjects.hust.soict.globalict.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        System.out.println("Manage memory responsibly");

        try {
            for (int i = 0; i < 1_000; i++) {
                int[] data = new int[100_000];
                process(data);
                System.gc();
            }
            System.out.println("Program completed without running out of memory");
        } catch (OutOfMemoryError e) {
            System.err.println("Out of memory");
        }
    }

    private static void process(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
    }
}
