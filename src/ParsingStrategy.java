import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ParsingStrategy {
    abstract public ArrayList<String> parse(String file) throws FileNotFoundException, IOException;
}
