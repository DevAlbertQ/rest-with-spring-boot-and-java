package br.com.albert.util;

import br.com.albert.exceptions.UnsupportedMathOperationException;

public final class MathUtil {
	
	public static boolean isNumeric(String strNum) {
		if(strNum == null) return false;
		String number = strNum.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
	public static double parseDouble(String strNum) throws Exception{
		if(strNum.equals(null))
			return 0D;
		String number = strNum.replaceAll(",", ".");
		if (!isNumeric(strNum))
			throw new UnsupportedMathOperationException(String.format("'%s' is not a valid number!", strNum));;
		
			
		Double num = Double.parseDouble(number);
		return num.doubleValue();
	}
	
	public static double sum(String a, String b) throws Exception{
		/*
		 * if (!isNumeric(a) || !isNumeric(b)) throw new
		 * UnsupportedMathOperationException("Please set a valid numeric value!");
		 */
		return parseDouble(a) + parseDouble(b);
	}
	
	public static double sub(String a, String b) throws Exception{
		/*
		 * if (!isNumeric(a) || !isNumeric(b)) throw new
		 * UnsupportedMathOperationException("Please set a valid numeric value!");
		 */
		return parseDouble(a) - parseDouble(b);
	}

	public static double multiply(String numOne,String numTwo) throws Exception{
		/*
		 * if(!isNumeric(numOne) || !isNumeric(numTwo)) { throw new
		 * UnsupportedMathOperationException("Please set a numeric value"); }
		 */	
		return parseDouble(numOne) * parseDouble(numTwo);
	}
	
	public static double divide(String numOne, String numTwo) throws Exception{
		/*
		 * if(!isNumeric(numOne) || !isNumeric(numTwo)) { throw new
		 * UnsupportedMathOperationException("Please set a numeric value"); }
		 */
		if(parseDouble(numTwo) == 0d) {
			throw new UnsupportedMathOperationException("Impossible divide by zero");
		}
		return parseDouble(numOne) / parseDouble(numTwo);
	}
	
	public static double average(String numOne, String numTwo) throws Exception{
		
		return sum(numOne, numTwo)/2;
	}
	
	public static double sqrt(String num) throws Exception{
		/*
		 * if(!isNumeric(num)) throw new
		 * UnsupportedMathOperationException("Please set a numeric value");
		 */
		return Math.sqrt(parseDouble(num));
	}

}
