class CyberShop{

    int since;
    String ownerName;
	int noOfSystems;
	
	
CyberShop()
{
	System.out.println("running default const");
}

CyberShop(int since,String ownerName,int noOfSystems)
{
	this.since=since;
	this.ownerName=ownerName;
	this.noOfSystems=noOfSystems;
}

void open(boolean shopOpen)
{
	if(shopOpen)
	{
		
	System.out.println("CyberShop is open");
	}
}

void close(boolean shopClose)
{
	if(shopClose)
	{
	System.out.println("CyberShop is close");
	}
}
void connectToInternet(boolean available)
{
	if(available)
	{
		
	System.out.println("System is connectTointernet");
	}
	else
	{
	System.out.println("System is not connectToInternet");
}

}

}

