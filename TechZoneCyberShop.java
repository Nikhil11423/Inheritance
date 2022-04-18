class TechZoneCyberShop extends CyberShop{
	
	TechZoneCyberShop(int since,String ownerName,int noOfSystems)
	{
		super(since,ownerName,noOfSystems);
	}
	

 void printing()
 {
	 System.out.println("Running printing");

 }
 void connectToInternet(boolean Internetavailable)
{
	if(Internetavailable)
	{
		
	System.out.println("System is connectTointernet");
	}
	else
	{
		System.out.println("System is not connectToInternet");
}

}
}