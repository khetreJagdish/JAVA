package com.biz.javaconcurrency;

public class ImmutableValue {
	/*
	public ImmutableValue add(int value)
	{
		System.out.println("From Immutable class add() method");
		return new ImmutableValue();
	}
	*/
	private int value = 0;

	  public ImmutableValue(int value){
	    this.value = value;
	  }

	  public int getValue(){
	    return this.value;
	  }

	  
	      public ImmutableValue add(int valueToAdd){
	      return new ImmutableValue(this.value + valueToAdd);
	      }
	public static void main(String[] args) {
		ImmutableValue immutable = new ImmutableValue(10);
		immutable= immutable.add(20);
		System.out.println(immutable.value);
	}
}
