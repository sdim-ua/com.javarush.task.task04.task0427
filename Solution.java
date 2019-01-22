/* 
Описываем числа

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numb = Integer.parseInt(reader.readLine());
        
        if(numb < 1000 && numb > 0 && numb < 10 && numb % 2 == 0 ){
            System.out.println("четное однозначное число");
        }
        else if(numb < 1000 && numb > 0 && numb < 10 && numb % 2 != 0 ){
            System.out.println("нечетное однозначное число");
        }
         else if(numb < 1000 && numb > 0 && numb < 100 && numb % 2 == 0 ){
            System.out.println("четное двузначное число");
        }
         else if(numb < 1000 && numb > 0 && numb < 100 && numb % 2 != 0 ){
            System.out.println("нечетное двузначное число");
        }
        else if(numb < 1000 && numb > 0 && numb % 2 == 0 ){
            System.out.println("четное трехзначное число");
        }
        else if(numb < 1000 && numb > 0 && numb % 2 != 0 ){
            System.out.println("нечетное трехзначное число");
        }
         
    }
    
}
