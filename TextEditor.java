import java.util.ArrayList;
import java.util.List;

public class TextEditor {
  private List<CharacterPosition> characterPositionList = new ArrayList<>();
  private CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

  public void addCharacter(char character, String fontFamily, int fontSize, String color,
                           boolean isBold, boolean isItalic, int x, int y) {
        CharacterFlyweight characterFlyweight = factory.getCharacterFlyWeight(character,
            fontFamily, fontSize, color, isBold, isItalic);
        characterPositionList.add(new CharacterPosition(characterFlyweight, x, y));

  }

  public void render() {
    for (CharacterPosition cp : characterPositionList) {
      cp.flyweight.display(cp.x, cp.y);
    }
  }

  private class CharacterPosition {
    CharacterFlyweight flyweight;
    int x, y;

    CharacterPosition(CharacterFlyweight flyweight, int x, int y) {
      this.flyweight = flyweight;
      this.x = x;
      this.y = y;
    }
  }
}
