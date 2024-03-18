package exercise;

import java.util.stream.IntStream;

public class ReversedSequence implements CharSequence {
    private String str;

    public ReversedSequence(String str) {
        StringBuilder sb = new StringBuilder(str);
        this.str = sb.reverse().toString();

    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return str.substring(start, end);
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }

    @Override
    public String toString() {
        return str;
    }
}
