import java.util.HashMap;

public class Downloader {
    public static void main(String[] args) {
        ArgumentProcessor argsProcessor = new ArgumentProcessor(args);
        HashMap<String, String> config = argsProcessor.getConfigMap();
        // argsProcessor.printArgsInfo();

        String inputUrl = config.get("url");
        UrlFetcher urlFetcher = new UrlFetcher(inputUrl);
        urlFetcher.downloadAndSaveToFileUrl();
    }
}