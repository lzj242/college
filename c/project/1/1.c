#include <stdio.h>
#include<string.h>
int main()
{
    //���1:��ʾ�˵�
    // ����
    //1.do-while��������4���˳�
    //������ر���
    //���2���Ǽ�����
    //����
    //ʹ��һ���ַ�������¼�������
    //���3���Ǽ�֧��
    //����
    //ʹ��һ���ַ�������¼֧�����
    //���4���˳�
    //����
    //ʹ���ַ���ȷ���˳�
    //���5������
    //���6
    char key = ' '; //��ʾ�û��������Ǹ��˵�
    int loop = 1;  //�����Ƿ��˳�ѭ��
    char details[3000] = "  -----------------��ǰ��֧��ϸ��¼-----------------\n��֧\t��֧���\t�˻����\t˵��\n";
    char note[20] = " ";//˵��
    char temp[100];
    char judge;
    double money=0;
    double balance=1000.0;//�˻����
    int flag=0;//
    do
    {
        /* code */
        printf("\n----------��ͥ��֧�������----------\n");
        printf("\n");
        printf("            1 ��֧��ϸ     \n");
        printf("            2 �Ǽ�����     \n");
        printf("            3 �Ǽ�֧��     \n");
        printf("            4 ��    ��     \n");
        printf("\n");
        printf("��ѡ��(1-4)��\n");
        scanf("%c", &key);
        getchar();
        switch (key)
        {
        case /* constant-expression */ '1':
            if(flag==0)
            {
                printf("��ǰû��һ����֧����һ�ʰ�\n");
            }
            else
            {
            puts(details);
            }
            /* code */
            break;
        case '2':
            printf("����������:");
            scanf("%lf",&money);
            getchar();
            balance+=money;//�������
            printf("��������˵��:");
            gets(note);
            sprintf(temp,"\n����\t%.2lf\t\t%.2lf\t\t%s",money,balance,note );
            strcat(details,temp);
            flag=1;
            break;
        case '3':
            printf("����֧�����:");
            scanf("%lf", &money);
            getchar();
            //�ж��Ƿ�֧��
            if(balance-money<0)
            {
                printf("����");
            }
            else
            {
                balance -= money; //�������
                printf("����֧��˵��:");
                gets(note);
                sprintf(temp, "\n֧��\t%.2lf\t\t%.2lf\t\t%s", money, balance, note);
                strcat(details, temp);
                flag = 1;
            }
            break;
        case '4':
            do
            {
                /* code */
            printf("��ȷ��Ҫ�˳���y/n\n");
            scanf("%c",&judge);
            getchar();
            if(judge=='y'||judge=='n')
            {
                break;
            }
            else
            {
                /* code */
                printf("���������������������");
            }
            } while (/* condition */1);
            if(judge=='y')
            {
            loop = 0;
            }
            break;
        default:
            printf("����������������������\n");
            break;
        }
    } while (loop);
    printf("���Ѿ��ɹ��˳��˼�ͥ�������");
    getchar();
    return 0;
}