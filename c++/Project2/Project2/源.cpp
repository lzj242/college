#include<vector>
#include <iostream>
using namespace std;
int pvector()
{
	int n = 7, m = 8;
	vector<int>nums(n);
	bool q=true;
	cout << q<<"\n";
	cout << nums.size() << "\n";
	int a = nums[4];
	nums[0] = 11;
	nums.push_back(20);
	cout << nums.size() << "\n";
	int b = nums.back();
	cout << b << "\n";
	nums.pop_back();
	cout << nums.size() << "\n";
	swap(nums[0], nums[1]);
	return 0;
}