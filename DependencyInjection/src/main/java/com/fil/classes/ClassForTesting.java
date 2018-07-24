package com.fil.classes;

public class ClassForTesting {
	
	public String sortArray(String str){
		
		char[] array = str.toCharArray();
		for(int i= array.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(array[j] > array[j+1]){
					char temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return new String(array);
	}

}
