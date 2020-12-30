public class Main {
    public static void main(String[] args) {

       char charValue = 'F';

       switch (charValue) {
           case 'A':
               System.out.println("Is A");
               break;
           case 'B':
               System.out.println("Is B");
               break;
           case 'C': case 'D': case 'E':
               System.out.println("Is C, D or E");
           default:
               System.out.println("Not Found");
       }
    }
}
