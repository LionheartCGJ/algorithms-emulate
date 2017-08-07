package com.artcode.string.shift;

/**
 * 题目描述：
 * 定义字符串的左旋转操作：把字符串前面的若干个字符移动到字符串的尾 部，如把字符串 abcdef 左旋转 2 位得到字符串
 * cdefab。请实现字符串左旋转的 函数，要求对长度为n的字符串操作的时间复杂度为O(n)，空间复杂度为O(1)。
 *
 */
public class ShiftString {
    /**
     * 方法1：暴力移位法 一位一位的移动
     */

    public static char[] leftShiftOne(char[] chars, int count) {
        for (int i = 0; i < count; i++) {
            char head = chars[0];
            for (int j = 1; j < chars.length; j++) {
                chars[j - 1] = chars[j];
            }
            chars[chars.length - 1] = head;
        }
        return chars;
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        leftShiftOne(chars, 3);
        for(char s : chars)
        System.out.println(s + " ");
    }

}
