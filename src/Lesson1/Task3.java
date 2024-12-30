package Lesson1;

import java.util.*;

public class Task3 {

    public static char[][] cleanDot(char[][] arr) {
        List<char[]> listWithoutSame = new ArrayList<>();
        for (char[] i : arr) {
            if (!isDot(i)) {
                listWithoutSame.add(i);
            }
        }
        return listWithoutSame.toArray(new char[listWithoutSame.size()][]);
    }

    public static char[][] clearColumn(char[][] arr) {
        List<List<Character>> list = new ArrayList<>();
        int rows = arr.length;
        int cols = arr[0].length;
        for (int j = 0; j < cols; j++) {
            List<Character> columns = new ArrayList<>();
            for (char[] chars : arr) {
                columns.add(chars[j]);
            }
            list.add(columns);
        }
        char[][] transpArray = new char[cols][rows];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                transpArray[i][j] = list.get(i).get(j);
            }
        }
        transpArray = clearSameChar(transpArray);
        return transpArray;
    }

    public static char[][] clearSameChar(char[][] arr) {
        List<char[]> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 1; i < list.size(); i++) {
            int buf = i - 1;
            if (Arrays.equals(list.get(i), list.get(buf))) {
                list.remove(buf);
                i--;
            }
        }
        return list.toArray(new char[list.size()][]);
    }

    public static boolean isDot(char[] arr) {
        for (char c : arr) {
            if (c != '.') {
                return false;
            }
        }
        return true;
    }

    public static char[][] reverseArr(char[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        char[][] newArr = new char[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newArr[j][i] = arr[i][j];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        int count = 0;
        for (char[] chars : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (chars[j] == '.') {
                    count++;
                }
            }
        }
        if (count != n * n) {
            arr = cleanDot(arr);
            arr = reverseArr(arr);
            arr = cleanDot(arr);
            char[][] uniqChar = clearSameChar(arr);

            char[][] newArr = clearColumn(uniqChar);
            char[][] arrI = {
                    {'#'}
            };
            char[][] arrP = {
                    {'#', '#', '#'},
                    {'#', '.', '#'},
                    {'#', '#', '#'},
                    {'#', '.', '.'}
            };
            char[][] arrL = {
                    {'#', '.'},
                    {'#', '#'},
            };
            char[][] arrO = {
                    {'#', '#', '#'},
                    {'#', '.', '#'},
                    {'#', '#', '#'}
            };
            char[][] arrH = {
                    {'#', '.', '#'},
                    {'#', '#', '#'},
                    {'#', '.', '#'},
            };
            char[][] arrC = {
                    {'#', '#'},
                    {'#', '.'},
                    {'#', '#'}
            };

            for (char[] ch : newArr
            ) {
                System.out.println(ch);
            }
            System.out.println();
            if (Arrays.deepEquals(newArr, arrI)) {
                System.out.println("I");
            } else if (Arrays.deepEquals(newArr, arrC)) {
                System.out.println("C");
            } else if (Arrays.deepEquals(newArr, arrO)) {
                System.out.println("O");
            } else if (Arrays.deepEquals(newArr, arrH)) {
                System.out.println("H");
            } else if (Arrays.deepEquals(newArr, arrL)) {
                System.out.println("L");
            } else if (Arrays.deepEquals(newArr, arrP)) {
                System.out.println("P");
            } else {
                System.out.println("X");
            }
        } else {
            System.out.println("X");
        }
    }
}