import java.util.*;

public class Example {
    public static void main(String[] args) {
        /*

        3D ARRAYLIST STRING STORAGE
        ---
        Example.java
        ---
        This Java program stores strings in 3-dimensional ArrayLists.
        ---
        How to use each dimension:

        Each X dimension has Y and Z dimensions.
        Each Y dimension has Z dimensions.

        Strings inside each Z dimension are concatenated with nothing in between. Ex: "World", "!" = "World!"
        Each Y dimension is concatenated with a space in between its Z dimensions. Ex: "Hello", "World!" = "Hello World!"
        Each X dimension is concatenated with a newline in between its Y dimensions. Ex: "Hello World!", "Goodbye World!" = "Hello World!\nGoodbye World!"

         */

        ArrayList<ArrayList<ArrayList<String>>> arrList = new ArrayList<ArrayList<ArrayList<String>>>();

        arrList.add(new ArrayList<ArrayList<String>>());
        arrList.add(new ArrayList<ArrayList<String>>());

        arrList.get(0).add(new ArrayList<String>());
        arrList.get(0).add(new ArrayList<String>());

        arrList.get(1).add(new ArrayList<String>());
        arrList.get(1).add(new ArrayList<String>());
        arrList.get(1).add(new ArrayList<String>());

        arrList.get(0).get(0).add("Hello");
        arrList.get(0).get(1).add("World");
        arrList.get(0).get(1).add("!");

        arrList.get(1).get(0).add("Goodbye");
        arrList.get(1).get(1).add("World");
        arrList.get(1).get(1).add("!");
        arrList.get(1).get(2).add("\uD83D\uDC4B");

        for (ArrayList<ArrayList<String>> arrayLists : arrList) {
            for (ArrayList<String> arrayList : arrayLists) {
                for (String s : arrayList) {
                    System.out.print(s);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}