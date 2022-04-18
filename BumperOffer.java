class BumperOffer extends Offer{

       String item;
	   
	   BumperOffer(String name,String duration,String item)
	   {
		   super(name,duration);
		   this.item=item;
	   }
	   
	   
	 void  member(boolean member)
	 {
			System.out.println("Prime member");
	 }
}
