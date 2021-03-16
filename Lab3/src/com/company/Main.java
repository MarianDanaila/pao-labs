package com.company;

public class Main {

    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static int nrChars = 256;

    public static boolean areAnagram(char[] str1, char[] str2) {
        int[] count = new int[nrChars];
        int i;

        for(i = 0; i < str1.length; i++)
        {
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }

        if (str1.length != str2.length)
            return false;

        for(i = 0; i < nrChars; i++)
            if (count[i] != 0)
            {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        // ex1
        var area = new Area();
        area.printAddress();

        // ex2
        System.out.println(isPalindrome("maam"));

        // ex3
        System.out.println(areAnagram("ana".toCharArray(), "ebf".toCharArray()));
    }
}
