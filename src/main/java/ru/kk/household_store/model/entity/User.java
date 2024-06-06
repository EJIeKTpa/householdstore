package ru.kk.household_store.model.entity;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", emailUser='" + emailUser + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    private long idUser;
    private String nameUser;
    private String emailUser;
    private String gender;
    private String birthDate;


    public User(String nameUser, String emailUser, String gender, String birthDate) {
        this.idUser = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.gender = gender;
        this.birthDate = birthDate;
    }


    public long getIdUser() {
        return idUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUser == user.idUser && Objects.equals(nameUser, user.nameUser) && Objects.equals(emailUser, user.emailUser) && Objects.equals(gender, user.gender) && Objects.equals(birthDate, user.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, nameUser, emailUser, gender, birthDate);
    }
}