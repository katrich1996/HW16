import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> LinkedTest = new LinkedList<>();
        LinkedTest.add("a");
        LinkedTest.add("b");
        LinkedTest.add("c");
        LinkedTest.add("d");
        LinkedTest.add("e");
        LinkedTest.remove(3);///операция удаления
        System.out.println(LinkedTest);
        System.out.println(LinkedTest.get(2));////операция поиска

        ArrayList<String> ArrayTest = new ArrayList<>();
        ArrayTest.add("a");
        ArrayTest.add("b");
        ArrayTest.add("c");
        ArrayTest.add("d");
        ArrayTest.add("e");
        ArrayTest.remove(0);
        System.out.println(ArrayTest);
        System.out.println(ArrayTest.get(3));
    }
}