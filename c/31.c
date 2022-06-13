#include<stdio.h>
float max;
#define judge(x,y,z) { max=x; if(max<y) max=y; if(max<z) max=z;}
int main()
{
    void funcation(float q,float w,float e);
    float a,b,c;
    scanf("%f %f %f",&a,&b,&c);
    judge(a,b,c);
    funcation(a,b,c);
    printf("%.3f\n",max);
    return 0;
}
void funcation(float q,float w,float e)
{
    float zuida;
    zuida=q;
    if(zuida<w)
    {
        zuida=w;
    }
    if(zuida<e)
    {
        zuida=e;
    }
    printf("%.3f\n",zuida);
}
