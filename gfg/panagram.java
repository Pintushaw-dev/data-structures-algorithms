public class panagram {
    public static boolean checkpanagram(String s) {
        int[] freq = new int[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch >= 'a' && ch<= 'z'){
                freq[ch -'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="Bawds jog, flick quartz, vex nymph";
        boolean result= checkpanagram(s);
        System.out.println(result);

    }
}
