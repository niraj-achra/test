package github;
import java.util.Scanner;

class number{
    void digitNum(){
        int a,rem,dev,temp;
        int count=0;
        int count1=0;
        int count2=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        a= sc.nextInt();
        sc.close();

      for(int i=1;i<=a;i++){
           
     if(i<10){
            count+=2;
        }
     else if(i>=10 && i<100){
             count1+=6;
        }
     else if(i>=100 && i<1000){
             count+=2;
        }
          count2=count1+count;
        }  
       temp=count2;
          rem=temp/10;
         dev=count2%10;
           System.out.println(rem+dev);  
    }
}
class Digit{
    public static void main(String[] args) {
       number t= new number();

     t.digitNum();
        
    } 
 }
