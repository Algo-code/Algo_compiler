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

    Bool isDelimiter (char ch){
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

    Bool isOperator (char ch){
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

    Bool isOperator (String ch){
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

    public static void main(char[] args) {
        
    }
}