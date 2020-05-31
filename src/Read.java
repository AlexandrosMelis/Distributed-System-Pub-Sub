import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    private String path= "src\\DS_project_dataset\\busLines.txt";

    public void ReadData() throws FileNotFoundException {
        //String localPath = path + "busLines";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String word = scanner.next();
            System.out.println(" "+word);
        }
        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Read r = new Read();
        r.ReadData();
    }
}
