#include<iostream>
#include<unordered_map>
using namespace std;
int main()
{
	vector<int> nums{ 1,2,3,4,5,6 };
	unordered_map<int,int> unordered_map1;
	for (int i : nums)
	{
		unordered_map1[i];
	}
	for (auto& it:unordered_map1 )
	{
		int key = it.first;
		int val = it.second;
		cout << key << val << "\n";
	}
	return 0;
}