#include<stdio.h>
int main()
{
	int a[2][3]={{1,2,3},{4,5,6}}
	int b[3][2],j,i;
	for(j=1;j<=3;j++)
	{
		for(i-1;i<=2;i++)
		printf("%5d",a[i][j]);
		b[j][i]=a[i][j];
printf("%5d",b[j][i]); 
	}
	return 0;
}
