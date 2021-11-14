cars=['audi','bmn','subaru','toyota']
for car in cars:
	if car=='bmn':
		print(car.upper())
	else:
		print(car.title())
age_0=22
age_1=18
age_0>=21 and age_1>21
print('t') 
age_0=18
age_1=17

if(age_0>=21 or age_1>=21):
	print('T')
else:
	print('F')
requested_toppings=['mushrooms','onions','pineapple']
if'mushrooms'in requested_toppings:
	print('T')
else:
	print('F')
banned_users=['andrew','carolina','david']
user='marie'
if user not in banned_users:
	print(f"{user.title()},you can post a response if you wish.")
age=12
if age <4:
	print('Your admission cost is $0.')
elif age <18:
	print('Your admission cost is $25.')
else :
	print('Your admission cost is $40.')
age=12
if age<4:
	price=0
elif age<18:
	price=25
else :
	price=40
print(f"Your admission cost is ${price}.")
requested_toppings=['mushrooms','green peppers','extra cheese']
for requested_topping in requested_toppings:
	if requested_topping=='green peppers':
		print("Sorry ,We are out of green peppers right now.")
	else:
		print(f"Adding {requested_topping}.")
print("\nFinished making your pizza!\n")
requested_toppings=[]
if requested_toppings:
	for requested_topping in requested_toppings:
		print(f"Adding {requested_toppings}.")
		print("\n Finished making your pizzza.")
else:
	print("Are you sure you want a plain pizza.")
available_toppings=['mushrooms','olives','green peppers','pepperoni','pineapple','extra cheese']
requested_toppings=['mushrooms','freknch fries','extra cheese']
for requested_topping in requested_toppings:
	if requested_topping in available_toppings:
		print(f"Adding {requested_topping}.")
	else:
		print(f"sorry ,we don't have {requested_topping}.")
print("\n Finished making your pizza.")