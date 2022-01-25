class Result {

    public static String highestValuePalindrome(String s, int n, int k) {
    char[] arr = s.toCharArray();
        int minimum = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                minimum++;
            }
        }
        if (minimum > k) {
            return "-1";
        }
        int changeBoth = k - minimum;
        int i = 0;
        int j = arr.length - 1;
        for (; i <= j; i++, j--) {
            if (arr[i] != arr[j]) {
                char maximum = (char) Math.max(arr[i], arr[j]);
                if (maximum != '9' && changeBoth - 1 >= 0) {
                    arr[i] = '9';
                    arr[j] = '9';
                    changeBoth--;
                } else {
                    arr[i] = maximum;
                    arr[j] = maximum;
                    minimum--;
                }
            } else {
                char maximum = (char) Math.max(arr[i], arr[j]);
                if (maximum != '9' && changeBoth - 2 >= 0) {
                    arr[i] = '9';
                    arr[j] = '9';
                    changeBoth -= 2;
                }
            }
        }
        if (changeBoth != 0 && i - 1 == j + 1) {
            arr[i - 1] = '9';
        }
        String palindrome = new String(arr);
        return palindrome;
    }

}