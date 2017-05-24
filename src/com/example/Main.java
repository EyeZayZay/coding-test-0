package com.example;

public class Main {

    public int fibonacci(int n) {
        int fibo = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
       for (int i = 2; i < n; i++) {
           fibo += (i - 2) + (i - 1);
       }
       return fibo;
    }

    public String reverse(String s)  {
        String rev = "";
        for (int i = s.length() - 1; i > -1; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String rev = words[words.length - 1] + " ";
        for (int i = words.length -  2; i > -1; i--) {
            rev += words[i] + " ";
        }
        return rev;
    }


    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        System.out.println("Hello World!");
        System.out.println(main.fibonacci(1));
        System.out.println(main.fibonacci(2));
        System.out.println(main.fibonacci(3));
        System.out.println(main.fibonacci(4));
        System.out.println(main.fibonacci(5));
        System.out.println(main.reverse("Have a good day"));
        System.out.println(main.reverseWords("Have a good day"));
    }


}
