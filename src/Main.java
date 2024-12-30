
public class Main {
    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        String[] strings;
        String info;
        StringBuilder answer = new StringBuilder();
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            int sum = 0;
            int countOfUnique = 0;
            int result = 0;
            int numOfLetter = 1;
            info = scanner.nextLine();
            Matcher matcher = pattern.matcher(info);
            Set<Character> set = new HashSet<>();
            while (matcher.find()) {
                char ch = matcher.group().charAt(0);
                set.add(ch);
            }
            countOfUnique = set.size();
            strings = info.split(",");
            char firstLetter = strings[0].charAt(0);
            for (char j = 'A'; j <= 'Z'; j++) {
                if (j == firstLetter) {
                    break;
                } else {
                    numOfLetter++;
                }
            }
            String day = strings[strings.length - 3];
            String month = strings[strings.length - 2];
            int[] arr = (day + month).chars().map(Character::getNumericValue).toArray();
            for (Integer value : arr
            ) {
                sum += value;
            }
            result = countOfUnique + sum * 64 + numOfLetter * 256;
            String buf = Integer.toHexString(result).toUpperCase();
            if (buf.length() > 3) {
                answer.append(buf.substring(buf.length() - 3)).append(" ");

            } else {
                answer.append(String.format("%3s", buf).replace(' ', '0')).append(" ");
            }
        }
        System.out.print(answer.substring(0, answer.length() - 1));*/
    }
}