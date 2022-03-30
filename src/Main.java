import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String dirGames = "/Users/ivanporsak/IdeaProjects/Game";
        List<String> listDir = Arrays.asList("src", "res", "savegames", "temp");
        addDirGame(dirGames,listDir);
    }

    public static void addDirGame(String dir, List<String> list){
        try {
        for (String s : list) {
            Files.createDirectories(Path.of(dir + "/" + s));
            sb
                    .append("Создана директория: ")
                    .append(dir)
                    .append(s);
        }
        }
        catch (IOException ioException){
            sb.append(ioException.getMessage());
        }
    }
}
