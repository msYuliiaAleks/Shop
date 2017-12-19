package Shop;

public class FileSource extends ASource {

    FileSource (String path)
    {
        this.source=path;
    }

    String GetSource() {
        return source;
    }

}
