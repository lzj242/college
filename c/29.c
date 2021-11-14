#include<stdio.h>
char c;
#define judge(x) {if(x%400==0)c='L';else c='N'; }
int main()
{
    int n;
    scanf("%d",&n);
    judge(n);
    printf("%c",c);
    return 0;
}