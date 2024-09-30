public class Main {
  public static void main(String[] args) {
    TextEditor editor = new TextEditor();

    editor.addCharacter('H', "Arial", 12, "black", false, false, 0, 0);
    editor.addCharacter('e', "Arial", 12, "black", false, false, 10, 0);
    editor.addCharacter('l', "Arial", 12, "black", false, false, 20, 0);
    editor.addCharacter('l', "Arial", 12, "black", false, false, 30, 0);
    editor.addCharacter('o', "Arial", 12, "black", false, false, 40, 0);

    // Simulate rendering
    editor.render();
  }
}
