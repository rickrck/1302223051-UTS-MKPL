package lib;

public class TaxFunction {


	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 *
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 *
	 * No tax if salary:
	 * Not Marriage = 54000000
	 * Marriage = Not Marriage + 4500000
	 * Children = Not Marriage + (4500000 * children)
	 */
	private Employee employee;

	public static int calculateTax(Employee employee) {

		int tax = 0;

		if (employee.getMonthWorkingInYear() > 12) {
			System.err.println("More than 12 month working per year");
		}

		if (getNumberOfChildren() > 3) {
			numberOfChildren = 3;
		}

		tax = rumusPajak(employee);

		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}

	}

	public static int taxMarriage(Employee employee){
		if (!employee.getSpouseIdNumber().isEmpty()) {
			return 54000000 + 4500000 + (employee.getNumberOfChildren() * 1500000);
		}
		return 54000000;
	}

	public static int rumusPajak(Employee employee){
		return (int) Math.round(0.05 * (((employee.getMonthlySalary() + employee.getOtherMonthlyIncome()) * employee.getMonthWorkingInYear()) - employee.getAnnualDeductible() - taxMarriage(employee)));
	}
}
