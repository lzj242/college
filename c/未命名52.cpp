#include <stdio.h>
#include<math.h>
int main()
{
 int n,a,b,c;
 n=100;
 while(n<1000)
 {

 a=n/100;
 b=(n%100)/10;
 c=n%10;
  if(n==pow(a,3)+pow(b,3)+pow(c,3))
  printf("%d\t",n);
  n++;
  }
  return 0;
  }
  
 
