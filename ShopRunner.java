class ShopRunner{

public static void main(String[] args)
{

     Shop shop3=new Shop();
	 CyberShop sh=new CyberShop(2012,"Nikhil",20);
	 shop3.run(sh);
	 sh.open(true);
	 sh.close(true);
	 
	 TechZoneCyberShop sh1 =new TechZoneCyberShop(2020,"Appu",30);
	 shop3.run(sh1);
	 sh1.connectToInternet(true);
	 
	 SatyaCyberShop sh2=new SatyaCyberShop(2019,"Kiran",40);
	 shop3.run(sh2);
	 

}

}