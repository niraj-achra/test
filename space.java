package github;
// import java.util.*;
public class space {  
    public static void main(String[] args) {  
        // Scanner write=new Scanner(System.in);
        String write = "Rpa -rajasthan police training academy";  
        // write.close();
        char[] strArray = write.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                stringBuffer.append(strArray[i]);  
            }  
        }  
        String noSpaceStr2 = stringBuffer.toString();  
        System.out.println(noSpaceStr2);  
    }  
}  