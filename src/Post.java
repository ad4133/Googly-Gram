import java.util.ArrayList;

public class Post {
    private String dateCreated;
    private String creator;
    private String title;
    private String description;
    private int views;
    private String[] comments;
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

    public String[] getComments() {
        return this.comments;
    }

    public void setComments(String[] comments) {
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

    public Post(String creator, String title, String description, String altText, String dateCreated, int views, int likes, String[] comments) {
        this.dateCreated = dateCreated;
        this.creator = creator;
        this.title = title;
        this.description = description;
        this.views = views;
        this.comments = comments;
        this.altText = altText;
        this.likes = likes;
    }
    
    public String toString() {
        return "TITLE | " + title + " | \nDESCRIPTION | " + description + " | \nCREATOR | " + creator + " | \nCONTENT | " + altText + " | \nVIEWS | " + this.views + " viwes | \nLIKES | " + this.likes + " likes | ";
    }

    public void like() {
        this.likes += 1;
    }

    public String commentsToString() {
        String commentsString = "| COMMENTS |\n";

        for (String comment: comments) {
            commentsString += comment;
            commentsString += "\n";
        }

        return commentsString;
    }

}
