// ��������I/O�⣬����ʹ����һ�����������ʽ
#include <stdio.h>

// ����printMonth����Ҫ��ĸ�ʽ��ӡĳ��ĳ�µ�����
// ������year-�꣬month-��
// ����ֵ����
void printMonth(int year, int month);

// leapYear���ж�����
// ������y-��
// ����ֵ��1-�����꣬0-��������
int leapYear(int y)
{
    if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
        return 1;
    return 0;
}

// ����whatDay:����ĳ��ĳ�µ�1�������ڼ�
// ������year-�꣬month-��
// ����ֵ��1��7--����1��������
int whatDay(int year, int month)
{
    // 1������������һ
    int w = 1;
    int i;

    // 1��year-1����ȫ��
    for(i = 1; i < year; i++)
    {
        if(leapYear(i))
            w += 366;
        else
            w += 365;
    }
    switch(month)
    {
    case 12: // ���µ�
        w += 30;
    case 11: // ���µ�
        w += 31;
    case 10: // ���µ�
        w += 30;
    case 9:  // ���µ�
        w += 31;
    case 8:  // ���µ�
        w += 31;
    case 7:  // ���µ�
        w += 30;
    case 6:  // ���µ�
        w += 31;
    case 5:  // ���µ�
        w += 30;
    case 4:  // ���µ�
        w += 31;
    case 3:  // ���µ�
        if(leapYear(year))
            w += 29;
        else
            w += 28;
    case 2:  // ���µ���
        w += 31;
    case 1:  // 1�²�����
        ;
    }

    // �õ�-6������Ϊ������
    w = w % 7;

    // ����������
    if(w == 0)
        w = 7;
    return w;
}

// �������油����룬ʵ�ֺ���printMonth
/*************** Begin **************/


/*************** End **************/

int main()
{
    // �ꡢ��
    int y, m;

    // ��������
    scanf("%d %d", &y, &m);

    // ��������µ�����
    printMonth(y,m);

    return 0;
}
