import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CodeExam {

    public int solution(int X, int[] B, int Z) {
        // write your code in Java SE 8
        double remaining = 0.0;
        double avg = 0.0;
        if (B.length < Z) {
            for (int i = 0; i < B.length; i++) {
                avg += B[i];
            }
            remaining = X - avg;
            avg = avg / B.length;
            return (int) Math.ceil(remaining / avg);
        } else {
            for (int i = (B.length - Z); i < B.length; i++) {
                avg += B[i];
            }
            remaining = X - avg;
            avg = avg / B.length;
            return (int) Math.ceil(remaining / avg);
        }
    }

    public static Boolean testTrues() {
        return true;
    }

    public static Boolean isAnagram(String stringA, String stringB) {
        char[] arrayA = stringA.replace(" ", "").toLowerCase().toCharArray();
        char[] arrayB = stringB.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return new String(arrayA).equals(new String(arrayB));
    }

    public static int solutionA(String[] T, String[] R) {
        HashMap<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < T.length; i++) {
            String testId = T[i];
            String key = getKey(testId);
            String testResult = R[i];
            if (resultMap.get(key) == null) {
                resultMap.put(key, getTestResult(testResult));
            } else {
                if (resultMap.get(key) == 1) {
                    resultMap.put(key, getTestResult(testResult));
                }
            }
        }
        Integer goodOnes = 0;
        for (String key : resultMap.keySet()) {
            if (resultMap.get(key) == 1) {
                goodOnes++;
            }
        }
        Integer result = (goodOnes * 100) / resultMap.size();
        return result;
    }

    public static int solutionB(int[] A, int S) {
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            int divisor = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                divisor++;
                if (sum / divisor == S && sum % divisor == 0) {
                    counter++;
                }
            }
        }
        return counter;  // write your code in Java SE 8

    }

    public static String getKey(String str) {
        String key = "";
        boolean foundNumber = false;
        for (int i = 0; i < str.length(); i++) {
            Boolean flag = Character.isDigit(str.charAt(i));
            if (flag) {
                foundNumber = true;
            } else if (foundNumber) {
                return key;
            }
            key += str.charAt(i);
        }
        return key;
    }

    public static int getTestResult(String str) {
        if (str.equals("Wrong answer") || str.equals("Time limit exceeded") ||
                str.equals("Runtime error")) {
            return 0;
        }
        return 1;
    }

    public static int minDiff(List<Integer> arr) {
        Collections.sort(arr);
        int sol = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int a = arr.get(i);
            int b = arr.get(i + 1);
            sol += Math.abs(a - b);
        }
        return sol;
    }

    public static int maxTickets(List<Integer> tickets) {
        Collections.sort(tickets);
        int max = 0;
        int size = 1;
        for (int i = 0; i < tickets.size() - 1; i++) {
            int a = tickets.get(i);
            int b = tickets.get(i + 1);
            int diff = Math.abs(a - b);
            if (diff == 0 || diff == 1) {
                size++;
            } else {
                //compara quien es mayor
                if (size > max) {
                    max = size;
                    size = 1;
                }
            }
        }
        return max;
    }


}
