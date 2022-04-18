class Mall {

	void shopping(Offer offer) {

		System.out.println("Running Mall,Passing Offer");

		if (offer instanceof Offer) {

			System.out.println("Offer Name: " + offer.name);
			System.out.println("Offer Duration: " + offer.durationFor);

		}

		if (offer instanceof SuperOffer) {
			SuperOffer supOffer = (SuperOffer) offer;
			System.out.println("Day of the offer is holiday: " + supOffer.holiday);

		}

		if (offer instanceof BumperOffer) {
			BumperOffer bumpOffer = (BumperOffer) offer;
			System.out.println("Bumper Offer Item: " + bumpOffer.item);

		}

	}

}
