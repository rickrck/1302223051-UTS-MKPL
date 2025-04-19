package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Person {

	private Person person;
	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

	public Employee(Person person) {
		super(person);
	}

	/**
	 * Fungsi menentukan Gaji per Bulan:
	 * - Grade 1: Rp 3.000.000
	 * - Grade 2: Rp 5.000.000
	 * - Grade 3: Rp 7.000.000
	 * Jika asing, gaji bulanan dikalikan 1.5
	 */
	
	public void setMonthlySalary(int grade) {
		switch(grade) {
			case 1:
				monthlySalary = 3000000;
				break;
			case 2:
				monthlySalary = 5000000;
				break;
			case 3:
				monthlySalary = 7000000;
				break;
		}
		monthlySalary = isForeigner ? (int) (monthlySalary * 1.5) : monthlySalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public int getOtherMonthlyIncome() {
		return otherMonthlyIncome;
	}

	public int getAnnualDeductible() {
		return annualDeductible;
	}

	public int getMonthWorkingInYear() {
		return person.getMonthWorkingInYear();
	}

	public String getSpouseIdNumber() {
		return person.getFamily().getSpouseIdNumber();
	}

	public int getNumberOfChildren() {
		return person.getFamily().getChildIdNumbers().size();
	}


	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public int getAnnualIncomeTax() {

		return TaxFunction.calculateTax(this);
	}
}
