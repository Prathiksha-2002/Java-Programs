public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words=s.split("\\s+");
        if(words.length>0) {
            return words[words.length-1].length();
        } else {
            return 0;
        }
        }
        public static void main(String[] args) {
            String inputString="Hello World";
            int result=lengthOfLastWord(inputString);
            String inputString1="fly me to the moon";
            int result1=lengthOfLastWord(inputString1);
            String inputString2="luffy is still joyboy";
            int result3=lengthOfLastWord(inputString2);
            System.out.println(result);
            System.out.println(result1);
            System.out.println(result3);
        }

    }

