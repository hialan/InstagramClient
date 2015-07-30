package com.codepath.instagramclient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ycliutw on 7/30/15.
 */
public class InstagramPhoto {
    public String username;
    public String profile_picture;
    public String caption;
    public String imageUrl;
    public int imageHeight;
    public int likesCount;
    public int commentsCount;
    public List<InstagramComment> comments;

    public InstagramPhoto() {
        comments = new ArrayList<>();
    }
}
