// ����һ���ַ��� s �������ҳ����в������ظ��ַ���?��Ӵ�?�ĳ��ȡ�
// ?
//     ʾ��?1 :
//     ���� : s = "abcabcbb" ��� : 3 ���� : ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
// ʾ�� 2 :
//     ���� : s = "bbbbb" ��� : 1 ���� : ��Ϊ���ظ��ַ�����Ӵ��� "b"�������䳤��Ϊ 1
#include <stdio.h>
#include <string.h>
int main()
{
    int max = 1, j = 0;
    char c[50000];
    char c1[50000];
    gets(c);
    int n = strlen(c);
    if (n == 0 || c == NULL)
    {
        printf("0");
    }
    else
    {
        int t = 1, d, o, l, length = 0, f;
        char m;
        for (int i = 0; i < n; i++)
        {
            /* code */
            d = i;
            t = 1;
            o = 0;
            j = 0;
            if (max < length)
            {
                max = length;
            }
            for (;;)
            {
                f = d + 1;
                if (c[d] != c[f] && d < n - 2)
                {
                    m = c[d];
                    for (l = 0; l < t; l++)
                    {
                        /* code */
                        if (m == c1[l])
                        {
                            break;
                        }
                    }
                    if (l >= t)
                    {
                        c1[o] = m;
                        o++;
                        t++;
                        d++;
                        length = strlen(c1);
                    }
                    else if (l < t)
                    {
                        j++;
                        break;
                    }
                }
                if (j > 0)
                {
                    break;
                }
                else if (c[d] == c[f] || d == n - 2)
                {
                    break;
                }
            }
        }
        printf("%d", max);
    }
}