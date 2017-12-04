package calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

/**
 * This is a calculator with 
 * 10 possible operations
 * @author Stiven Caceres Hernandez
 * @Date 18/11/2017
 */
public class Calculadora {
	
	//Create write and read buffers
	static BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
    static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
    
    //this is the class main
	public static void main(String[] cal) throws IOException
	{
		int option; //variable for the option
		
		bw.write( "Welcome\n"
				+ "this is a calculator that works by console\n");
		//this is to do it once and then repeat
		do
		{
			//the option is equal to the selection in "option"
			option = option();
			//we ask for the parameters
			if (option != 4)
			{
				int[] parameters = getParameters(option);
				operation(option, parameters);
			}else
			{
				double[] parametersD = getParametersD(option);
				operationD(option,parametersD);
			}
			//we perform the operation
			
		}
		while(option != 11);
	}	
	/**
	 * it is mentioned that options are possible to calculate
	 * @return option
	 * @throws IOException
	 */
	public static int option() throws IOException
	{
		//the menu
		bw.write( "\nSelect one of the following options:"
				+ "\n1. Sum\n2. Substraction\n3. Multiplication"
				+ "\n4. Division\n5. Module\n6. Factorial"
				+ "\n7. Exponential\n8. Sine\n9. Cosine"
				+ "\n10. Integral of x^2\n11. Exit\n");
		bw.flush();
		//read the option
		int option = Integer.parseInt(br.readLine());
		return option;
	}
	/**
	 * A certain number of numbers will be requested
	 * according to the operation that is to be performed
	 * @param option
	 * @return parameters
	 * @throws IOException
	 */
	public static int[] getParameters(int option) throws IOException
	{
		//an arrangement is created
		int[] parameters = null;
		
		switch (option)//to select a case
		{
			//the sum
			case 1:
			{
				parameters = new int [2];
				bw.write( "Next, a sum will be made\n"
						+ "Enter the first addend:\n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
				
				bw.write("Enter the second adding:\n");
				bw.flush();
				
				parameters[1]=Integer.parseInt(br.readLine());
			}
			break;
			
			//the substraction
			case 2:
			{
				parameters = new int [2];
				
				bw.write( "Then a subtraction will be done\n"
						+ "Enter the minuend:\n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
				
				bw.write("Enter the subtrahend:\n");
				bw.flush();
				
				parameters[1]=Integer.parseInt(br.readLine());
			}
			break;
			
			//The multiplication
			case 3:
			{
				parameters = new int [2];
				bw.write( "Next, multiplication is going to take place\n"
						+ "Enter the multiplicand:\n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
				
				bw.write("Enter the multiplier:\n");
				bw.flush();
				
				parameters[1]=Integer.parseInt(br.readLine());
			}
			break;			
			
			//the module
			case 5:
			{
				parameters = new int [2];
				bw.write( "Next, the module will be made\n"
						+ "Enter the dividend:\n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
				
				bw.write("Enter the divisor:\n");
				bw.flush();
				
				parameters[1]=Integer.parseInt(br.readLine());
			}
			break;
			
			//the factorial
			case 6:
			{
				parameters = new int [1];
				
				bw.write( "Next, the factorial will be carried out\n"
						+ "Enter the value to be calculated:\n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
			}
			break;
			
			//the exponential
			case 7:
			{
				parameters = new int [2];
				
				bw.write( "Next, an exponential will be made\n"
						+ "Enter the quotient:\n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
				
				bw.write("Enter the value of the exponent:\n");
				bw.flush();
				
				parameters[1]=Integer.parseInt(br.readLine());
			}
			break;
			
			//the sine
			case 8:
			{
				parameters = new int [1];
				
				bw.write( "Next, a sine will bi made\n"
						+ "Enter the value to be calculated:\n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
			}
			break;
			
			//the cosine
			case 9:
			{
				parameters = new int [1];
				
				bw.write( "Next, a cosine will bi made\n"
						+ "Next it is to make the cosine: \n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
			}
			break;
			
			//the integral of x^2
			case 10:
			{
				parameters = new int [1];
				
				bw.write( "Next, the integral of x^2\n"
						+ "Enter the value to be calculated:\n");
				bw.flush();
				
				parameters[0]=Integer.parseInt(br.readLine());
			}
			break; 
			
			//the exit
			default:
			{
			  System.exit(0);
			}
		}
		return parameters;
	}
	/**
	 * This part is exclusive for the division
	 * @param option
	 * @return 
	 * @throws IOException
	 */
	public static double[] getParametersD(int option) throws IOException
	{
		double[] parametersD = new  double [2];
		bw.write( "Next, a division will be made\n"
				+ "Enter the dividend:\n");
		bw.flush();
		
		parametersD[0] =Integer.parseInt(br.readLine())*1.0;
		
		bw.write("Enter the divisor:\n");
		bw.flush();
		
		parametersD[1] =Integer.parseInt(br.readLine())*1.0;
		
		return parametersD;
	}
	/**
	 *The operations class will be called, which performs
	 *the operation desired, then it is returned with a
	 *"bufered" to write it in the console
	 * @param option
	 * @param parameters
	 * @throws IOException
	 */
	public static void operation(int option, int[]parameters) throws IOException
	{
		//an object is created
		Operaciones operation = new Operaciones();
		
		switch (option)// to select a case
		{
			//The sum
			case 1:
			{
				int result = operation.addition(parameters[0],parameters[1]);
				
				bw.write("The result of the sum is:\n" + result + "\n");
				bw.flush();
			}
			break;
			
			//The subtraction
			case 2:
			{
				int result = operation.subtraction(parameters[0],parameters[1]);
				
				bw.write("The result of subtraction is:\n" + result + "\n");
				bw.flush();
			}
			break;
			
			//The multiplication
			case 3:
			{
				int result = operation.multiplication(parameters[0],parameters[1]);
				
				bw.write("The result of multiplication is:\n" + result + "\n");
				bw.flush();
			}
			break;
			
			//the Module
			case 5:
			{
				bw.write("The result of the module is:\n" + 
				operation.residue(parameters[0],parameters[1]) + "\n");
				bw.flush();
			}
			break;
			
			//the Factorial
			case 6:
			{
				int result = operation.factorial(parameters[0]);
				
				bw.write("The result of the factorial is:\n" + result + "\n");
				bw.flush();
			}
			break;
			
			//the Exponential
			case 7:
			{
				int result = operation.exponentiation(parameters[0], parameters[1]);
				
				bw.write("The result of the exponent is:\n" + result + "\n");
				bw.flush();
			}
			break;
			
			//the sine
			case 8:
			{
				double result = operation.sin(parameters[0]);
				
				bw.write("The result of the sine is:\n" + result + "\n");
				bw.flush();
			}
			break;
			
			//the cosine
			case 9:
			{
				double result = operation.cos(parameters[0]);
				
				bw.write("The result of the cosine is:\n" + result + "\n");
				bw.flush();
				
			}
			break;
			
			//the integral x^2
			case 10:
			{
				double result = operation.integration(parameters[0], parameters[1], parameters[2]);
				
				bw.write("The result of the integral x^2 is:\n" + result + "\n");
				bw.flush();
			}
			break;
			default:
			{
			  System.exit(0);
			}
		}
	}
	/**
	 * This part is exclusive for the division
	 * @param option
	 * @param parametersD
	 * @throws IOException
	 */
	public static void operationD(int option, double[] parametersD) throws IOException
	{
		Operaciones operation = new Operaciones();
		//measure the number of decimals
		DecimalFormat df = new DecimalFormat("####.####");
		
		if(parametersD[1] == 0)
		{
			bw.write("Division by zero is not allowed.\n");
			bw.flush();
		}
		else
		{//operation.division(
			bw.write("The result of the division is:\n" + 
					df.format(operation.division(parametersD[0], parametersD[1])) + "\n");
			bw.flush();
		}
	}
}
