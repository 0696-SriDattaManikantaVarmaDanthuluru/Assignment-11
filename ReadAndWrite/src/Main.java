import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("D:\\java prac\\Assignement-11\\ReadAndWrite\\source.txt.txt");
             FileWriter writer = new FileWriter("D:\\java prac\\Assignement-11\\ReadAndWrite\\dest.txt")) {
            StringBuilder s = new StringBuilder();
            int character;
            while ((character = reader.read()) != -1) {
                s.append((char) character);
            }
            System.out.println(s);
            writer.write(s.toString());
        } catch (FileNotFoundException e) {
            System.out.println("File not Found " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
