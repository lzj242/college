// ��Ŀ����
// ���ӳ������⡣���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬������񫣬�ֶ����һ���� �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ��һ����
// �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ���� ����N���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ��������
#include <stdio.h>
#include <sys/socket.h>
int main()
{
    int peachnumbers(int n);
    int n, t;
    scanf("%d", &t);
    n = peachnumbers(t);
    printf("%d", n);
    return 0;
}
int peachnumbers(int n)
{
    int x, y;
    x = n;
    if (x == 1)
    {
        return 1;
    }
    else
    {
        return (peachnumbers(x-1)+1)*2;
    }
}
