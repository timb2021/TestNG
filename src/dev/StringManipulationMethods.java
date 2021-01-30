public class StringManipulationMethods {
    public static void main(String[] args) {

    }

    public String returnInitialsInCaps(String s) {

        String[] arr = s.split(" ");
        String emptyStr = "";

        if (s.length() != 0) {
            for (int i = 0; i < arr.length; i++) {
                emptyStr += arr[i].toUpperCase().substring(0, 1);
            }

        }

        return emptyStr;
    }
}
