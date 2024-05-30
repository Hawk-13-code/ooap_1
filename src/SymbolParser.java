import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SymbolParser extends ParsingStrategy {
    @Override
    public ArrayList<String> parse(String file) throws FileNotFoundException, IOException {
        System.out.println("Algorithm name: Words parser");
        System.out.println("Description: Parsing file by regex splitting words by space");

        long start = System.currentTimeMillis();

        File input = new File(file);
        BufferedReader fileReader = new BufferedReader(new FileReader(input));

        ArrayList<String> res = new ArrayList<>();
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] splitted = line.split("\\s+");
            for (String i : splitted) {
                res.add(i);
            }
        }

        fileReader.close();

        System.out.println("Algorithm time of execution: " + (System.currentTimeMillis() - start) + "ms");

        return res;
    }
}
