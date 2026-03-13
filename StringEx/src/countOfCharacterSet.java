//Character set count
//        Given an integer N and a string A consisting of lowercase English alphabets of length N, the task is to calculate the distinct characters appearing in each substring of A and determine the number of unique sets that can be obtained.
//
//        Notes
//
//        • A substring of a string is a contiguous subsequence of that string. For
//
//        example, string "earth" is substring of string "hackerearth", but string "erth" is not.
//
//        Function description
//
//        Complete the count_sets function. This function takes the following 2 parameters and returns an integer:
//
//        • N: Represents the integer N
//
//        • A: Represents the string A
//        Input format for custom testing
//
//        Note: Use this input format if you are testing against custom input or writing code
//        in a language where we don't provide boilerplate code.
//
//        • The first line contains T, which represents the number of test cases.
//
//        • For each test case:
//
//        • The first line contains an integer N denoting the length of the string.
//        • The second line contains a string A of length N.
//
//        Output format
//
//        For each test case, return the number of distinct sets that can be obtained in a new line.

import javax.annotation.processing.SupportedSourceVersion;
import java.util.HashSet;
import java.util.Set;

public class countOfCharacterSet {

    public static void main(String[] str){

        int n = 4;
        String A = "abca";
       int count = countCharSet(n,A);
//        int count1 = countCharSet1(n,A);
       System.out.println(" here count is "+ count);

    }


    private static int countCharSet(int N, String a) {
        Set<Set<Character>> uniqueSet = new HashSet<>();
       int count=0;
        Set<Character> currentSet = new HashSet<>();
        for(int i=0 ; i<N ;i++) {
            currentSet.clear();
            for (int j = i; j < N; j++) {
                currentSet.add(a.charAt(j));
//                count++;
                uniqueSet.add(new HashSet<>(currentSet));

                System.out.println(" for value of " +j  +  " currentSet value is "+ currentSet+ " and unique set value is"+ uniqueSet);

            }
        }
        System.out.print(" here unique set is "+ uniqueSet);
        return uniqueSet.size();

    }

//    a
//    ab
//    abc
//    b
//    bc
//    c

//    =======

//    abca
//    a, ab, abc, b, bc,bca,c,ca




}
