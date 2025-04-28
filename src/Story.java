public class Story extends Post {
    private double relationship;
    
    public Story(String creator, String title, String description, String altText, String dateCreated, int views, int likes, double relationship) {
        super(creator, title, description, altText, dateCreated, views, likes);
        this.relationship = relationship;
    }

    public void like() {
        super.like();
        this.relationship += 2.0;
    }
}