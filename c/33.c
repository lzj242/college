#include<stdio.h>
int main()
{
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    printf("%d %d %d", (a < b ? b : a) < c ? (a > b ? b : a) : c, a < b ? (a > c ? a : (c < b ? c : b)) : (a < c ? a : (b > c ? b : c)),  (a > b ? a : b) > c ? (a > b ? a : b) : c);
    return 0;
}