import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class UrlFetcher {
    private URL url;

    public UrlFetcher(String inputUrl) {
        try {
            this.url = new URL(inputUrl);
        } catch (MalformedURLException ex) {
            System.out.println("Provide a valid url!");
        }
    }

    public void downloadAndSaveToFileUrl() {
       if (this.url != null) {
            try {
                ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream("result.html");
                FileChannel fileChannel = fileOutputStream.getChannel();
                fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);

                printUrl();
            } catch (IOException ex) {
                System.out.println("Download failed for " + url + "!");
            }
        }
    }

    // TODO: Catch and handle errors
    private void printUrl() throws IOException, FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("result.html"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}