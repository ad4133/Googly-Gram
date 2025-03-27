public class Giggle extends Post {
    private double brainrotRatio;
    private String replays;
    private double funnyFactor;

    public double getBrainrotRatio() {
        return this.brainrotRatio;
    }

    public void setBrainrotRatio(double brainrotRatio) {
        this.brainrotRatio = brainrotRatio;
    }

    public String getReplays() {
        return this.replays;
    }

    public void setReplays(String replays) {
        this.replays = replays;
    }

    public double getFunnyFactor() {
        return this.funnyFactor;
    }

    public void setFunnyFactor(double funnyFactor) {
        this.funnyFactor = funnyFactor;
    };
    public Giggle(String creator, String title, String description, String altText, String dateCreated, int views, int likes, double brainrotRatio, String replays, double funnyFactor) {
        super(creator, title, description, altText, dateCreated, views, likes);
        this.brainrotRatio = brainrotRatio;
        this.replays = replays;
        this.funnyFactor = funnyFactor;
    }
}