/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 *
 * To modify the template, go to Preferences -> Editor -> File and Code Templates -> Other
 */

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      int[] input = {3,2,4,3,7,2,6,4,2,3,11,2,1,7};
      int i = 0;
      while (i <= input.length-1){
         if (i >= 1 || i <= 3)
         System.out.println(input[i]);
         i++;
      }
   }
}