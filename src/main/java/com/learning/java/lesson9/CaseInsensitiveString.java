package com.learning.java.lesson9;

public class CaseInsensitiveString {
    private String s;

    public CaseInsensitiveString(String s){
        this.s = s;

    }

    @Override
    public boolean equals(Object o){
        if (o instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if(o instanceof String){
            return s.equalsIgnoreCase(((String) o));
        }
        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cA = new CaseInsensitiveString("A");
        CaseInsensitiveString a = new CaseInsensitiveString("a");

        //case1
        System.out.println(cA.equals(a));
        System.out.println(a.equals(cA));

        //case2
        String strA = "A";
        System.out.println(a.equals(strA));
        System.out.println(strA.equals(a));
    }
}
