#include<stdio.h>
#include<math.h>
int whatDay (int y,int m)
{ 
  if(y>2000)
{
	if(y%100!=0&&y%4==0||y%400==0)
	{
		int d[12]={31,28,31,30,31,30,31,31,30,31,30,31};
		int i,sum=0,a,b,n;
		for(i=0;i<12;i++)
		{
			if(m==1)
			break;
			sum=sum+d[i];
			if(i==m-2)
			break;
		}
		a=(y-2001);
		b=a%4;
		sum=(a-b)*365+b*366+sum;
		n=sum%7;
		n=n+3;
		return n;	 
	}
	else
	{
		int d[12]={31,29,31,30,31,30,31,31,30,31,30,31};
		int i,sum=0,a,b,n;
		for(i=0;i<12;i++)
		{
			
			if(m==1)
			break;
			sum=sum+d[i];
			if(i==m-2)
			break;
		}
		a=(y-2001);
		b=a%4;
		sum=(a-b)*365+b*366+sum;
		n=sum%7;
		n=n+3;
		return n;
	}
}
	else
	{
		if(y%100!=0&&y%4==0||y%400==0)
	{
		int d[12]={31,28,31,30,31,30,31,31,30,31,30,31};
		int i,sum=0,a,b,n;
		for(i=11;i>0;i--)
		{
			
			if(m==11)
			break;
			sum=sum+d[i];
			if(i==m-2)
			break;
		}
		a=fabs(y-2001);
		b=a%4;
		sum=(a-b)*365+b*366+sum;
		n=sum%7;
		n=n+3;
		return n;	 
	}
		else
	{
		int d[12]={31,29,31,30,31,30,31,31,30,31,30,31};
		int i,sum=0,a,b,n;
		for(i=11;i>0;i--)
		{
			if(m==11)
			break;
			sum=sum+d[i];
			if(i==m-2)
			break;
		}
		a=fabs(y-2001);
		b=a%4;
		sum=(a-b)*365+b*366+sum;
		n=sum%7;
		n=n+3;
		return n;
	}	
	}	
} 
int main()
{
	int y,m,c;
	scanf("%d%d",&y,&m);
	c=whatDay(y,m);
    printf("%d年%d月1日是星期%d",y,m,c); 
    return 0;
}	


