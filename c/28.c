// ��������� = SQRT(S * (S - a) * (S - b) * (S - c)) ����S = (a + b + c) / 2��a��b��cΪ�����ε����ߡ�
//  �����������εĺ꣬һ��������area,��һ����������S�� д�����ڳ������ô�ʵ�εĺ����������area��
#include<stdio.h>
#include<math.h>
float s,area;
#define S(a,b,c) {s=(a+b+c)/2;}
#define areas(a,b,c,s) {area=sqrt(s*(s-a)*(s-b)*(s-c));}
int main()
{
    float x,y,z;
    scanf("%f %f %f",&x,&y,&z);
    S(x,y,z);
    areas(x,y,z,s);
    printf("%.3f",area);
    return 0;
}