package com.enter;

public class Hello {
    public static void main(String[] args) {
        String text = "Madam, I'm Adam!";
        int cnt = 0;
        String text1 =text.replaceAll("[^a-zA-Z0-9]","").toUpperCase();
        for (int i = 0; i < text1.length(); i++){
            if (text1.charAt(i) == text1.charAt(text1.length() - i - 1)) cnt += 1;
        }
        boolean flag;
        flag = cnt == text1.length();
        System.out.println(flag);
    }
}