package Lesson1;
import java.util.Scanner;
/**/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(side());

    }

    public static String side() {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(); // coordinate of SW
        int y1 = scanner.nextInt(); //coordinate of SW
        int x2 = scanner.nextInt();// coordinate of NE
        int y2 = scanner.nextInt(); // coordinate of NE
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x < x1 && y > y1 && y < y2) {
            return "W";
        } else if (x <= x1 && y <= y1) {
            return "SW";
        } else if (x<=x1 && y>=y2) {
            return "NW";
        } else if (x>x1 && x<x2 && y>y2) {
            return "N";
        } else if (x>=x2 && y>=y2) {
            return "NE";
        } else if (x>x2 && y<y2 && y>y1) {
            return "E";
        }else if(x>=x2 && y<=y1){
            return "SE";
        }else if(x>x1 && x<x2 && y<y1){
            return "S";
        }
        return null;
    }
}
