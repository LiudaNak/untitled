package myPackage;

class EachNth {


    public static void main(String[] args) {
        EachNth eac = new EachNth();
        eac.eachNth("abcd", 2);
    }

    void eachNth(String a, int n) {

        char[] arr = a.toCharArray();
        for (int i : arr) {
            if (i % n == 0)
                System.out.println(arr[i]);
        }
    }
    }
