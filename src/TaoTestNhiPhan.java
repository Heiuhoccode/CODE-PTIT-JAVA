import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class TaoTestNhiPhan {
    public static void main(String[] args) {
        // Tao Object
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("Jhsf00dklT12uhf780LPPZH");
        numbers.add("AAAAddd0000000000000000000T");
        numbers.add("abc");
        numbers.add("a1b2c3");
        numbers.add("0001234000");
        // Ghi ArrayList vào file nhị phân
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"))) {
            oos.writeObject(numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
