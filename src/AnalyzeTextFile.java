import java.io.*;

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
     String outputString = "";
        return outputString;
    }

    private String readFile(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String out = "";
        while (br.ready()) {
            out += br;
        }
        return out;
    }

    private void writeFile(String path, String write) throws IOException{
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path));

    }
}


