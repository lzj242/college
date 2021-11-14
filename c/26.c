#include<stdio.h>
int t;
#define change(a,b) { t=a; a=b;b=t;}
int main()
{
    int x,y,change,t;
    scanf("%d %d",&x,&y);
    change(x,y);
    printf("%d %d",x,y);
}