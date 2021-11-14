#include <stdio.h>
#include <string.h>
struct MyFamilyAccount
{
    /* data */
    int flags;      //�ж��Ƿ���һ����֧
    char details[2000]; //��ϸ
    double balance;     //���
};
char key = ' ';      //��ʾ�û��������Ǹ��˵�
int loop = 1;        //�����Ƿ��˳�ѭ��
char note[20] = " "; //˵��
char temp[100];
char judge;
double money = 0;
//�����֧ϸ�ں���
void detail(struct MyFamilyAccount *myFamilyAccount);
void income(struct MyFamilyAccount *myFamilyAccount);
void delete (struct MyFamilyAccount *myFamilyAccount);
void quit(struct MyFamilyAccount *myFamilyAccount);
void mainMenu(struct MyFamilyAccount *myFamilyAccount) //��ʾ�˵�
{
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
            detail(myFamilyAccount);
            /* code */
            break;
        case '2':
            income(myFamilyAccount);
            break;
        case '3':
            delete(myFamilyAccount);
            break;
        case '4':
            quit(myFamilyAccount);
            break;
        default:
            printf("����������������������\n");
            break;
        }
    } while (loop);
    printf("���Ѿ��ɹ��˳��˼�ͥ�������");
    getchar();
}
void main()
{
    //����һ���ṹ�����
    struct MyFamilyAccount myFamilyAccount;
    myFamilyAccount.flags = 0;
    myFamilyAccount.balance = 1000;
    //ʹ�ÿ���������ֵ
    memset(myFamilyAccount.details, 3000, 0); //����
    strcpy(myFamilyAccount.details, "------------------��ǰ��֧��ϸ��¼-----------------\n��֧\t��֧���\t�˻����\t˵��\n");
    //����mainMneu
    mainMenu(&myFamilyAccount);
}
void detail(struct MyFamilyAccount *myFamilyAccount)
{
    if (myFamilyAccount->flags == 0)
    {
        printf("��ǰû��һ����֧����һ�ʰ�\n");
    }
    else
    {
        puts(myFamilyAccount->details);
    }
}
void income(struct MyFamilyAccount *myFamilyAccount)
{
    printf("����������:");
    scanf("%lf", &money);
    getchar();
    myFamilyAccount->balance += money; //�������
    printf("��������˵��:");
    gets(note);
    sprintf(temp, "\n����\t%.2lf\t\t%.2lf\t\t%s", money, myFamilyAccount->balance, note);
    strcat(myFamilyAccount->details, temp);
    myFamilyAccount->flags = 1;
}
void delete (struct MyFamilyAccount *myFamilyAccount)
{
    printf("����֧�����:");
    scanf("%lf", &money);
    getchar();
    //�ж��Ƿ�֧��
    if (myFamilyAccount->balance - money < 0)
    {
        printf("����");
    }
    else
    {
        myFamilyAccount->balance -= money; //�������
        printf("����֧��˵��:");
        gets(note);
        sprintf(temp, "\n֧��\t%.2lf\t\t%.2lf\t\t%s", money, myFamilyAccount->balance, note);
        strcat(myFamilyAccount->details, temp);
        myFamilyAccount->flags = 1;
    }
}
void quit(struct MyFamilyAccount *myFamilyAccount)
{
    do
    {
        /* code */
        printf("��ȷ��Ҫ�˳���y/n\n");
        scanf("%c", &judge);
        getchar();
        if (judge == 'y' || judge == 'n')
        {
            break;
        }
        else
        {
            /* code */
            printf("���������������������");
        }
    } while (/* condition */ 1);
    if (judge == 'y')
    {
        loop = 0;
    }
}