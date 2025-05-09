public class Story extends Post {
    private double relationship;
    
    public Story(String creator, String title, String description, String altText, String dateCreated, int views, int likes, double relationship, String[] comments) {
        super(creator, title, description, altText, dateCreated, views, likes, comments);
        this.relationship = relationship;
    }

    public void like() {
        super.like();
        this.relationship += 2.0;
    }

    public String react() {
        String[] reactions = new String[] {"Laughing Face", "Happy Face", "Angry Face", "Frowny Face", "Heart"};
        int index = (int) (Math.random() * 5);
        this.relationship += 5.0;
        return "You reacted with " + reactions[index];
    }
}