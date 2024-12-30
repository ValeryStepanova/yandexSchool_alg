package Lesson1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        List<int[]> list = new ArrayList<>();
        if (a > 0 && c > 0) {
            list.add(new int[]{b+1, d+1});
        }
        if (b > 0 && d > 0) {
            list.add(new int[]{a+1, c+1});
        }
        if (a > 0 && b > 0) {
            list.add(new int[]{Math.max(a, b) + 1, 1});
        }
        if (c > 0 && d > 0) {
            list.add(new int[]{1, Math.max(c, d) + 1});
        }
        int[] m = list.stream().min(Comparator.comparingInt(pair -> pair[0] + pair[1])).orElse(new int[]{});
        System.out.println(m[0]+" "+m[1]);
    }
}
