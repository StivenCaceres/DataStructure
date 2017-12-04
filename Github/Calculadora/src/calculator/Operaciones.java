package calculator;

import java.text.DecimalFormat;

/**
 * This class is to perform the desired operations according
 * to the parameters that were received in the class "calculator"
 * @author Stiven Caceres Hernandez
 * @Date 18/11/2017
 */
public class Operaciones 
{
	static int result;
	static double decimals;
	
	DecimalFormat df = new DecimalFormat("#0.0000");//measure the number of decimals
	
	/**
	 * In this option the result of the sum is returned
	 * @param number1
	 * @param number2
	 * @return sum
	 */
	public int addition(int number1, int number2) 
	{
		return number1 + number2;
	}

	/**
	 * In this option the result of the subtraction is returned
	 * @param number1
	 * @param number2
	 * @return subtraction
	 */
	public int subtraction(int number1, int number2) 
	{
		return number1 - number2;
	}
	
	/**
	 * In this option the multiplication result is returned
	 * @param number1
	 * @param number2
	 * @return result
	 */
	public int multiplication(int number1, int number2) 
	{
		result = 0;
		for(int i = 0; i < number2; i++)
		{
			result = addition(result, number1);
		}
		return result;
	}
	
	/**
	 * In this option the result of the division is returned
	 * @param parametersD
	 * @param parametersD2
	 * @return division
	 */
	public double division(double parametersD, double parametersD2) 
	{
		return parametersD / parametersD2;
	}
	
	/**
	 * In this option the result of the module is returned
	 * @param number1
	 * @param number2
	 * @return module
	 */
	public int residue(int number1, int number2) 
	{
		return number1 % number2;
	}
	
	/**
	 * In this option the result of the factorial is returned
	 * @param number
	 * @return factorial
	 */
	public int factorial(int number)
	{
		if(number < 1)
			return 1;
		else
			//Here the recursion is used
			return number * factorial(number - 1);
	}
	
	/**
	 * In this option the result of the exponential is returned
	 * @param base
	 * @param exponent
	 * @return exponential
	 */
	public int exponentiation(int base, int exponent)
	{
		if(exponent == 1)
		{
			return base;
		}
		else
		{
			if(exponent == 0)	
			{
				return 1;
			}
			else
			{
				if(exponent > 1)
				{
					return multiplication(base, exponentiation(base, exponent - 1));
				}
				else
				{
					return (1 / exponentiation(base, multiplication(exponent, (-1))));
				}
			}
		}
	}
	
	/**
	 * In this option the result of the sine according to Riemann is returned
	 * @param x
	 * @return decimals
	 */
	public double sin(int x)
	{
        return Math.sin(x);
	}
	
	/**
	 * In this option the result of the cosine according to Riemann is returned
	 * @param x
	 * @return decimals
	 */
	public double cos(int x)
	{
        return Math.cos(x);
	}
	
	/**
	 * In this option the result is returned to integration
	 * @param x
	 * @return decimals
	 */
	public double integration(int initial_point, int final_point, int step)
	{
		decimals = 0.0;
        double temp;
        int x_i, x_i_1, y_i;
		x_i_1 = initial_point;
        x_i = step + x_i_1;
        for( int i = x_i; i <= final_point; i+= step)
        {
            y_i = (x_i * x_i);
            temp = (y_i) * (x_i - x_i_1);
            decimals += temp;
            x_i_1 = x_i;
            x_i = step + x_i_1;
        }
        return decimals;
	}
}