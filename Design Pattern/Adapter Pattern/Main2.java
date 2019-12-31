
public class Main2 {
    public static void main(String[] args) {
      String s = "³ª¿ì ÀÌÁî ±Â";
      MovieMediaManager mmm = new MovieMediaAdapter("MovieMedia.data");

      mmm.printAll();
      System.out.println("Printing 0th item");
      mmm.print(0);
      System.out.printf("Searching: %s\n", s);
      
      int idx = mmm.find(s);
      if (idx >= 0) {
          System.out.printf("Found at index %d\n", idx);
          mmm.print(idx);
      }
      else {
          System.out.printf("%s is not found\n", s);
      }
  }
}
