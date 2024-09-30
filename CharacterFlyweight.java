public class CharacterFlyweight {
  private final char character;
  private final String fontFamily;
  private final int fontSize;
  private final String color;
  private final boolean isBold;
  private final boolean isItalic;

  public CharacterFlyweight(char character, String fontFamily, int fontSize,
                            String color, boolean isBold, boolean isItalic) {
    this.character = character;
    this.fontFamily = fontFamily;
    this.fontSize = fontSize;
    this.color = color;
    this.isBold = isBold;
    this.isItalic = isItalic;
  }

  public void display(int positionX, int positionY) {
    System.out.println("Displaying "+character+" at ( "+ positionX +", "+ positionY+") ");
  }

}
