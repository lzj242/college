#include<stdio.h>
int main()
{
	int a[11][11];
	int i,j;
	for(i=1;i<=11;i++)
	for(j=1;j<=11;j++)
	scanf("%d",&a[i][j]);
	for(i=1;i<=11;i++)
	for(j=1;j<=11;j++) 
    printf("%d",a[i][j]);
	return 0; 
}
