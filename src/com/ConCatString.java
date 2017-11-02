package com;

import org.apache.hadoop.hive.ql.exec.UDF;

//	Class Which has implementation of Concatenation of string with delimiters 
public class ConCatString extends UDF {
	//	Method of implementation to concat
	//	@param args : gets the array of elements to concat
	//	@param delimiter : delimiter with which the array needs to be concatenated
	public String concatStr(String delimiter, String [] args){
		//	Returns the String by concatenating by using String class function
		return String.join(delimiter, args);
	}
}
