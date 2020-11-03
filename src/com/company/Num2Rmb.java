package com.company;

public class Num2Rmb {
    private String[] handArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
    private String[] unitArr = {"十", "百", "千"};

    private String[] divide(double num) {
        long zh = (long) num;
        long xiao = Math.round((num - zh) * 100);

        return new String[]{zh + "", String.valueOf(xiao)};
    }

    public String[] ddd(double num) {
        return divide(num);
    }

    public String toHanStr(String numStr) {
        String result = "";
        int numLen = numStr.length();

        for (int i = 0; i < numLen; i++) {
            int num = numStr.charAt(i) - 48;
            if (i != numLen - 1 && num != 0) {
                result += handArr[num] + unitArr[numLen - 2 - i];
            } else {
                result += handArr[num];
            }
        }
        return result;
    }
}
