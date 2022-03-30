import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){

        String dirGames = "/Users/ivanporsak/IdeaProjects/Game";
        String dirSrc = "/src";
        String dirRes = "/res";

        List<String> listDir = Arrays.asList("src", "res", "savegames", "temp");
        List<String> listDirSrc = Arrays.asList("main", "test");
        List<String> listDirRes = Arrays.asList("drawables", "vectors", "icons");

        addDirGame(dirGames,listDir);
        addDirGame(dirGames + dirSrc, listDirSrc);
        addDirGame(dirGames + dirRes, listDirRes);


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
