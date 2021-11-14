/***************************************************************ͷ�ļ�***************************************************/
	#include<stdio.h>
/***************************************************************��������*************************************************/
	void printStar();
	void muban();
	int leap(int year);
	int qiuhe(int year,int month,int day,int run[],int ping[]);
	void shibiePrint(int sum,int year,int month);
/***************************************************************ȫ�ֱ���**************************************************/
	int year,month,day,he;
	int run[12]={31,29,31,30,31,30,31,31,30,31,30,31};
	int ping[12]={31,28,31,30,31,30,31,31,30,31,30,31};
/***************************************************************�Զ��庯��*************************************************/
	void printStar()
	{
		printf("*************************************************************************************\n");
	}
	void muban()
	{
		char weekday[7][10]={"����һ","���ڶ�","������","������","������","������","������"};
		int i;
		printf("                                        ������                                        \n");
	    printStar();
		for(i=0;i<7;i++)
			printf("%10s",weekday[i]);
		printf("\n");
		
	}
	
	//�ж������ƽ��
	int leap(int year)
	{		
      int four , hundred , fourhundred;
      scanf("%d",&year);
      four = year % 4;
      hundred = year % 100;
      fourhundred = year % 400;
      if (four == 0 && hundred == 0 && fourhundred == 0)
         return 1;
      else if (four == 0 && hundred != 0 && fourhundred != 0)
         return 1;
      else return 0;
	}
	
	//��㵽����������
	int qiuhe(int year,int month,int day,int run[],int ping[])
	{
		//19000101 ����һ
		int i,sum=0;
		for(i=1900;i<year;i++)
		{
			int m;//������ǩ�����껹��ƽ��  m==1,��������
			m=leap(i);
			if(m==1)
			{
				sum=sum+366;
			}
			else
			{
				sum=sum+365;
			}
		}
		//���·ݵ�����
		for(i=0;i<month-1;i++)
		{
			if(leap(year)==1)
				sum=sum+run[i];
			else
				sum=sum+ping[i];
		}
		return sum;
	}
	void shibiePrint(int sum,int year,int month)
	{
		int yushu,temp,i;
		yushu=sum%7;//�õ������������Ȼ���ں�һ���·��ÿո��ʾ����
		for(i=0;i<yushu;i++)
			printf("          ");//����ո�
		temp=7-yushu;
		if(leap(year)==1)
		{
			for(i=1;i<=run[month-1];i++)//��ӡ31��
			{
				printf("%10d",i);
			if(i==temp||(i-temp)%7==0)
				printf("\n");
			}
			printf("\n");
		}
		else
		{
			for(i=1;i<=ping[month-1];i++)//��ӡ30��
			{
				printf("%10d",i);
			if(i==temp||(i-temp)%7==0)
				printf("\n");
			}
			printf("\n");
		}
	}
	/**********************************************************������***************************************************/
	int main()
	{
		scanf("%4d%2d%2d",&year,&month,&day);
		he=qiuhe(year,month,day,run,ping);//���ú������
		muban();//����ģ�庯�������ģ��
		shibiePrint(he,year,month);//������Ӧ��ʶ�𣬲����
		printStar();//��ӡ���һ�е��Ǻ�
		return 0;
	}

