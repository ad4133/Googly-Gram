public class Giggle extends Post {
    private double brainrotRatio;
    private double funnyFactor;

    public double getBrainrotRatio() {
        return this.brainrotRatio;
    }

    public void setBrainrotRatio(double brainrotRatio) {
        this.brainrotRatio = brainrotRatio;
    }

    public double getFunnyFactor() {
        return this.funnyFactor;
    }

    public void setFunnyFactor(double funnyFactor) {
        this.funnyFactor = funnyFactor;
    };
    
    public Giggle(String creator, String title, String description, String altText, String dateCreated, int views, int likes, double brainrotRatio, double funnyFactor, String[] comments) {
        super(creator, title, description, altText, dateCreated, views, likes, comments);
        this.brainrotRatio = brainrotRatio;
        this.funnyFactor = funnyFactor;
    }

    public void like() {
        super.like();
        this.funnyFactor += 1.0;
        if (this.funnyFactor > 100.0) {
            this.funnyFactor = 100.0;
        }
    }

    public void laugh() {
        this.brainrotRatio += 5;
        this.funnyFactor = 100.0;
    }
}