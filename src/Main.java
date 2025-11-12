import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean infinity = true;
        while (infinity) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExist || isDirectory) {
                System.out.println("Файл не существует или указанный путь является путём к папке");
                continue;
            }
            System.out.println("Путь указан верно");
            int maxLenght = 0;
            int minLenght = 1024;
            int linesCount = 0;
            try {
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.length() > 1024) {
                        throw new RuntimeException("Превышен лимит символов для одной строки - 1024 max");
                    }
                    int length = line.length();
                    linesCount++;
                    if (length > maxLenght) {
                        maxLenght=length;
                    }
                    if (length < minLenght) {
                        minLenght=length;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
            System.out.println(maxLenght+" || "+minLenght+" || "+linesCount);
            break;
        }

    }
}