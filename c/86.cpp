#include<stdio.h>
#define N 3
struct student 
{
	int num;
	char name[20];
	float score[3];
	float aver;
}stu[3];
int main()
{
	void input (struct student stu[]);
	struct student max(struct student stu[]);
	void print (struct student stu);
	struct student stu[N],*p=stu;
	input(p);
	print(max(p));
	return 0; 
}
void input (struct student stu[])
{
	int i;
	printf("�������ѧ������Ϣ��ѧ�š�������3�ſγɼ�:\n");
	for(i=0;i<N;i++)
	{
		scanf("%d %s %f %f %f",&stu[i].num,stu[i].name,&stu[i].score[0],&stu[i].score[1],&stu[i].score[2]);
		stu[i].aver=(stu[i].score[0]+stu[i].score[1]+stu[i].score[2])/3.0;
	}
}
struct student max(struct student stu[])
{
	int i,m=0;
	for(i=0;i<N;i++)
	if(stu[i].aver>stu[m].aver) m=i;
	return stu[m];
}
void print(struct student stu)
{
	printf("\n�ɼ���ߵ�ѧ����:\n");
	printf("ѧ�ţ�%d\n ������%s\n ���ſγɼ�:%5.lf,%5.lf,%5.lf\nƽ���ɼ���%.2f\n",stu.num,stu.name,stu.score[0],stu.score[1],stu.score[2],stu.aver);
}
