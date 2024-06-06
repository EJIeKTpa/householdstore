package ru.kk.household_store.model.entity;

import java.util.Objects;

public class UserData {
    private Long userPassport;
    private String userFullName;

    public UserData(Long userPassport, String userFullName) {
        this.userPassport = userPassport;
        this.userFullName = userFullName;
    }

    public Long getUserPassport() {
        return userPassport;
    }

    public void setUserPassport(Long userPassport) {
        this.userPassport = userPassport;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    @Override
    public String toString() {
        return "UserPassport{" +
                "userPassport=" + userPassport +
                ", userFullName='" + userFullName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(userPassport, userFullName);
    }
}
