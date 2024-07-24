import java.util.*;

public class Strings{
    public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            } 
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static String toUpperCase(String str){
      StringBuilder sb = new StringBuilder("");
      char ch = Character.toUpperCase((str.charAt(0)));
      sb.append(ch);
      for(int i=1;i<str.length();i++){
        if(str.charAt(i) ==' ' &&  i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));

        }
        else{
            sb.append(str.charAt(i));
        }
      }
      return sb.toString();
    }
    public static String FindSubStr(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
        public static float DirChk(String prompt){
        int x=0,y=0;
        for(int i = 0;i<prompt.length();i++){
            char dir=prompt.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static boolean CheckPal(String str){
        int n = str.length();
        int half = str.length()/2;
        for(int i = 0;i<half;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
    }
}
return true;
}
    public static void PrintLetters(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
     static void main(String[] args) {
       //char arr[] = {'a', 'b', 'c', 'd'};
       //String str1 = "abcd";
       //String str2 = new String("xyz");

       //Strings are Immutable

       //Scanner sc = new Scanner(System.in);
       //String name;
       //name = sc.next();

       //Fix the variable declaration
       //String line;
        
       // Read the remaining line
       //sc.nextLine();  // consume the leftover newline
       //line = sc.nextLine();

       //System.out.println(name);
       //System.out.println(line);
       //String full_name = new String("J Singh");
       //System.out.println("Length of the full_name is: "+full_name.length());

       //String first_name = "Japjot";
       //String last_name = "Singh";
       //String full_name = first_name+" "+last_name;
       //System.out.println(full_name);
       //System.out.print(first_name.charAt(0));System.out.print(last_name.charAt(0));
       // PrintLetters(full_name);
       //String PalVerify="RACECAR";
       // System.out.println(CheckPal(PalVerify));
       //String prompt = "WNEESENNN";
       //System.out.println(DirChk(prompt));
       //   sc.close();
       //String s1 = "Tony";
       //String s2 = "Tony";
       //String s3 = new String("Tony");
       //if(s1==s2){
        //System.out.println("Strings are equal");
       //}
       //else{
        //System.out.println("Strings are not equal");
       //}
       //if(s1==s3){
        //System.out.println("Strings are equal");
       //}
       //else{
        //System.out.println("Strings are not equal");
       //}
       //if(s1.equals(s3)){
       // System.out.println("Strings are equal");
       //}
       //else{
        //System.out.println("Strings are not equal");
       //}
       
       //String str="HelloJItwillbealright";
       //System.out.println(str.substring(5,10));
       //System.out.println(FindSubStr(str,5,10));
       
       //String fruits[]={"apple","mango","banana"}; 
       //String largest = fruits[0];
       //for(int i=0;i<fruits.length;i++){
       // if(largest.compareTo(fruits[i])<0){
        //    largest=fruits[i];
       // }
       //}
       //System.out.println(largest);
       
       //StringBuilder sb = new StringBuilder("");
       //for(char ch='a';ch<='z';ch++){
        //sb.append(ch);
       //}
       //System.out.println(sb.toString());

       //String str="hi i am jsingh";
       //System.out.print(toUpperCase(str));

       String str="aaaabbbbcccddd";
       System.out.println(compress(str));
    }
}
