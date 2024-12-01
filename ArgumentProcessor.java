
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArgumentProcessor {
    private final String[] args;
    private HashMap<String, String> argsMap = new HashMap<>();

    // Constructor:
    public ArgumentProcessor(String[] args) {
        this.args = args;
    }

    public void printArgsInfo() {
        ArrayList<String> urls = new ArrayList<>();
        urls.addAll(Arrays.asList(args));

        for (String url : urls) {
            System.out.println(url);
        }
    }

    public HashMap<String, String> getConfigMap() {
        String argKey;
        String argValue;

        for(String arg : args) {
            try {
                String[] parts = arg.split("=");
                argKey = parts[0].toLowerCase();
                argValue = parts[1];

                argsMap.put(argKey, argValue);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Format: `url=`");
            }
        }

        return argsMap;
    }
}