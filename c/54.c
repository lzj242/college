// ��1 + 2 !+3 !+4 !+��+ 30 !��
//     ��ѧ��������������λС����
#include <stdio.h>
int main()
{
    double sum = 0, j = 1;
    for (int i = 1; i <= 30; i++)
    {
        /* code */
        j =j* i;
        sum =sum+ j;
    }
    printf("%.2e\n", sum);
}