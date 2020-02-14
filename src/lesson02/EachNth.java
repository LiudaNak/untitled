package lesson02;

public class EachNth {
    public static void main(String[] args) {
      EachNth eachNth = new EachNth();
        System.out.println(eachNth.eachNth(2,"abcd"));
    }

    String[] eachNth(int n, String... st) {

        for (int i = 0; i < st.length; i++) {
            if (i % n != 0) {
                continue;
            }
               Srting arr;
        }
    }
}