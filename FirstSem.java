//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида////"Доброе утро, <Имя>!", если время от 05:00 до 11:59////"Добрый день, <Имя>!", если время от 12:00 до 17:59;////"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;////"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Scanner;

public class  FirstSem {
    public static void main(String[] args) {
        
    }
    static void task0() {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if(hour>=5 && hour<12){
            System.out.println("Доброе утро");
        } else if(hour>=12 && hour<18){
            System.out.println("Добрый день");      
        }  else if (hour < 23 && hour>=18){
             System.out.println("Добрый вечер " + name);
         } else {
             System.out.println("Доброй ночи " + name);
         }
         scanner.close();
    }
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.//
/**
 * 
 */
static void task1(){
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
        int maxOnes = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                temp++;
            } else {
                if (temp > maxOnes){
                maxOnes = temp;}
                temp = 0;
            }
        }
        if(temp > maxOnes){
            maxOnes = temp;
        }
        System.out.println(maxOnes);
    }
}