/**
 * 
 */
package com.uvg.ejemplo1;

/**
 * @author MAAG
 *
 */
public class Calc implements IBasicArithmetic, IMemory {

	private int memory;
	
	public Calc() {
		memory = 0;
	}
	
	@Override
	public void saveValue(int value) {
		memory = value;
	}

	@Override
	public int getValue() {
		return memory;
	}

	@Override
	public int addition(int operator1, int operator2) {
		return operator1 + operator2;
	}

	@Override
	public int substraction(int operator1, int operator2) {
		return operator1 - operator2;
	}

	@Override
	public int multiplication(int operator1, int operator2) {
		return operator1 * operator2;
	}

	@Override
	public int div(int operator1, int operator2) {
		return operator1 / operator2;
	}

	@Override
	public int mod(int operator1, int operator2) {
		return operator1 % operator2;
	}

}
