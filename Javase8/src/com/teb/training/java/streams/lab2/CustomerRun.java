package com.teb.training.java.streams.lab2;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.teb.training.java.streams.lab1.Customer;

public class CustomerRun {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            Path path = Paths.get("customers.txt");
            List<String> readAllLinesLoc = Files.readAllLines(path);
            Map<String, Customer> customerMap = readAllLinesLoc.stream()
                                                               .map(s -> s.split(","))
                                                               .filter(sa -> sa.length == 4)
                                                               .map(sa -> new Customer(sa[0],
                                                                                       sa[1],
                                                                                       sa[2],
                                                                                       new BigDecimal(Integer.parseInt(sa[3]))))
                                                               .collect(Collectors.toMap(c -> c.getUsername(),
                                                                                         c -> c));
            System.out.println("username : ");
            String username = scannerLoc.nextLine();
            Customer customerLoc = customerMap.get(username);
            if (customerLoc != null) {
                System.out.println("Hoş geldin " + customerLoc.getName() + " " + customerLoc.getSurname());
            } else {
                System.out.println("Böyle bir kullanıcı yok");
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
