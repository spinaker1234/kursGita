package com.sda;

 /**
 * Created by kuba on 22.02.2019.
 */
public class Pracownik {
    private String name;
    private String surname;
    private String birthDate;

    public Pracownik(String name, String surname, String birthDate){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getSurname();
    }
}