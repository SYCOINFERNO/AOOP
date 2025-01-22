import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

abstract class DataImporter {

    public final void importData(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        String data = new String(bytes);
        List<String> parsedData = parseData(data);
        List<String> validatedData = validateData(parsedData);
        saveData(validatedData);
    }

    protected abstract List<String> parseData(String data);

    protected abstract List<String> validateData(List<String> parsedData);

    protected abstract void saveData(List<String> validatedData);
}

class CSVImporter extends DataImporter {

    @Override
    protected List<String> parseData(String data) {
        List<String> parsedData = new ArrayList<>();
        String[] lines = data.split("\n");
        for (String line : lines) {
            String[] values = line.split(",");
            parsedData.add(String.join(",", values)); // Example: Join values back into a string
        }
        return parsedData;
    }

    @Override
    protected List<String> validateData(List<String> parsedData) {
        List<String> validatedData = new ArrayList<>();
        for (String row : parsedData) {
            // Simple validation: Check if row has at least 2 values
            if (row.split(",").length >= 2) {
                validatedData.add(row);
            }
        }
        return validatedData;
    }

    @Override
    protected void saveData(List<String> validatedData) {
        try {
            Files.write(Paths.get("output.csv"), validatedData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Placeholder for XMLImporter and JSONImporter 
// (Implement these classes as needed)
class XMLImporter extends DataImporter {

    @Override
    protected List<String> parseData(String data) {
        // Implement XML data parsing logic (e.g., using a library like JDOM or JAXB)
        List<String> parsedData = new ArrayList<>();
        // ... XML parsing logic ...
        return parsedData;
    }

    @Override
    protected List<String> validateData(List<String> parsedData) {
        // Implement XML data validation logic
        List<String> validatedData = new ArrayList<>();
        // ... XML validation logic ...
        return validatedData;
    }

    @Override
    protected void saveData(List<String> validatedData) {
        // Implement XML data saving logic
    }
}

class JSONImporter extends DataImporter {

    @Override
    protected List<String> parseData(String data) {
        // Implement JSON data parsing logic (e.g., using a library like Gson or Jackson)
        List<String> parsedData = new ArrayList<>();
        // ... JSON parsing logic ...
        return parsedData;
    }

    @Override
    protected List<String> validateData(List<String> parsedData) {
        // Implement JSON data validation logic
        List<String> validatedData = new ArrayList<>();
        // ... JSON validation logic ...
        return validatedData;
    }

    @Override
    protected void saveData(List<String> validatedData) {
        // Implement JSON data saving logic
    }
}

public class DataImportExample {

    public static void main(String[] args) throws IOException {
        CSVImporter csvImporter = new CSVImporter();
        csvImporter.importData("data.csv"); 
    }
}