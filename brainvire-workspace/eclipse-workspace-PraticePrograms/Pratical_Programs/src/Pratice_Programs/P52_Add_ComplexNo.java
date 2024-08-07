package Pratice_Programs;

class ComplexNumber {
	double real;
	double imag;

	public ComplexNumber(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
}

public class P52_Add_ComplexNo {

	public static ComplexNumber addComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
		double resultReal = num1.real + num2.real;
		double resultImag = num1.imag + num2.imag;
		return new ComplexNumber(resultReal, resultImag);
	}

	public static void main(String[] args) {
		ComplexNumber complexNum1 = new ComplexNumber(3, 4);
		ComplexNumber complexNum2 = new ComplexNumber(1, 2);

		ComplexNumber resultComplex = addComplexNumbers(complexNum1, complexNum2);

		System.out.println("Result: " + resultComplex.real + " + " + resultComplex.imag + "i");
	}
}
