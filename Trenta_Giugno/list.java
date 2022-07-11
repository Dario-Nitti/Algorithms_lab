package Trenta_Giugno;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class list {


    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(new File("C:\\Users\\Dario\\Desktop\\COMPARE.txt").toPath(), Charset.defaultCharset());
        FileWriter myWriter = new FileWriter("C:\\Users\\Dario\\Desktop\\COMPARE.txt");

        Collections.sort(list, new Name());
        int counter = 0;
        for (String l : list){
            counter++;
        myWriter.write(l);
    }

        myWriter.close();
    }

    private static class Name implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}






