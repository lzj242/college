#include<stdio.h>
int main()
{
	int i=0;
	float s;
	char y;
	while(1)
	{
	float m,n;
	char c;
	if(i==0)
	scanf("%f%c%f",&m,&c,&n);
	else
	{
	scanf(" %c%f",&c,&n);
	m=s;
    }
	if(c=='+')
	{
	s=m+n;
	printf("=%.3f\n",s);
}
	else if(c=='-')
	{
	s=m-n;
	printf("=%.3f\n",s);
}
	else if(c=='*')
	{
    s=m*n;
	printf("=%.3f\n",s);
}
	else if(c=='/')
	{
    s=m/n;
	printf("=%.3f\n",s);

}
	i++;
}
return 0;
}//π∑»’µƒc”Ô—‘ 
