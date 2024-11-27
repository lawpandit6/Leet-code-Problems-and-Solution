class Solution {
    public boolean isPalindrome(int x) {
       String st=Integer.toString(x);
       String check="";
       for(int i=0;i<(st.length());i++){
        if(st.charAt(i)==st.charAt(st.length()-i-1)){
            check=check+st.charAt(st.length()-i-1);
        }
       } 
       return check.equals(st);
    }
}