import java.io.*;

/**
 * Created by amaridev on 01/11/15.
 * Package: PACKAGE_NAME for Exercise1.2_Histogramm.
 */
public class AnalyzeTextFile {

    public static void main(String[] args) {
        if (args.length != 2)
            System.out.println("No parameter fount! --> path:input path:output");
        else {
        }
    }

    public AnalyzeTextFile() {
    }


    private void readFile(String path) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader(path));

        while (br.ready()) {
            System.out.println(br.readLine());
        }
    }

    private void writeFile(String path) throws IOException{
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path));

    }
}


