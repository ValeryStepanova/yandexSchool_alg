import java.util.Scanner;

public class Concentrates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чанов (n): ");
        int n = scanner.nextInt();

        int[] concentrates = new int[n];
        System.out.print("Введите количество концентрата в каждом чане: ");
        for (int i = 0; i < n; i++) {
            concentrates[i] = scanner.nextInt();
        }

        int result = minOperationsToEqualizeConcentrates(n, concentrates);
        if (result != -1) {
            System.out.println("Минимальное количество операций: " + result);
        } else {
            System.out.println("Невозможно уравнять объемы концентрата");
        }
    }

    public static int minOperationsToEqualizeConcentrates(int n, int[] concentrates) {
        int maxConc = 0;
        for (int conc : concentrates) {
            maxConc = Math.max(maxConc, conc);
        }

        long totalConc = 0;
        for (int conc : concentrates) {
            totalConc += conc;
        }

        long targetTotal = (long) maxConc * n;
        if ((targetTotal - totalConc) % n != 0) {
            return -1;  // Невозможно уравнять объемы
        }

        long diff = targetTotal - totalConc;
        int operations = (int) (diff / n);

        return operations;
    }
}
