import java.util.ArrayList;

public class Post {
    private String dateCreated;
    private String creator;
    private String title;
    private String description;
    private int views;
    private ArrayList<Comment> comments;
    private String altText;
    private int likes;

    public String getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public ArrayList<Comment> getComments() {
        return this.comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public String getAltText() {
        return this.altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Post(String creator, String title, String description, String altText, String dateCreated, int views, int likes) {
        this.dateCreated = dateCreated;
        this.creator = creator;
        this.title = title;
        this.description = description;
        this.views = views;
        this.comments = new ArrayList<Comment>();
        this.altText = altText;
        this.likes = likes;
    }
    
    public String toString() {
        return "| " + title + " | \n| " + description + " | \n| " + "Creator: " + creator + " |";
    }

}
