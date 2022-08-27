import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = fileReader.readLine()) != null) {
                listNumber.add(Integer.parseInt(line));
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("File not found or errors occurred");
        }
        return listNumber;
    }

    public void writeMax(String filePath, int max) {
        try {
            FileWriter file = new FileWriter(filePath, true);
            file.write("\nMax value is " + max);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int findMax(List<Integer> listNumber) {
        int max = listNumber.get(0);
        for (int i = 1; i < listNumber.size(); i++) {
            if (listNumber.get(i) > max) {
                max = listNumber.get(i);
            }
        }
        return max;
    }
}
