package person.appearance;
public enum EyesColor {
    BLUE("голубые"),
    GREEN("зелёные"),
    BROWN("карие"),
    GRAY("серые"),
    DIFF("разные");

    final private String eyesColor;

    EyesColor(String eyesColor){
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return this.eyesColor;
    }
}
