import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();


        File fileSrc = new File("/Users/ivanporsak/IdeaProjects/Game/src");
        if (fileSrc.mkdir()){
            sb.append("Директория src создана");
        }
        else {
            sb.append("\n ОШИБКА! Директория src не создана или уже существует");
        }
        File fileSrcMain = new File("/Users/ivanporsak/IdeaProjects/Game/src/main");
        if (fileSrcMain.mkdir()){
            sb.append("\n Директория src/main создана");
        }
        else {
            sb.append("\n ОШИБКА ! Директория src/main не создана или уже существует");
        }
        File fileSrcMaimFile = new File("/Users/ivanporsak/IdeaProjects/Game/src/main/main.java");
        try{
            if(fileSrcMaimFile.createNewFile()){
            sb.append("\n Файл main.java создан");
            }
        }catch (IOException ioe){
            sb
                    .append("\n")
                    .append(ioe.getMessage());
        }
        File fileSrcMaimUtils = new File("/Users/ivanporsak/IdeaProjects/Game/src/main/utils.java");
        try {
            if(fileSrcMaimUtils.createNewFile()){
                sb.append("\n Файл utils.java создан");
            }
        }catch (IOException ioException){
            sb
                    .append("\n")
                    .append(ioException.getMessage());
        }


        File fileSrcTest = new File("/Users/ivanporsak/IdeaProjects/Game/src/test");
        if (fileSrcTest.mkdir()){
            sb.append("\n Директория src/test создана");
        }
        else {
            sb.append("\n ОШИБКА ! Директория src/test не создана или уже существует");
        }


        File fileRes = new File("/Users/ivanporsak/IdeaProjects/Game/res");
        if (fileRes.mkdir()){
            sb.append("\n Директория res созданна");
        }
        else {
            sb.append("\n ОШИБКА! Директория res не создана или уже существует");
        }


        File fileResDrawables = new File("/Users/ivanporsak/IdeaProjects/Game/res/drawables");
        if (fileResDrawables.mkdir()){
            sb.append("\n Директория res/drawables создана");
        }
        else {
            sb.append("\n ОШИБКА ! Директория не создана или уже существует");
        }


        File fileResVectors = new File("/Users/ivanporsak/IdeaProjects/Game/res/vectors");
        if(fileResVectors.mkdir()){
            sb.append("\n Директория res/vectors создана");
        }
        else {
            sb.append("\n ОШИБКА ! Директория res/vectors не создана или уже сужествует");
        }


        File fileResIcons = new File("/Users/ivanporsak/IdeaProjects/Game/res/icons");
        if(fileResIcons.mkdir()){
            sb.append("\n Директория res/icons создана");
        }
        else {
            sb.append("\n ОШИБКА ! Директория res/icons не создана или уже существует ");
        }


        File fileSavegames = new File("/Users/ivanporsak/IdeaProjects/Game/savegames");
        if (fileSavegames.mkdir()){
            sb.append("\n Директория savegames создана");
        }
        else {
            sb.append("\n ОШИБКА ! Директория savegsmes не создана или уже существует");
        }


        File fileTemp = new File("/Users/ivanporsak/IdeaProjects/Game/temp");
        if (fileTemp.mkdir()){
            sb.append("\n Директория temp создана");
        }
        else {
            sb.append("\n ОШИБКА! Директория temp не создана или уже существует");
        }
        File fileTempFile = new File("/Users/ivanporsak/IdeaProjects/Game/temp/temp.txt");
        try {
            if(fileTempFile.createNewFile()){
                sb.append("\n Файл temp.txt создан");
            }
        }catch (IOException e){
            sb
                    .append("\n")
                    .append(e.getMessage());
        }


        try{
            FileWriter fileWriter = new FileWriter(fileTempFile);
            String str = sb.toString();
            fileWriter.write(str);
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
