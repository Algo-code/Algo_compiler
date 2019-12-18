package lex;
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Lex_analyzer {

    static Boolean isReservedWord (String ch){
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

    static Boolean isDelimiter (char ch){
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
   
    public static void main(String[] args) throws Exception {

        File file = new File("Source.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb =new StringBuffer();
        String line;
        
        while((line=br.readLine()) != null){
            int i=0;
            int j=0;
            if(isDelimiter(line.charAt(i)) && line.charAt(i) == '#')
                i++;
            else if(isDelimiter(line.charAt(i))){
                switch(line.charAt(i)){
                    case '_':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '(':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case ')':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '[':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case ']':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '{':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '}':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '<':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '>':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '=':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '+':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '-':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '.':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case ',':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case ':':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case ';':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '!':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '?':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '*':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '/':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '%':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '^':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '&':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '|':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '~':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '\\':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '"':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '\'':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '`':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '$':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '#':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                    case '@':
                    sb.append(line.charAt(i));
                    sb.append("\n");
                    i++;
                    break;

                default :
                    i++;
                    break;
                }
            }

            else if(isReservedWord(line)){

                switch(line){
                    case "const":
                    sb.append("CONSTTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "void":
                    sb.append("VOIDTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "int":
                    sb.append("INTTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "double":
                    sb.append("DOUBLETK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "STRUCT":
                    sb.append("STRUCTTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "if":
                    sb.append("IFTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "else":
                    sb.append("ELSETK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "case":
                    sb.append("CASETK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "switch":
                    sb.append("SWITCHTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "default":
                    sb.append("DEFAULTTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "for":
                    sb.append("FORTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "while":
                    sb.append("WHILETK ");
                    sb.append(line);
                    sb.append("\n");
                    break;
                    
                    case "do":
                    sb.append("DOTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "return":
                    sb.append("RETURNTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "break":
                    sb.append("BREAKTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "continue":
                    sb.append("CONTINUETK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "print":
                    sb.append("PRINTTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                    case "scan":
                    sb.append("SCANTK ");
                    sb.append(line);
                    sb.append("\n");
                    break;

                }
            }
            sb.append(line);
            sb.append("\n");
        }
        fr.close();
        System.out.println("Contents of file: \n");
        System.out.println(sb.toString());




      /*  String filePath = "C:\\Users\\eudri\\Documents\\CODES\\Compiler\\Algo_compiler\\source.txt";
		
		String content = "";
		 
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
 
        StringTokenizer Tokenizer = new StringTokenizer(content);
        {
            while(Tokenizer.hasMoreTokens()) {
                 System.out.println(Tokenizer.nextToken());
              }
        }
        */
    }
}