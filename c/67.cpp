#include<stdio.h>
int main(void)
{int n,num=0;
scanf("%d,&n");
char c[81];
int l,i;
for(l=1;l<=n;l++)
 {char c[81]={0};
scanf("%s",c);
 	for(i=0;i<81;i++)
 	if(c[i]>='0'&&c[i]<='9')
 	{
 		num++;
 	}
printf("%d\n,num");
 }
return 0;
}
