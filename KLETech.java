package ugprgs.in.ac.kletech;

public class KLETech
{
	static
	{
		final String CETC1 = "E30";
		final String CETC2 = "E241";
	}
	
	Schools[] s=new Schools[8];
	
	KLETech()
	{
		
		s[0]=new Schools("UGCV126","anish",140);
		s[1]=new Schools("UGCS031","rahul",110);
		s[2]=new Schools("UGMEC112","Amit",100);
		s[3]=new Schools("UGAUTO321","Ayush",110);
		s[4]=new Schools("UGARC526","Dubey",170);
		s[5]=new Schools("UGELE563","Fahran",150);
		s[6]=new Schools("UGINS223","Rohit",110);
		s[7]=new Schools("UGBIO679","Shubham",120);
	}

	void tal(String sch)
	{
		if(sch.compareTo("UGCV126")==0)
		 System.out.println("UGCV126-->"+s[0].cnt0);
		if(sch.compareTo("UGCS031")==0)
		System.out.println("UGCS031-->"+s[1].cnt1);
		if(sch.compareTo("UGMEC112")==0)
		System.out.println("UGMEC112-->"+s[2].cnt2);
		if(sch.compareTo("UGAUTO321")==0)
		System.out.println("UGAUTO321-->"+s[3].cnt3);
		if(sch.compareTo("UGARC526")==0)
		System.out.println("UGARC526-->"+s[4].cnt4);
		if(sch.compareTo("UGELE563")==0)
		System.out.println("UGELE563-->"+s[5].cnt5);
		if(sch.compareTo("UGINS223")==0)
		System.out.println("UGINS223-->"+s[6].cnt6);
		if(sch.compareTo("UGBIO679")==0)
		System.out.println("UGBIO679-->"+s[7].cnt7);
	}
	
	

}
