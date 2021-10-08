
public class Smartphone {
	String chipset, battery;
	int ram;

	Smartphone() {
		chipset = "Qualcomm SM8350 Snapdragon 888 (5 nm)";
		ram = 8;
		battery = "Li-Po 4520 mAh";
	}

	Smartphone(String chipset, int ram, String battery) {
		this.chipset = chipset;
		this.ram = ram;
		this.battery = battery;
	}
}


