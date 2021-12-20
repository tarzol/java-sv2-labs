package aaa_exam2.owlCounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {

    List<Owl> owlList = new ArrayList<>();
    List<String> lines = new ArrayList<>();

    public void readFromFile(Path path) {
    //file olvasása
        try {
           lines = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.");
        }
        for ( String line : lines ) {
            String[] tmp = line.split("=");
            owlList.add(new Owl(tmp[0], Integer.parseInt(tmp[1])));
        }
    }

    public int getNumberOfOwls(String county) {
        int numberOfOwls = 0;
        boolean countyExist = false;
        for ( Owl item : owlList ) {
            if ( item.getCounty().equals(county)) {
                countyExist = true;
                numberOfOwls = item.getNumber();
            }
        }
        if ( countyExist == false) {
            throw new IllegalArgumentException("No such county in Hungary!");
        }
        return numberOfOwls;
    }

    public int getNumberOfAllOwls() {
        int numberOfOwls = 0;
        for (Owl item : owlList) {
            numberOfOwls += item.getNumber();
        }
        return numberOfOwls;
    }



    /*
    List<Owl> owlList = new ArrayList<>();


    public void readFromFile(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }

        for ( String item : lines) {
            String[] tmp = item.split("=");
            owlList.add(new Owl(tmp[0], Integer.parseInt(tmp[1])));
        }
    }


    public  int getNumberOfOwls(String county) {
        int number = 0;
        for (Owl item : owlList) {
            if ( item.getCounty().equals(county)) {
               return item.getNumber();
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int number = 0;
        for (Owl item : owlList) {
            number += item.getNumber();
        }
        return number;
    }*/
}


