package Shop;

public class Shop {
    IReader reader;
    IWriter writer;
    ASource aSource;
    Data data = Data.getInstance();

    Shop() {
    }

    Shop(IReader reader, IWriter writer, ASource aSource) {
        this.reader = reader;
        this.writer = writer;
        this.aSource = aSource;
    }

    void loadData() {
        data.setDataList(reader.GetData(aSource));//("src/Shop/data.csv")
    }

    public void startWork() {
        loadData();
    }
}
