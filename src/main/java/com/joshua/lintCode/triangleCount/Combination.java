package com.joshua.lintCode.triangleCount;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by joshua on 2017/8/23.
 */
public class Combination {

    private static int NUM = 0;

    public void combine(List<String> datas){
        TreeSet<String> set = new TreeSet<String>();
        for (String string: datas){
            set.add(string);
        }

        ArrayList<TreeSet<String>> subSet = getSubSet(set);
        for (TreeSet<String> treeSet:subSet){
            System.out.println(treeSet);
        }
    }

    public String[] getBinaryValue(TreeSet<String> set){
        int size = set.size();
        int m = (int) Math.pow(2,size) -1;
        String[] result = new String[m+1];
        for (int i=m;i>-1;i--){
            StringBuffer stringBuffer = new StringBuffer(Integer.toBinaryString(i));
            int length = stringBuffer.length();
            if (length < size){
                for (int j=0;j<size -length; j++){
                    stringBuffer.insert(0,"0");
                }
            }
            result[i] = stringBuffer.toString();
        }
        return result;
    }

    public ArrayList<TreeSet<String>> getSubSet(TreeSet<String> set) {
        ArrayList<TreeSet<String>> result = new ArrayList<TreeSet<String>>();
        String[] items = new String[set.size()];
        int i=0 ;
        for (String item: set){
            items[i++] =item;
        }
        String[] binaryValue = getBinaryValue(set);
        for (int j=0;j<binaryValue.length;j++){
            String value = binaryValue[j];
            TreeSet<String> subSet = new TreeSet<String>();
            for (int k=0;k<value.length();k++){
                if (value.charAt(k) == '1'){
                    subSet.add(items[k]);
                }
            }
            if (subSet.size() == NUM){
                result.add(subSet);
            }
        }
        return result;
    }

    public void recursionCombine(int[] source,int start,int[] result,int index,int n){
        int count = 0;
        for (count = start;count < source.length - index + 1;count ++){
            result[index - 1] = count;
            if (index - 1 == 0){
                for (int j= n-1;j>=0;j--){
                    System.out.print(source[result[j]]);
                }
                System.out.println();
            }else {
                recursionCombine(source,count+1,result,index-1,n);
            }
        }
    }
}

