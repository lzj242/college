one_pieces=['lu fei','suo long','na mei','shang zi','qiao ba','luo bin','wu suo pu','fu lan qi','bu lu ke']
for one_piece in one_pieces:
	print(one_piece)
	print(f"{one_piece.title()},you is my idol.I will always love you!\n")
	print(f"{one_piece.title()},I hope your voyage is never over.\n" )
print("Thank you for accompanying me in my youth!")
for value in range(1,7):
    print(value)
numbers=list(range(1,6))
print(numbers)
even_numbers=list(range(3,11,2))
print(even_numbers)
squares=[]
for value in range(1,11):
	square=value ** 2
	squares.append(square)
print(squares)
squares=[]
for value in range(1,11):
	squares.append(value**2)
print(squares)
digits=[]
for digit in range(1,11): 
	digits.append(digit)   
print(min(digits))
print(max(digits))
print(sum(digits))
squares=[value**2 for value in range (1,11)]
print(squares)
print(one_pieces[0:3])
print(one_pieces[:3])
print(one_pieces[-3:])
for one_piece in one_pieces[-3:]:
	print(one_piece.title())
my_foods=['pizza','falafel','carrot cake']
friend_foods=my_foods[:]
print("My favourit foods are:")
print(my_foods)
print("\nMy friend's favourit foods are:\n")
print(friend_foods)
my_foods.append('ice cream')
friend_foods.append('cannoli')
print("\nMy favourit foods are:\n")
print(my_foods)
print("My friend's favourit food are:")
print(friend_foods)
dimensions=(200,50)
for dimension in dimensions:
	print(dimension)
dimensions=(400,100)
for dimension in dimensions:
	print(dimension)
#总结：
#1.for 循环：
#1）.格式：xxxs=['yyy'] for xxx in xxxs: print(xxx)
#2) 注意：缩进；冒号。
#2.range函数：
#