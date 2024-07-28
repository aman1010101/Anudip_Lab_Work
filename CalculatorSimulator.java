package com;

//CountryNotValidException class-----------------------------------------
class CountryNotValidException extends Exception {
	CountryNotValidException(String msg) {
		super(msg);
	}

}

//EmployeeNameInvalidException class-----------------------------------------
class EmployeeNameInvalidException extends Exception {
	EmployeeNameInvalidException(String msg) {
		super(msg);
	}

}

//TaxNotEligibleException class-----------------------------------------------------
class TaxNotEligibleException extends Exception {
	TaxNotEligibleException(String msg) {
		super(msg);
	}

}

//taxcalculator class---------------------------------------------------------------------
class TaxCalculator {

	public double calculateTax(String empName, boolean isIndian, double empSal)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		if (isIndian != true) {
			throw new CountryNotValidException("This Taxcalculator is valid for only indian employees");
		}
		if (empName == null || empName.isBlank()) {
			throw new EmployeeNameInvalidException("please enter an valid name");
		}

		double taxAmount;
		if (empSal > 100000 && isIndian == true) {
			taxAmount = (empSal * 8) / 100;

		} else if (empSal >= 50000 && empSal <= 100000 && isIndian == true) {
			taxAmount = (empSal * 6) / 100;

		} else if (empSal >= 30000 && empSal < 50000 && isIndian == true) {
			taxAmount = (empSal * 5) / 100;

		} else if (empSal >= 10000 && empSal < 30000 && isIndian == true) {
			taxAmount = (empSal * 4) / 100;

		} else {
			throw new TaxNotEligibleException("Tax is not Eligible for this employee");

		}
		return taxAmount;

	}
}

// Main class-----------------------------------------------------------

public class CalculatorSimulator {

	public static void main(String[] args) {
		TaxCalculator taxcalculator = new TaxCalculator();
		// case 1
		try {
			System.out.println("Case 1:");
			double tax = taxcalculator.calculateTax("Ron", false, 34000);
			System.out.println("Taxamount is :" + tax);
		} catch (CountryNotValidException e) {
			System.out.println("The employee should be an Indian citizen for calculating tax.");
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			System.out.println("The employee name cannot be empty.");
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			System.out.println("The employee does not need to pay tax.");
			e.printStackTrace();
		}

		// Case 2
		try {
			System.out.println("Case 2:");
			double tax = taxcalculator.calculateTax("Tim", true, 1000);
			System.out.println("Tax amount is " + tax);
		} catch (CountryNotValidException e) {
			System.out.println("The employee should be an Indian citizen for calculating tax.");
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			System.out.println("The employee name cannot be empty.");
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			System.out.println("The employee does not need to pay tax.");
			e.printStackTrace();
		}

		// Case 3
		try {
			System.out.println("Case 3:");
			double tax = taxcalculator.calculateTax("Jack", true, 55000);
			System.out.println("Tax amount is " + tax);
		} catch (CountryNotValidException e) {
			System.out.println("The employee should be an Indian citizen for calculating tax.");
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			System.out.println("The employee name cannot be empty.");
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			System.out.println("The employee does not need to pay tax.");
			e.printStackTrace();
		}

		// Case 4
		try {
			System.out.println("Case 4:");
			double tax = taxcalculator.calculateTax("", true, 30000);
			System.out.println("Tax amount is " + tax);
		} catch (CountryNotValidException e) {
			System.out.println("The employee should be an Indian citizen for calculating tax.");
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			System.out.println("The employee name cannot be empty.");
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			System.out.println("The employee does not need to pay tax.");
			e.printStackTrace();
		}

	}

}
