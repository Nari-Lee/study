package projectTest;

public class ListSort {
  //리스트 전각 반각 칸 맞춰주고 너비 정렬
  public static String adjustLength(String input, int length) {
    if (input == null) {
      return String.format("%-" + length + "s", "");
    }
    int totalWidth = 0;
    for (char c : input.toCharArray()) {
      if (isFullWidth(c)) {
        totalWidth += 2;
      } else {
        totalWidth += 1;
      }
    }
    int paddingLength = length - totalWidth;
    if (paddingLength > 0) {
      return input + " ".repeat(paddingLength);
    } else {
      return input;
    }
  }

  public static boolean isFullWidth(char c) {
    // 유니코드 범위로 전각 문자인지 확인
    return (c >= '\u1100' && c <= '\u115F') || // Hangul Jamo
        (c >= '\u2E80' && c <= '\uA4CF') || // CJK Radicals Supplement and Kangxi Radicals
        (c >= '\uAC00' && c <= '\uD7A3') || // Hangul Syllables
        (c >= '\uF900' && c <= '\uFAFF') || // CJK Compatibility Ideographs
        (c >= '\uFE10' && c <= '\uFE19') || // Vertical forms
        (c >= '\uFE30' && c <= '\uFE6F') || // CJK Compatibility Forms
        (c >= '\uFF00' && c <= '\uFF60') || // Fullwidth Forms
        (c >= '\uFFE0' && c <= '\uFFE6');   // Fullwidth Symbol Forms
  }
}
