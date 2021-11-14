#include<stdio.h>
int main()
{
float a[3][4]={{1,2,3,4},{9,8,7,6},{-10,10,-5,2}};
	int max,hang=0,lie=0,i,j;

	max=a[0][0];
	for(i=0;i<=3;i++)
	for(j=0;j<=4;j++)
	if(a[i][j]>max)
	{max=a[i][j];
	hang=i;
	lie=j;
	}
	printf("max=%d\nhang=%d\nlie=%d\n",max,hang,lie);
	return 0;
} 
