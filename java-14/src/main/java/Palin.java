
class Parlin {

    
    boolean check(String s) {
        boolean value = true;
        char[] data = s.toCharArray();
        for(int i = 0, j = data.length - 1; i <= j; i++, j--) {
            if (data[i] != data[j]) {
                value = false;
                break;
            }
        }
        return value;
    }
}