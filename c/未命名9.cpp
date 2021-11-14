#include<stdio.h> 
int  main() 
{ 
int a[10]={1,5,9,15,16,25,45,75,96,115}; 
int b[11],i,j,k,p; 
scanf("%d",&k); 
for(i=0;i<10;i++) 
{ 
p=i; 
if(a[i]>k) break; 
} 
for(j=0;j<p;j++) 
b[j]=a[j]; 
b[p]=k; 
for(j=p+1;j<11;j++) 
b[j]=a[j-1]; 
for(j=0;j<11;j++) 
printf("%d ",b[j]); 
}
