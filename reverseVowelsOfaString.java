class Solution {
    public String reverseVowels(String s) {
        ArrayList<Integer> locations = new ArrayList<>();
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='A') {
               locations.add(i); 
            }
            if(s.charAt(i)=='e' ||s.charAt(i)=='E') {
               locations.add(i); 
            }
            if(s.charAt(i)=='i' || s.charAt(i)=='I') {
               locations.add(i); 
            }
            if(s.charAt(i)=='o' || s.charAt(i)=='O') {
               locations.add(i); 
            }
            if(s.charAt(i)=='u' || s.charAt(i)=='U') {
               locations.add(i); 
            }
        }
        char temp;
        char[] chars = s.toCharArray();
        int j = locations.size()-1;
        for (int i = 0; i < locations.size(); i++) {
            if (i>=j) {
                break;
            }
            temp = chars[locations.get(i)];
            chars[locations.get(i)] = chars[locations.get(j)];
            chars[locations.get(j)] = temp;
            j--;
        }
        
        return String.valueOf(chars);
    }
}