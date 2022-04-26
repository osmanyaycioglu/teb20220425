package com.teb.training.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamRun6 {

    public static void main(final String[] args) {
        Path path = Paths.get("persons.txt");
        List<String> readAllLinesLoc;
        try {
            readAllLinesLoc = Files.readAllLines(path);
            Map<String, Person> collectLoc = readAllLinesLoc.stream()
                                                            .map(s -> s.split(","))
                                                            .filter(sa -> sa.length == 4)
                                                            .map(sa -> new Person(sa[0].trim(),
                                                                                  sa[1].trim(),
                                                                                  Integer.parseInt(sa[2].trim()),
                                                                                  Integer.parseInt(sa[3].trim())))
                                                            .distinct()
                                                            .collect(Collectors.toMap(p -> p.getName() + p.getSurname(),
                                                                                      p -> p));
            System.out.println(collectLoc);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

