package model;

public class CheckLogic {
	public void execute(HealthBeans hb) {
		String height = hb.getHeight();
		String weight = hb.getWeight();

		double heightForBmi = Double.parseDouble(height);
		double weightForBmi = Double.parseDouble(weight);

		double bmi = weightForBmi / (Math.pow((heightForBmi / 100), 2));

		hb.setBmi(bmi);

		String bodyType = "";

		if(0 <= bmi && bmi < 18.5) {
			bodyType = "痩せ";
		}
		else if(18 <= bmi && bmi < 25) {
			bodyType = "普通";
		}
		else if(25 <= bmi) {
			bodyType = "肥満";
		}
		else {
			bodyType = "計測不能";
		}

		hb.setBodyType(bodyType);

	}
}
