package userInput;

public class UserInput {

    public static class TextInput {
        StringBuilder str = new StringBuilder();
        public void add(char c){
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
                str.append(c);
            }
        }
        public String getValue(){
            return str.toString();
        }
    }

    public static class NumericInput extends   TextInput{
        StringBuilder str = new StringBuilder();
        public void add(char c){
            if (c >= 48 && c <= 58){
                str.append(c);
            }
        }
        public String getValue(){
            return str.toString();
        }

    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
