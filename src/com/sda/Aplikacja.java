package com.sda;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class Aplikacja {

    public static void main(String[] args) {

        Aplikacja app = new Aplikacja();

        Pracownik osoba1 = new Pracownik("Jan", "Kowalski", "1980-11-02");

        Pracownik osoba2 = new Pracownik("Anna", "Zamojska", "1989-03-02");

        Pracownik osoba3 = new Pracownik("Janina", "Kot", "1986-04-02");

        Pracownik osoba4 = new Pracownik("Antoni", "Robak", "1997-12-02");

        Pracownik osoba5 = new Pracownik("Weronika", "Kocińska", "2001-07-14");

        Pracownik osoba6 = new Pracownik("Jan", "Abacki", "1978-02-23");

        List<Pracownik> pracownicy = new ArrayList<Pracownik>();

        pracownicy.add(osoba1);

        pracownicy.add(osoba2);

        pracownicy.add(osoba3);

        pracownicy.add(osoba4);

        pracownicy.add(osoba5);

        pracownicy.add(osoba6);


        // zapis do pliku

        //zabawa ze stream's

        List<Pracownik> namedJan = pracownicy

                .stream()

                .filter((p) -> p.getName().equals("Jan"))

                .collect(Collectors.toList());

        //3 pierwszych pracowników urodzonych przed określonym rokiem        //for(com.sda.Aplikacja.Pracownik prac : urodzeniePrzed)

        //    System.out.println(prac.toString());

        namedJan.forEach(System.out::println);

        //urodzeniePrzed.forEach((p) -> System.out.print(p.getNazwisko() + " " + p.getDataUrodzenia()));

        //Wszystkich pracowników posortowanych według (rosnącej) pensji        //Pracowników urodzonych w pierwszej połowie roku posortowanych wg imion

        //Sumę pensji wszystkich pracowników    }

    }


}
