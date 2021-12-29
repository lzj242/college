#include<iostream>
using namespace std;
void pstring ()
{
	string str;
	str = "abc";
	cout << str.size();
	cout << str.empty();
	cout << str[1];
	str.push_back('w');
	cout << str.size();
	str.pop_back();
	cout << str;
	cout << str.substr(1, str.size() - 1);
}