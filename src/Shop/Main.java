package Shop;

public class Main {

    public static void main(String[] args) {
        Shop myShop = new Shop(new FileReader(),new FileWriter(),new FileSource("src/Shop/data.csv"));
        myShop.startWork();

    }
}
