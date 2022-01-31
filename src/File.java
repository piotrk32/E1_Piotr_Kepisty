import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;

public class File
{
    public static File[] fileswithExtension(String path, String fileEx){
        File dir = new File(path);
        File[] files = dir.listFiles((loc, name) -> name.toLowerCase().endsWith(fileEx));
        return files;
}


}
