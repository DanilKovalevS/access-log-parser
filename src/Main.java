import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean infinity = true;
        while (infinity){
            String path = new Scanner(System.in) .nextLine();
            File file = new File(path);
            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();
            if(!fileExist||isDirectory){
                System.out.println("Файл не существует или указанный путь является путём к папке");
                continue;
            }
                System.out.println("Путь указан верно");
            break;
            }




        }
    }