#include<stdio.h>
int c;
# define qiuyu(a,b) {c=a%b;}
int main()
{
    int x,y;
    scanf("%d %d",&x,&y);
    qiuyu(x, y);
    printf("%d", c);
    return 0;

}