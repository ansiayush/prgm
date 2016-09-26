package ugprgs.in.ac.kletech;

public class Student 
{
	static int stuId=0;
	String stuName;
	String dept;
	String school;
	
	Student(String stuName, String dept, String school) 
	{
		stuId=stuId++;
		this.stuName = stuName;
		this.dept = dept;
		if(school.compareTo("UGCV126")==0)
		{
			if(Schools.cnt0<120)
				this.school = school;
			   Schools.cnt0++;
		}
		if(school.compareTo("UGCS031")==0)
		{
			if(Schools.cnt1<120)
				this.school = school;
			Schools.cnt1++;
		}
		if(school.compareTo("UGMEC112")==0)
		{
			if(Schools.cnt2<120)
				this.school = school;
			Schools.cnt2++;
		}
		if(school.compareTo("UGAUTO321")==0)
		{
			if(Schools.cnt3<120)
				this.school = school;
			Schools.cnt3++;
		}
		if(school.compareTo("UGARC526")==0)
		{
			if(Schools.cnt4<120)
				this.school = school;
			Schools.cnt4++;
		}
		if(school.compareTo("UGELE563")==0)
		{
			if(Schools.cnt5<120)
				this.school = school;
			Schools.cnt5++;
		}
		if(school.compareTo("UGINS223")==0)
		{	
			if(Schools.cnt6<120)
				this.school = school;
			Schools.cnt6++;
		}
		if(school.compareTo("UGBIO679")==0)
		{	
			if(Schools.cnt7<120)
				this.school = school;
			Schools.cnt7++;
		}	
	}
	
	

}
