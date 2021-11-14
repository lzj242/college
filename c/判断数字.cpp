#include <stdio.h>
int main()
{
 int a,b,c,d,n;
 n=1000;
 while(n<=9999)
 {
 a=n/1000;
 b=(n%1000)/100;
 c=(n%100)/10;
 d=n%10;
 if((a+d)%2==1&&(c+b)%2==0)
 printf("%d\n",n);
 else
 ;
 n++;
 }
 return 0;
 }
