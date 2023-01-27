package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(111, "Marian", 'M', 12, 9, 1999, 67 ));
        userList.add(new ForumUser(112, "Betty", 'F', 4, 12, 2010, 123 ));
        userList.add(new ForumUser(113, "Wong", 'M', 29, 11, 1987, 567 ));
        userList.add(new ForumUser(114, "Kajko", 'M', 13, 1, 1995, 54 ));
        userList.add(new ForumUser(115, "Amanda", 'F', 30, 10, 1967, 300 ));
        userList.add(new ForumUser(116, "Carol", 'F', 2, 4, 1982, 16 ));
        userList.add(new ForumUser(117, "Max", 'M', 1, 4, 2019, 0 ));
    }
    public final List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
