import java.util.TreeMap;

public class WordsCounting {
    public static void main(String[] args) {
        String inputString = new String("Chương trình đếm các lần xuất hiện của từ trong một văn bản và hiển thị các từ và sự xuất hiện của chúng theo thứ tự trong bảng chữ cái của các từ.");
        inputString = inputString.replaceAll(",","");
        inputString = inputString.toLowerCase();
        String[] splitString = inputString.split("[ ,.]");

        TreeMap<String, Integer> myMap = new TreeMap<>();

        for (String s : splitString) {
            if (!myMap.containsKey(s)) {
                myMap.put(s, 1);
            } else {
                myMap.put(s, (myMap.get(s)) + 1);
            }
        }

        for(String entry : myMap.keySet()) {
            System.out.println(entry + " : "+ myMap.get(entry));
        }
    }
}
