package Shop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
public class SaveReport {

    private Data dr = Data.getInstance();

    public void SaveDataReport() {
        try {
            List<String[]> tmp = new ArrayList<String[]>();
            for (List<String> line : dr.dataReport) {

                tmp.add(line.toArray(new String[0]));
            }

            CsvWriter writer1 = new CsvWriter(new FileWriter("src/Shop/Report.txt"));
            //writer1.writeAll(tmp, false);
            writer1.writeAll(tmp);
            writer1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}*/
