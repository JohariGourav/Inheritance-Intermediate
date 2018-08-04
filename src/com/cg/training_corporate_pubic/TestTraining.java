package com.cg.training_corporate_pubic;

//Test class to get cost of Corporate and Public Training
public class TestTraining {
	// main method
	public static void main(String[] args) {

		// Input - "java", cost = 5000, people= 50
		Training trainingPublic = new PublicTraining("Java", 5000, 50);

		double cost = trainingPublic.getOrderValue();
		System.out.println("Cost of Public Training: " + cost);

		// Input - "Big data", cost = 35000, people= 4
		Training trainingCorporate = new CorporateTraining("Big Data", 35000, 4);

		cost = trainingCorporate.getOrderValue();
		System.out.println("Cost of Corporate Training: " + cost);
	}

}
