package ch03;

public class Javabook3Ex06 {

   public static void main(String[] args) {
////////////////////////      소수점3번째자리에서 반올림 round사용
      int fahrenheit = 100;
//      double result = (double)5/9*(fahrenheit-32);
//      float celcius = (float)Math.round(result*100)/100;
      
      
//      System.out.println("fahrenheit:" + fahrenheit);
//      System.out.println("celcius : " + celcius);

//////////////////////      string.format/////////////////
//      
//      double result = (double)5/9*(fahrenheit-32);
//      String celcius = String.format("%.2f", result);
//      
//      
//      System.out.println("fahrenheit:" + fahrenheit);
//      System.out.println("celcius : " + celcius);
      
///////////////////////////////////////////
      
      double result = (double)5/9*(fahrenheit-32);
      float celcius = (float)(((result*100)/2)+0.005);
      
      
      System.out.println("fahrenheit:" + fahrenheit);
      System.out.println("celcius : " + celcius);
      
   }

}