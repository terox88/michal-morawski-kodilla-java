package com.kodilla.testing.forum.statistics;

import java.util.HashSet;
import java.util.Set;

public class ForumStatistics {

    private int usersNumber;
    private int postsCount;
    private int commentsCount;
    private double averagePostsToUser;
    private double averageCommentsToUser;
    private double averageCommentsToPost;

    public double getAverageCommentsToUser() {
        return averageCommentsToUser;
    }





    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsToUser() {
        return averagePostsToUser;
    }

    public double getAverageCommentsToPost() {
        return averageCommentsToPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        Set<String> noDuplicateUsers =new HashSet<>();
        for(String name : statistics.usersNames()) {
            noDuplicateUsers.add(name);
        }
        if (statistics.usersNames().size() == 0 || statistics.usersNames() == null) {
            this.usersNumber = 0;
            this.postsCount = 0;
            this.commentsCount = 0;
            this.averagePostsToUser = 0.0;
            this.averageCommentsToUser = 0.0;
            this.averageCommentsToPost = 0.0;
        } else if (statistics.postsCount() == 0) {
            this.usersNumber = noDuplicateUsers.size();
            this.postsCount = 0;
            this.commentsCount = 0;
            this.averagePostsToUser = 0.0;
            this.averageCommentsToUser = 0.0;
            this.averageCommentsToPost = 0.0;

        } else {
            this.usersNumber = noDuplicateUsers.size();
            this.postsCount = statistics.postsCount();
            this.commentsCount = statistics.commentsCount();
            this.averagePostsToUser = (double)postsCount / (double)usersNumber;
            this.averageCommentsToUser = (double)commentsCount / (double)usersNumber;
            this.averageCommentsToPost = (double)commentsCount / (double)postsCount;

        }
    }
    public void showStatistics(){
        System.out.println("Number of users: " + usersNumber + "\n" +
                "Number of posts: " + postsCount + "\n" +
                "Number of comments: " + commentsCount + "\n" +
                "Posts to user: " + averagePostsToUser + "\n" +
                "Comments to user: " + averageCommentsToUser + "\n" +
                "Comments to posts: " + averageCommentsToPost);
    }
}
