package tk.zedlabs.testapplication;

public class Tournament {

    private String name;
    private String location;
    private String imageUrl;

    public Tournament(String name, String location, String imageUrl, String status) {
        this.name = name;
        this.location = location;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getStatus() {
        return status;
    }

    private String status;

}
