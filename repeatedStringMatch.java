class Solution {
    public int repeatedStringMatch(String A, String B) {
        String Ao = A;
        if (A.contains(B)) {
                return 1;
            }
        int diff;
        if (B.length()>A.length()) {
            diff = B.length() - A.length();
        } else {
            diff = 2;
        }
        for (int i = 1; i<=diff+1; i++) {
            A = A + Ao;
            if (A.contains(B)) {
                return i+1;
            }
            
        }
        return -1;
    }
}