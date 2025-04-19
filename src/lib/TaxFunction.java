package lib;

public class TaxFunction {


	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 *
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 *
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 *
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
