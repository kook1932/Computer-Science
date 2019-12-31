import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public interface MovieMediaManager {
    public abstract void load();
    public boolean isLoaded();
    public void print(int index);
    public void printAll();
    public int find(String str);
}
