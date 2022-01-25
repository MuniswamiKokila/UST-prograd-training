class Solution {
    public void reverseString(char[] s) {
        
       int len = s.length;
        char reverse[]=new char[100000];

    if (len == 0)
        return ;
        

    int j=0;
    for (int i=len-1; i >=0; i--){
      reverse[j]=s[i];
        j++;
    }

    for (int i=0; i < len; i++){
        s[i]=reverse[i];
    }
    
    System.out.print(s);

    }
}