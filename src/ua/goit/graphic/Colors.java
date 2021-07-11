package ua.goit.graphic;

public enum Colors {
    Black("Black"), White("White"),
    Red("Red"), Green("Green"),
    Blue("Blue"), Orange("Orange"),
    Yellow("Yellow"), Violet("Violet"), Pink("Pink");

    private final String colorName;

    Colors(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return colorName;
    }
}
