package Shop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileReader implements IReader {

    Data data = Data.getInstance();

    public List<Drink> GetData(ASource source) {
        List<String> resultList = loadData(source);
        if ((resultList != null) && (resultList.size() != 0)) {

            return parseData(resultList);
        }
        return null;

    }

    List<String> loadData(ASource source) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(source.GetSource()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    List<Drink> parseData(List<String> lines) {
    List<Drink> listDrinks = null;
        for (String line : lines) {
            List<String> lineList = Arrays.asList(line.split(","));
            if ((lineList.get(4).contains("%")) && (lineList.get(5).length() <= 4)) {

                AlcDrink alcDrink = new AlcDrink();
                alcDrink.setName(lineList.get(0));

                System.out.println(lineList.get(4));
                listDrinks.add(alcDrink);
            }

            System.out.println();
        }
        return null;
    }


}
