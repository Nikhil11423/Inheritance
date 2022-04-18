class Offer{
         
		 
	 String name;
	 String durationFor;
		 
    Offer(String name,String durationFor)
	{
		this.name=name;
		this.durationFor=durationFor;
		
		//System.out.println(this.name);
		//System.out.println(this.durationFors);
	}
	 
	 void discount(int discount)
	 {
			System.out.println("Discount apply");
	 }
	 void redeemPoints(int redeemPoints)
	
	 {
			 System.out.println("Point apply");
	 } 

}