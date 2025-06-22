class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = s.length();
        int groups = (int)Math.ceil((double)size / k);
        String arr[] = new String[groups];
        
        int idx = 0;
        for(int i = 0; i < size; ) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < k; j++) {
                if (i < size) {
                    char ch = s.charAt(i);
                    sb.append(ch);
                    i++;
                } else {
                    sb.append(fill);
                }
            }
            arr[idx++] = sb.toString();
        }
        return arr;
    }
}
