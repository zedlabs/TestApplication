package tk.zedlabs.testapplication;

public class Ground {


    private String name;
    private String location;
    private String imageUrl;
    private String status;

    public Ground(String name, String location, String imageUrl, String status) {
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

}
