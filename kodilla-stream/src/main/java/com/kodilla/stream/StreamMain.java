package com.kodilla.stream;



import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (LocalDate.now().getYear() - user.getDayOfBirth().getYear()) >= 20)
                .filter(user -> user.getNumberOfPost() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        resultMap.entrySet().stream()
                .forEach(System.out::println);


    }





}

