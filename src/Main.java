import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        String dirGames = "/Users/ivanporsak/IdeaProjects/Game";

        List<String> listDir = Arrays.asList("src", "res", "savegames", "temp");
        List<String> listDirSrc = Arrays.asList("main", "test");
        List<String> listDirRes = Arrays.asList("drawables", "vectors", "icons");

        addDirGame(dirGames,listDir);
        addDirGame(dirGames + "/src", listDirSrc);
        addDirGame(dirGames + "/res", listDirRes);

        addFiles(dirGames + "/src/main/Main.java");
        addFiles(dirGames + "/src/main/Utils.java");
        addFiles(dirGames + "/temp/temp.txt");
        String log = sb.toString();
        //Files.write(Path.of("/Users/ivanporsak/IdeaProjects/Game/temp/temp.txt"));

    }

    public static void addFiles(String nameFile){
        try {Files.createFile(Path.of(nameFile));
            sb
                    .append("Файл успешно создан: ")
                    .append(nameFile)
                    .append("\n");
        }
        catch (IOException e){
             sb.append(e.getMessage());
        }
    }

    public static void addDirGame(String dir, List<String> list){
        try {
        for (String s : list) {
            Files.createDirectories(Path.of(dir + "/" + s));
            sb
                    .append("Создана директория: ")
                    .append(dir)
                    .append(s)
                    .append("\n");
        }
        }
        catch (IOException ioException){
            sb.append(ioException.getMessage());
        }
    }
}
