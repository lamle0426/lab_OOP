package OtherProjects.hust.soict.globalict.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        System.out.println("Creating garbage");

        try {
            while (true) {
                int[] garbage = new int[100_000_000];
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Out of memory. The program has crashed due to excessive garbage creation");
        }
    }
}