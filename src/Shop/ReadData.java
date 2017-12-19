package Shop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
/*

public class ReadData {
    private Data d = Data.getInstance();

    public void ReadData()//read data from file.csv
    {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/Shop/data.csv"));
            for (String line : lines) {
                //line=line.replace(" ","");
                d.GetDataList().add(Arrays.asList(line.split(",")));
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/