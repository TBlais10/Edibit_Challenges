package com.company;

public class ReverseTheString {

    public static String specialReverseString(String str) {

        StringBuilder reversed = new StringBuilder(str.replaceAll("\\s+", "").toLowerCase()).reverse();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isSpaceChar(c)) {
                reversed.insert(i, ' ');
            } else if (Character.isUpperCase(c)) {
                char lower = reversed.charAt(i);
                reversed.setCharAt(i, Character.toUpperCase(lower));

            }
        }

        System.out.println(reversed);
        return reversed.toString();

    }
}


//    private String orginalString = "";
//    private char[] originalChars = new char[orginalString.length()];
//    private  int[] caseCheckArr = new int [orginalString.length()];


//    public String specialReverseString(String str) {
//    this.orginalString = str;
//
//        return "";
//
//    }
//
//    public char[] checkString(){
//        char[] originalChars = new char[orginalString.length()];
//        int[] caseCheckArr = new int [orginalString.length()];
//
//        for (int i = 0; i < orginalString.length(); i++) {
//            originalChars[i] = orginalString.charAt(i);
//            if (Character.isUpperCase(originalChars[i])) {
//                caseCheckArr[i] = 2;
//            }
//            else if(Character.isWhitespace(originalChars[i])) {
//                caseCheckArr[i] = 0;
//            }
//            else{
//                caseCheckArr[i] = 1;
//            }
//        }
//
//        //System.out.println(originalChars[0]);
//        return originalChars;
//
//    }
//
//    public String getOrginalString() {
//        return orginalString;
//    }
//            }
//        }