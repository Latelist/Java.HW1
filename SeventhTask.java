import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Записать в файл следующие данные:
// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23

public class SeventhTask {
    SeventhTask() {
        String filename = "People.txt";
        File file = new File(filename);
        try(FileWriter writer = new FileWriter(file, false))
        {
            String text = "Name Surname Age \nKate Smith 20 \nPaul Green 25 \nMike Black 23";
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
}