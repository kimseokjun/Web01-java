package j09_클래스;

public class Computer {
	
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	
	public Computer(int year, String company, String cpu, int ram, String graphic) {
		super();
		this.year = year;
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.graphic = graphic;
	}

	@Override
	public String toString() {
		return "Computer [year=" + year + ", company=" + company + ", cpu=" + cpu + ", ram=" + ram + ", graphic="
				+ graphic + "]";
	}

	void addRam(int gigaByte)
	{
		int overRam = ram;
		if(ram < 32)
		{
			ram +=gigaByte;
			if(ram > 32) {
				overRam = ram - 32;
				System.out.println("램은 최대 32기가 바이트만 장착할수 있습니다.");
				System.out.println(overRam + "초과");
				ram = 32;
			}
		}else {
			System.out.println("더이상 램을 추가 할 수 없습니다.");
		}
	}
	
	void removeRam(int gigaByte) {
		if(ram > 1)
		{
			ram -= gigaByte;
			if(ram < 1)
			{
				System.out.println("램은 최소 1기가바이트 이상은 장착하여야 합니다.");
				ram = 1;
			}
		}else
		{
			System.out.println("램을 제거할 수 없습니다.");
		}
	}
	
}
