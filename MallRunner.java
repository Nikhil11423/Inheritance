class MallRunner {

	public static void main(String[] items) {

		Mall shop = new Mall();

		Offer offer = new Offer("Midnight Madness", "3-Days (From SunDay-12.01 AM)");
		shop.shopping(offer);
		offer.discount(45);
		offer.redeemPoints(150);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		SuperOffer offer1 = new SuperOffer("The Early Bird Sale", "4-Days-(From FridayDay-12.01 AM)", true);
		shop.shopping(offer1);
		offer.discount(50);
		offer.redeemPoints(200);
		offer1.totalCost(1000);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		String duration = "15-Days (From MonDay-12.01 AM)";
		BumperOffer offer2 = new BumperOffer("Deal of the Century", duration, "MobilPhones");
		shop.shopping(offer2);
		offer.discount(30);
		offer.redeemPoints(500);
		offer2.member(false);

	}

}