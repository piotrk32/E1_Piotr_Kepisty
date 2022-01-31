import java.io.*;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args)
    {
        ArrayList <Character> charDupl =  new ArrayList<Character>();
        String dupl = "aaabbcc";
        for (char c : dupl.toCharArray()){
            charDupl.add(c);
        }
        System.out.println(ArrayUtil.removeRepeatedElements(charDupl));
        ArrayList<Character> charNoDup1 = new ArrayList<Character>();
        String noDup1 = "abc";
        for (char c : noDup1.toCharArray()){
            charNoDup1.add(c);

        }
        System.out.println(ArrayUtil.removeRepeatedElements(charNoDup1));

        ArrayList<LocalTime> localTimesDup1 = new ArrayList<LocalTime>();
        localTimesDup1.add(LocalTime.of(10,30,30));
        localTimesDup1.add(LocalTime.of(10,30,30));
        localTimesDup1.add(LocalTime.of(10,31,30));
        localTimesDup1.add(LocalTime.of(10,31,30));

        ArrayList<LocalTime> localTimesNoDup1 = new ArrayList<LocalTime>();
        localTimesNoDup1.add(LocalTime.of(10, 30, 30));
        localTimesNoDup1.add(LocalTime.of(10, 31, 30));
        localTimesNoDup1.add(LocalTime.of(10, 32, 30));
        localTimesNoDup1.add(LocalTime.of(10, 33, 30));
        System.out.println(ArrayUtil.removeRepeatedElements(localTimesNoDup1));

//        System.out.println(File.fileswithExtension("C:\\Users\\Ja\\IdeaProjects\\Egzamin1\\src", " .java"));






    }









}
