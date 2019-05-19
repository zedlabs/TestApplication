package tk.zedlabs.testapplication;

public class Post {

    private String username;
    private String imageUrl;
    private String time;
    private String about;
    private String likes;
    private String shares;

    public Post(String username, String imageUrl, String time, String about, String likes, String shares) {
        this.username = username;
        this.imageUrl = imageUrl;
        this.time = time;
        this.about = about;
        this.likes = likes;
        this.shares = shares;
    }

    public String getUsername() {
        return username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTime() {
        return time;
    }

    public String getAbout() {
        return about;
    }

    public String getLikes() {
        return likes;
    }

    public String getShares() {
        return shares;
    }

}
