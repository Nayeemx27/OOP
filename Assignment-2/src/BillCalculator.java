
public class BillCalculator {

	double calculateBasicBill(double unit) {
		double basicbill = 0;

		if (unit <= 199) {
			basicbill = unit * 1.20;
		} else if (unit <= 200 && unit < 400) {
			basicbill = unit * 1.5;
		} else if (unit <= 400 && unit < 600) {
			basicbill = unit * 1.8;
		} else {
			basicbill = unit * 2;
		}
		return basicbill;
	}

	double calculateSurcharge(double basicBill) {
		double charge = 0;

		if (basicBill > 400) {
			charge = 0.15 * basicBill;
		} else if (basicBill < 100) {
			charge = 100 - basicBill;
		}
		return charge;

	}

	double getTotalBill(double unit) {
		double basicBill = calculateBasicBill(unit);
		double Surcharge = calculateSurcharge(basicBill);
		return basicBill + Surcharge;
	}
}




