package cardGame;

public enum Suit {
    TRIANGLES, CIRCLES, CROSSES, SQUARES, STARS, WHOT;


    @Override
    public String toString() {
        return switch (this) {
            case CIRCLES -> "Circle";
            case SQUARES -> "Squares";
            case CROSSES -> "Crosses";
            case TRIANGLES -> "Triangles";
            case STARS -> "Stars";
            case WHOT -> "Whot";
        };
    }
}