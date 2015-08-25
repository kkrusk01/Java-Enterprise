/* ********************************************************
* Student Name: Karl Kruskopp
* Class: ITF 3634 – Enterprise Java Programming
* Assignment: Problem Set #1, Problem #1
* Date: 25 August 2015
* User ID: kkrusk01
* ********************************************************/

public class UABigInteger {

	int     input;
	String  output;
	int  add;
	int  subtract;
	Boolean isEqualTo; 
	Boolean isNotEqualTo;
	Boolean isLessThan;
	Boolean isGreaterThan;
	Boolean isLessThanOrEqualTo;
	Boolean isGreaterThanOrEqualTo;
	
	
	
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public int getSubtract() {
		return subtract;
	}
	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}
	public Boolean getIsEqualTo(int[] a, int[] a2) {
        boolean isEqualTo = true;
		
		if (a != null && a2 != null)
				{
			if(a.length != a2.length)
				isEqualTo=false;
			else
				for (int i = 0; i<a2.length; i++){
					if (a2[i] != a[i]){
						isEqualTo = false;
					}
				}
		}else isEqualTo = false;
		return isEqualTo;
	}
	public void setIsEqualTo(Boolean isEqualTo) {
		this.isEqualTo = isEqualTo;
	}
	public Boolean getIsNotEqualTo() {
		return isNotEqualTo;
	}
	public void setIsNotEqualTo(Boolean isNotEqualTo) {
		this.isNotEqualTo = isNotEqualTo;
	}
	public Boolean getIsLessThan() {
		return isLessThan;
	}
	public void setIsLessThan(Boolean isLessThan) {
		this.isLessThan = isLessThan;
	}
	public Boolean getIsGreaterThan() {
		return isGreaterThan;
	}
	public void setIsGreaterThan(Boolean isGreaterThan) {
		this.isGreaterThan = isGreaterThan;
	}
	public Boolean getIsLessThanOrEqualTo() {
		return isLessThanOrEqualTo;
	}
	public void setIsLessThanOrEqualTo(Boolean isLessThanOrEqualTo) {
		this.isLessThanOrEqualTo = isLessThanOrEqualTo;
	}
	public Boolean getIsGreaterThanOrEqualTo() {
		return isGreaterThanOrEqualTo;
	}
	public void setIsGreaterThanOrEqualTo(Boolean isGreaterThanOrEqualTo) {
		this.isGreaterThanOrEqualTo = isGreaterThanOrEqualTo;
	}


	
	
	}


