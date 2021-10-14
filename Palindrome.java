public class MyClass {
    public static void main(String args[]) {
        
     String words = "allan";
     boolean palindrome = true;
     String finalWord = "";
    
    for(int i = words.length()-1; i >= 0;i--){
        finalWord += words.charAt(i);
        System.out.println(finalWord);
    }
    
    for(int i = 1; i < words.length(); i++){
    if(words.charAt(i) != finalWord.charAt(i)){
        palindrome = false;
        break;
    }
    }
    if(palindrome ){
        System.out.println("yes");
    }
    else{
        System.out.println("not");
    }
    
    }

}
