package autowire.C_exerciseTwo.common;

/**
 * @author Marcin Ogorzalek
 */
public enum Color {
  RESET("\033[0m"),
  GREEN("\033[1;32m"),
  BLUE("\033[0;34m");

  private final String code;

  Color(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return code;
  }
}
