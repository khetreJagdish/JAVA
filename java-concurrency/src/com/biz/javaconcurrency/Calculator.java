package com.biz.javaconcurrency;

public class Calculator {

	private ImmutableValue currentValue = null;

	public ImmutableValue getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(ImmutableValue currentValue) {
		this.currentValue = currentValue;
	}
	
	public void add(int newValue){
	    this.currentValue = this.currentValue.add(newValue);
	  }

}
