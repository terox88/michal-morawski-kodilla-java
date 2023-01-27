package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int Id;
    private final String username;
    private final char sex;
    private final LocalDate dayOfBirth;
    private final int numberOfPost;

    public ForumUser(final int id, final String username, final char sex, final int day, final int month, final int year, final int numberOfPost) {
        Id = id;
        this.username = username;
        this.sex = sex;
        this.dayOfBirth = LocalDate.of(year, month, day);
        this.numberOfPost = numberOfPost;
    }

    public int getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (Id != forumUser.Id) return false;
        if (sex != forumUser.sex) return false;
        if (numberOfPost != forumUser.numberOfPost) return false;
        if (!Objects.equals(username, forumUser.username)) return false;
        return Objects.equals(dayOfBirth, forumUser.dayOfBirth);
    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (dayOfBirth != null ? dayOfBirth.hashCode() : 0);
        result = 31 * result + numberOfPost;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dayOfBirth=" + dayOfBirth +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}
