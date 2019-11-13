package test;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import model.BeanStudents;
import model.BeanTeachers;

public class SortUtils {
	public static void sort(List<String> list){
		TreeSet<String> ts=new TreeSet<>(
				new Comparator<String>(){	
					@Override
					public int compare(String o1, String o2) {
						int num=o2.compareTo(o1);
						return num==0?-1:num;
					}
				}
		);
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}
    public static void createDefinitionSortTreeMap() {
        TreeMap<String, String> map = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
            }
            
        });
        init(map);
        print(map);
    }
    
    public static void init(Map<String, String> map) {
    	System.out.print("教师生成（排序前）:[");
    	for (int i = 0; i < 20; i++) {
        	String str="0123456789";
    	    Random random=new Random();
    	    StringBuffer sb=new StringBuffer();
    	    for(int j=0;j<4;j++){
    	      int number=random.nextInt(10);
    	      sb.append(str.charAt(number));
    	    }
    	     
    	    String str1="abcdefghijklmnopqrstuvwxyz";
    	    Random random1=new Random();
    	    StringBuffer sb1=new StringBuffer();
    	    for(int j=0;j<3;j++){
    	    	int number=random.nextInt(26);
     	       	sb1.append(str1.charAt(number));
    	    }
    	    map.put(sb.toString(), sb1.toString());
    	    System.out.print(" "+sb.toString()+"-"+sb1.toString()+" ");
        }
    	System.out.println("]");
    	System.out.print("排序后:");
    }
    
    public static void print(Map<String, String> map) {
        Iterator<Entry<String, String>> it = map.entrySet().iterator();
        System.out.print("[");
        while(it.hasNext()) {
            Entry<String, String> entry = it.next();
            System.out.print(" "+entry.getKey() + "-" + entry.getValue()+" ");
        }
        System.out.println(" ]");
        
    }

	public static void main(String[] args) {
		ArrayList<String> slist = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
        	String str="0123456789";
    	    Random random=new Random();
    	    StringBuffer sb=new StringBuffer();
    	    for(int j=0;j<4;j++){
    	      int number=random.nextInt(10);
    	      sb.append(str.charAt(number));
    	    }
    	    slist.add(sb.toString());
        }
		System.out.println("学号生成（排序前）:" + slist);
		sort(slist);
		System.out.println("排序后:" + slist);
		
		createDefinitionSortTreeMap();
	}
	
    
}
