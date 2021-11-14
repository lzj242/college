#include<stdio.h>
#include<math.h>
int main()
{
   void dayu (int x,int y,int z);
    void dengyu (int d,int e,int f);
    void xiaoyu (int s,int r,int g);
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    if(b*b-4*a*c>0)
    {
        dayu(a,b,c);
    }
    else if(b*b-4*a*c==0)
    {
        dengyu(a,b,c);
    }
    else{
        xiaoyu(a,b,c);
    }
    return 0;
}
void dengyu(int d, int e, int f)
{
    int a,b,c;
    a=d;
    b=e;
    c=f;
    float x;
    x=(-1*b+sqrt(b*b-4*a*c))/2*a;
    printf("x=%.3f",x);
}
void dayu(int x, int y, int z)
{
    int a,b,c;
    a=x;
    b=y;
    c=z;
    float x2,x1;
    x1 = (-1 * b + sqrt(b * b - 4 * a * c)) / 2 * a;
    x2 = (-1*b - sqrt(b * b - 4 * a * c)) / 2 * a;
    printf("x1=%.3f x2=%.3f",x1,x2);
}
void xiaoyu(int s, int r, int g)
{
    int a,b,c;
    a=s;
    b=r;
    c=g;
    float real;
    float empty;
    real=(-1.0*b)/(2*a);
    empty=(sqrt(-1*(b*b-4*a*c)))/(2*a);
    printf("x1=%.3f+%.3fi ",real,empty);
    printf("x2=%.3f-%.3fi",real,empty);
}
