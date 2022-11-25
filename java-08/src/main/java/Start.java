import java.util.Scanner;
class Start
{ 
    public static void main(String[] data) {
        int[] area = {10500, 10700, 10330, 10300,
                        11000, 12000, 20000};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer array: ");
        int code = in.nextInt();
        boolean flag = false;
        for (int i = 0; i < area.length; i++) {
            if (area[i] == code)
            {
            } else {
                flag = true;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
    /*
        public static void main(String[] data) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Command: ");
            String s = in.nextLine();
            char[] a = s.toCharArray();
            int x = 0;
            int y = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 'N') y++;
                if (a[i] == 'S') y--;
                if (a[i] == 'E') x++;    
                if (a[i] == 'W') x--;
            }
            System.out.println(x == 0 && y == 0 ? "Yes" : "No");
        }
        
        public static void main2(String[] data) {
        int[] area = {1, 3, 5, 9, 7, 7, 8};
 //       int[] area = {3, 7, 8, 2};
 //       int[] area = {3};
        boolean flag = true;
        for (int i = 0; i < area.length - 1; i++) {
            if (area[i] > area[i + 1])
                flag = false;
        }
        System.out.println(flag ? "Sorted" : "Random");
    }
*/        
    
}