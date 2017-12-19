package Shop;
/*
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveData {
    private Data d = Data.getInstance();

    public void SaveData() {
        try {
            List<String[]> tmp = new ArrayList<String[]>();
            for (List<String> line : d.datalist) {
                tmp.add(line.toArray(new String[0]));
            }
            CsvWriter writer1 = new CsvWriter(new FileWriter("src/Shop/data.csv"));
            writer1.writeAll(tmp, false);
            //writer1.writeAll(tmp);
            writer1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}*/