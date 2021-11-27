public class ShadesOfGrey {
    static String[] shadesOfGrey(int num) {
        if(num <= 0) num = 0;
        if(num > 254) num = 254;
        String[] res = new String[num];
        for(int i = 0; i < num; i++) {
            res[i] = String.format("#%1$02x%1$02x%1$02x", i + 1);
        }
        return res;
    }
}