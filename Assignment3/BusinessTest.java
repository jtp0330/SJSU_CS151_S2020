package a3;

public class BusinessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer("Tan", "Bun", 21, 392103394, new Address(), "Bachelor's Degree", false, "card", false);
		c1.setAdress(4903, "Palm Street", "San Jose", 95112, "CA");
		Customer c2 = new Customer("Ken", "Burnes", 35, 24303534, new Address(), "Associate's Degree", true, "cash", true);
		c2.setAdress(1233, "Grimm Court", "Lansing", 49383, "MI");
		Executive e1 = new Executive("James", "Kent", 34, 940385934, new Address(), "Master's Degree", false, 01353440, 1.52f, 0.23f);
		e1.setAdress(3940, "Park Avenue", "Daly City", 94035, "CA");
		Executive e2 = new Executive("Diddy", "Dudat", 29, 54640908, new Address(), "Bachelor's Degree", false, 1136940, 1.62f, 0.14f);
		e2.setAdress(4939, "Steve Street", "Cheyenne", 56435, "WY");
		FullTimeHourlyEmployee e3 = new FullTimeHourlyEmployee("Mary", "Lillamb", 22, 58478394, new Address(), "Asscoiate's Degree", true, 035230, 1.45f, 0.34f);
		e3.setAdress(1139, "Lincoln Court", "Las Vegas", 34829, "NV");
		FullTimeHourlyEmployee e4 = new FullTimeHourlyEmployee("Lena", "Lolli", 23, 86894769, new Address(), "Master's Degree", false, 69439, 1.47f, 0.27f);
		e4.setAdress(5983, "Lol Avenue", "Salt Lake City", 78475, "UT");
		PartTimeHourlyEmployee e5 = new PartTimeHourlyEmployee("Ryan", "Yan", 19, 38473948, new Address(), "High School Diploma", false, 042450, 0.92f, 0.21f);
		e5.setAdress(1923,"Louis Street","Omaha",84783, "NB");
		PartTimeHourlyEmployee e6 = new PartTimeHourlyEmployee("Ruby", "Red", 20, 1465344, new Address(), "High School Diploma", true, 548490, 1.17f, 0.39f);
		e6.setAdress(29584,"King Court","Boise", 58493, "ID");
		Contractor e7 = new Contractor("Tory", "Li", 25, 9867897, new Address(), "Master's Degree", false, 90977, 1.43f, 0.53f);
		e7.setAdress(1434, "Paul Court", "Austin", 68567, "TX");
		Contractor e8 = new Contractor("Lucas", "Burch", 40, 4308390, new Address(), "Bachelor's Degree", false, 64857, 1.45f, 0.33f);
		e8.setAdress(5938, "Whale Avenue", "Waikiki", 4794, "HI");
		FullTimeSalaryEmployee e9 = new FullTimeSalaryEmployee("Tony", "Wong", 42, 4093806, new Address(), "Master's Degree", true, 939094, 2.47f, 0.56f);
		e9.setAdress(18489, "River Street", "Brooklyn", 38045, "NY");
		FullTimeSalaryEmployee e10 = new FullTimeSalaryEmployee("Jessica", "Deanza", 39, 2445349, new Address(), "Associate's Degree", false, 3958504, 3.05f, 0.43f);
		e10.setAdress(8435, "Fifth Avenue", "Phoneix", 59384, "AZ");
		
		
		c1.introduce(false);
		System.out.println();
		c1.makePayment();
		System.out.println();
		
		c2.introduce(true, true);
		System.out.println();
		c2.makePayment();
		System.out.println();
		
		e1.introduce();
		System.out.println();
		e1.introduce(true);
		System.out.println();
		System.out.println("Payment: $" + e1.computePay());
		System.out.println();
		
		e2.introduce();
		System.out.println();
		e2.introduce(true);
		System.out.println();
		System.out.println("Payment: $" + e2.computePay());
		System.out.println();
		
		e3.introduce();
		System.out.println();
		System.out.println("Payment: $" + e3.computePay(45));
		System.out.println();
		
		e4.introduce(true);
		System.out.println();
		System.out.println("Total Payment after 67 hours: $" + e4.computePay(67));
		System.out.println();
		
		e5.introduce(false);
		System.out.println();
		System.out.println("Total Payment after 24 hours: $" + e5.computePay(24));
		System.out.println();
		
		e6.introduce(true);
		System.out.println();
		System.out.println("Total Payment after 42 hours: $" + e6.computePay(42));
		System.out.println();
		
		e7.introduce(true);
		System.out.println();
		System.out.println("Total Payment after 53 hours: $" + e7.computePay(53));
		System.out.println();
		
		e8.introduce(false);
		System.out.println();
		System.out.println("Total Payment after 47 hours: $" + e8.computePay(47));
		System.out.println();
		
		e9.introduce();
		System.out.println();
		System.out.println("Total Payment after 26 weeks: $" + e9.computePay(26));
		System.out.println();
		
		e10.introduce();
		System.out.println();
		System.out.println("Total Payment after 34 weeks: $" + e10.computePay(34));
		System.out.println();
		
	}

}
