import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38){
                result.add(grades.get(i));
                continue;
            }
            if ((grades.get(i) + 1) % 5 == 0) {
                result.add(grades.get(i) +1 );
            } else if ((grades.get(i) + 2) % 5 == 0){
                result.add(grades.get(i) +2 );
            } else {
                result.add(grades.get(i));
            }
        }

        return  result;
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int fallenApples = 0;
        int fallenOranges = 0;

        for (int i = 0; i < apples.length; i++) {

            if (apples[i] > 0 && (a + apples[i]) >= s && (a +apples[i]) <= t){
                fallenApples++;
            }

        }

        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] < 0 && (b + oranges[i]) >= s && (b + oranges[i]) <= t){
                fallenOranges++;
            }
        }

        System.out.println(fallenApples);
        System.out.println(fallenOranges);

    }

    static String kangaroo(int x1, int v1, int x2, int v2) {

//        if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2))
//            return "NO";
//
//
//        int i = 0;
//        while (i < Integer.MAX_VALUE){
//            i++;
//
//
//            if (x1 == x2){
//                return "YES";
//            }
//            else if( x1 - x2 == (x1 + v1) - (x2 + v2)) {
//                break;
//            }
//
//            x1 += v1;
//            x2 += v2;
//
//        }
//
//        return "NO";


        String response = "NO";
        boolean canCatchUp = (v2 < v1);
        if(canCatchUp) {
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if(willIntersectOnLand) {
                response = "YES";
            }
        }

        return response;
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int count = 0;
        int first = a.get(a.size() -1);
        int last = b.get(0);

        for (int i = first; i <= last; i++) {
            int mod = 0;
            for (int j = 0; j < a.size(); j++) {
                mod += i % a.get(j);
            }
            for (int k = 0; k < b.size(); k++) {
                mod += b.get(k) % i;
            }
            if (mod == 0)
                count++;
        }
        return count;
    }

    static int[] breakingRecords(int[] scores) {
        int highScore = 0;
        int lowScore = 0;
        int highestScore = scores[0];
        int lowestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highestScore){
                highScore++;
                highestScore = scores[i];
            } else if (scores[i] < lowestScore){
                lowScore++;
                lowestScore = scores[i];
            }
        }
        int[] records = {highScore, lowScore};
        return records;
    }

    static int birthday(List<Integer> s, int d, int m) {

        int sum = 0, ways = 0;
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
        for (int i = 0; i < s.size() - m +1; i++) {
            if (sum == d)
                ways++;
            if (i+m < s.size())
                sum = sum - s.get(i) + s.get(i+m);
        }
        return ways;
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {


        int result = 0;

        for (int i = 0; i < n - 1 ; i++) {

            for (int j = i + 1; j < n; j++) {

                if((ar[i] + ar[j]) % k == 0)
                    result++;


            }
        }

        return result;

    }

    static int migratoryBirds(List<Integer> arr) {
        int ary[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ary[arr.get(i)]++;
        }
        int max = 0, maxPos = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (ary[i] > max){
                max = ary[i];
                maxPos = i;
            }
        }

        return maxPos;
    }

    static String dayOfProgrammer(int year) {

        if (year == 1918)
            return "26.09.1918";

        if ( (year < 1918 && year % 4 == 0) || ( year > 1918 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) )
            return "12.09." + year;
        else
            return "13.09." + year;

    }

    static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i == k)
                continue;
            sum += bill.get(i);
        }
        if (sum/2 == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - sum/2);
    }

    public static void main(String[] args) {

//        List<Integer> grades = new ArrayList<>();
//        grades.add(84);
//        grades.add(73);
//        grades.add(67);
//        grades.add(38);
//        grades.add(33);
//        List<Integer> result = gradingStudents(grades);
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i));
//        }

//        int[] apples = new int[] {-2, 2, 1};
//        int[] oranges = new int[] {5, -6};
//        countApplesAndOranges(7 ,11 ,5,15,apples,oranges);

//        System.out.println(kangaroo(0,3,4,2));

//        List<Integer> a = new ArrayList<>(Arrays.asList(2,4));
//        List<Integer> b = new ArrayList<>(Arrays.asList(16,32,96));
//        System.out.println(getTotalX(a,b));

//        int[] scores = new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1};
//        int[] result = breakingRecords(scores);
//        System.out.println(result[0] + " " + result[1]);


//        List<Integer> s = new ArrayList<>();
//        s.add(1);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);
//        int result = birthday(s, 3 , 2);
//        System.out.println(result);


//        int[] ar = new int[] {1,3,2,6,1,2};
//        System.out.println(divisibleSumPairs(6,3,ar));


//        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4));
//        System.out.println(migratoryBirds(arr));

//        System.out.println(dayOfProgrammer(1800));


    }
}
