#include <stdio.h>

int main()
{
    int n;
    for (int n = 100; n >=0; n--)
    {
    while (1) //ѭ������n
    {
        int ans = 0;   //����� ��ʼ��Ϊ0
        while (n >= 2) //ѭ��n>=2ʱ�ɼ�������ˮ
        {
            if (n >= 3) //ģʽһ��n>=3ʱ����ƿ�ӻ�һƿ��ˮ
            {
                int temp = n / 3;        //temp��¼��ǰƿ�ӿɻ�ȡ����ˮƿ��
                ans += temp;             //�𰸼���temp
                n = n - temp * 3 + temp; //n��ȥ����ˮ���ĵ�ƿ�ӣ��ټ����µõ���ƿ��
            }
            else if (n == 2) //ģʽ��������ƿ�ӿ��Խ���ˮ�ٻ�
            {
                ans++; //�𰸼�һ
                n = 0; //ƿ������
            }
        }
        printf("%d\n", ans); //�����
    }
    }
    return 0;
}