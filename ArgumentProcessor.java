
import java.util.ArrayList;
import java.util.Arrays;

public class ArgumentProcessor {
    private final String[] args;

    // Constructor:
    public ArgumentProcessor(String[] args) {
        this.args = args;
    }

    public void printArgumentInfo() {
        ArrayList<String> urls = new ArrayList<>();
        urls.addAll(Arrays.asList(args));

        for (String url : urls) {
            System.out.println(url);
        }
    }
}