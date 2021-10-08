
public class Task_1 {

	public static void main(String[] args) {
		System.out.println("Testing Device");

		Smartphone newphone = new Smartphone();
		System.out.println("\n1st Phone");
		System.out.println("Chipset: " + newphone.chipset);
		System.out.println("RAM: " + newphone.ram + "GB");
		System.out.println("Battery: " + newphone.battery);

		Smartphone newphone2 = new Smartphone("Qualcomm SM8250-AC Snapdragon 870 5G (7 nm)", 6, "Li-Po 4520 mAh");
		System.out.println("\n2nd Phone");
		System.out.println("Chipset: " + newphone2.chipset);
		System.out.println("RAM: " + newphone2.ram + "GB");
		System.out.println("Battery: " + newphone2.battery);

		Smartphone newphone3 = new Smartphone("MediaTek MT6893 Dimensity 1200 5G (6 nm)", 8, "Li-ion 5065");
		System.out.println("\n3nd Phone");
		System.out.println("Chipset: " + newphone3.chipset);
		System.out.println("RAM: " + newphone3.ram + "GB");
		System.out.println("Battery: " + newphone3.battery);

	}

}



