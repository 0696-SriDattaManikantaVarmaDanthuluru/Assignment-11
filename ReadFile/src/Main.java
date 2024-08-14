import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\java prac\\Assignement-0\\ReadAndWrite\\src\\source.txt");
        String s = "";
//        try {
            FileReader sr=new FileReader(file); //
            BufferedReader abc = new BufferedReader(sr);
            while((s=abc.readLine())!=null){ //
                System.out.println(s);
            }
//        } catch (Exception e){
//            System.out.println("Exception caught"+e.getMessage());
//        }
    }
}