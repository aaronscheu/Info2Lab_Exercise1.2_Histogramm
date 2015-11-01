import java.io.*;
import java.util.HashMap;

/**
 * Created by amaridev on 01/11/15.
 * Package: PACKAGE_NAME for Exercise1.2_Histogramm.
 */

public class AnalyzeTextFile {

    public static void main(String[] args) throws IOException{
        if (args.length != 2)
            System.out.println("No parameter fount! --> path:input path:output");
        else {
            AnalyzeTextFile analyzeTextFile = new AnalyzeTextFile(args[0], args[1]);
        }
    }

    public AnalyzeTextFile(String pathIn, String pathOut) throws IOException{
        writeFile(pathOut, analyze(readFile(pathIn)));
    }

    public String analyze(String inputString){
        String sOutputString = "";
        int[] iaTable = new int[26];
        HashMap <Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c != ' ') {
                // Increment existing value in HashMap.
                // ... Start with zero if no key exists.
                int value = hashMap.getOrDefault((int) c, 0);
                hashMap.put((int) c, value + 1);
            }
        }
        for (int key : hashMap.keySet()) {
            sOutputString += ((char) key + ": " + hashMap.get(key)) + "\n";
        }

        return sOutputString;
    }

    private String readFile(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String sOut = "", line;
        while (br.ready()) {
            line = br.readLine();
            if (line == null) break;
            sOut += line;
        }
        br.close();
        return sOut;
    }

    private void writeFile(String path, String sWrite) throws IOException{
        PrintWriter writer = new PrintWriter(path);
        writer.write(sWrite);
    }
}


