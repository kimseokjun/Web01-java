package j14_lombok;

public class Builder extends CarBuilder{

	@Override
	public CarBuilder company(String company) {
		car.setCompnay(company);
		return this;
	}

	@Override
	public CarBuilder model(String model) {
		car.setModel(model);
		return this;
	}

	@Override
	public CarBuilder color(String color) {
		car.setColor(color);
		return this;
	}

}
