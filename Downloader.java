public class Downloader {
    public static void main(String[] args) {
        //ArgumentProcessor argsProcessor = new ArgumentProcessor(args);
        // argsProcessor.printArgsInfo();

        String inputUrl = args[0];
        UrlFetcher urlFetcher = new UrlFetcher(inputUrl);
        urlFetcher.downloadAndSaveToFileUrl();
    }
}