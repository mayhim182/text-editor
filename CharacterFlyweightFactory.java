import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
  private Map<String, CharacterFlyweight> flyweightMap = new HashMap<>();

  public CharacterFlyweight getCharacterFlyWeight(char character, String fontFamily, int fontSize,
                                                         String color, boolean isBold, boolean isItalic) {
    String key = character + fontFamily + fontSize + color + isBold + isItalic;
    if (!flyweightMap.containsKey(key)) {
      flyweightMap.put(key, new CharacterFlyweight(character, fontFamily, fontSize, color, isBold, isItalic));
    }
    return flyweightMap.get(key);

  }

}
