#include<stdio.h>
int main()
{
    int x,y;
    int max(int a,int b);
    int min(int c,int d,int e );
    scanf("%d %d",&x,&y);
    int yin,bei;
    yin=max(x,y);
    bei=min(yin,x,y);
    printf("%d %d",yin,bei);
    return 0;
}
int max(int a,int b)
{
    int x,y,n;
    x=a,y=b;
    if(x>y)
    {
        for(int i=y;i>1;i--)
        {
            if(x%i==0&&y%i==0)
            {
                n=i;
                break;
            }
        }
    }
    else
    {
        for (int i = x; i > 1; i--)
        {
            if (x % i == 0 && y % i ==0)
            {
                n = i;
                break;
            }
        }
    }
    return n;
}
int min(int c,int d,int e)
{
    int y;
    y=(d*e)/c;
    return y;
}