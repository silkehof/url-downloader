public class Downloader {
    public static void main(String[] args) {
        System.out.println("Argument count: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument at pos " + i + ": " + args[i]);
        }
    }
}