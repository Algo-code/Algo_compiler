import java.util.*;
public class Lex_analyzer {

    Boolean isReservedWord (String ch){
        if(
             ch == "const" ||
             ch == "void" ||
             ch == "int" ||
             ch == "" ||
             ch == "double" ||
             ch == "struct" ||
             ch == "if" ||
             ch == "else" ||
             ch == "case" ||
             ch == "switch" ||
             ch == "default" ||
             ch == "for" ||
             ch == "while" ||
             ch == "do" ||
             ch == "return" ||
             ch == "break" ||
             ch == "continue" ||
             ch == "print" ||
             ch == "scan" 
            )
        return true;
    else
        return false;
    }

    Boolean isDelimiter (char ch){
        if(
             ch == '_' ||
             ch == '(' ||
             ch == ')' ||
             ch == '[' ||
             ch == ']' ||
             ch == '{' ||
             ch == '}' ||
             ch == '<' ||
             ch == '>' ||
             ch == '=' ||
             ch == '+' ||
             ch == '.' ||
             ch == ',' ||
             ch == ':' ||
             ch == ';' ||
             ch == '!' ||
             ch == '?' ||
             ch == '+' ||
             ch == '-' ||
             ch == '*' ||
             ch == '/' ||
             ch == '%' ||
             ch == '^' ||
             ch == '&' ||
             ch == '|' ||
             ch == '~' ||
             ch == '\\' ||
             ch == '"' ||
             ch == '\'' ||
             ch == '`' ||
             ch == '$' ||
             ch == '#' ||
             ch == '@' 
        )
        return true;
    else 
        return false;
    }

    Boolean isOperator (char ch){
        if(
             ch == '+' ||
             ch == '-' ||
             ch == '*' ||
             ch == '/' ||
             ch == '<' ||
             ch == '>' ||
             ch == '=' 
        )
        return true;
    else
        return false;
    }

    Boolean isOperator (String ch){
        if(
             ch == "<= "||
             ch == ">=" ||
             ch == "==" ||
             ch == "!=" 
        )
        return true;
    else
        return false;
    }

    Boolean isValidIdentifier (String str){
      //  int temp=0;
    if (
        str.charAt(0) == '0' ||
        str.charAt(0) == '1' ||
        str.charAt(0) == '2' ||
        str.charAt(0) == '3' ||
        str.charAt(0) == '4' ||
        str.charAt(0) == '5' ||
        str.charAt(0) == '6' ||
        str.charAt(0) == '7' ||
        str.charAt(0) == '8' ||
        str.charAt(0) == '9'
    )
        return false;
    else 
    for(int i=0; i<str.length();i++){
        if(isDelimiter(str.charAt(i)) && (str.charAt(i)!='_'||str.charAt(i)!='$'))
            return false; 

    }
    return true;    
    }
    Boolean isInteger(String str){
        int len = str.length();
        if(len == 0)
            return false;
        for(int i=0; i<len; i++){
            if(
                str.charAt(i) != '0' &&
                str.charAt(i) != '1' &&
                str.charAt(i) != '2' &&
                str.charAt(i) != '3' &&
                str.charAt(i) != '4' &&
                str.charAt(i) != '5' &&
                str.charAt(i) != '6' &&
                str.charAt(i) != '7' &&
                str.charAt(i) != '8' &&
                str.charAt(i) != '9' ||
                (str.charAt(i) == '-' && i>0)
            )
            return false;
        }
        return true;
    }

    Boolean isRealNumber(String str){
        int decimal = 0;
        int len = str.length();
        for(int i=0; i<len; i++){
            if(
                str.charAt(i) != '0' &&
                str.charAt(i) != '1' &&
                str.charAt(i) != '2' &&
                str.charAt(i) != '3' &&
                str.charAt(i) != '4' &&
                str.charAt(i) != '5' &&
                str.charAt(i) != '6' &&
                str.charAt(i) != '7' &&
                str.charAt(i) != '8' &&
                str.charAt(i) != '9' ||
                (str.charAt(i) == '-' && i>0)
            )
            return false;
            if(str.charAt(i) == '.')
                decimal++;
        }
        if (decimal > 1 || decimal < 1)
            return false;
        else 
            return true;
    }
   
    public static void main(char[] args) {
        StringTokenizer Tokenizer = new StringTokenizer("This is a test");
        {
    while(Tokenizer.hasMoreTokens()) {
        System.out.println(Tokenizer.nextToken());
            }
        } 
    }
}