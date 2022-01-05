height = float(input("请输入身高:"))
weight = float(input("请输入体重:"))
bmi = weight / (height * height)
# 判断体重是否合理
if bmi < 18.5:
    print("你的bmi指数:" + str(bmi))
    print("体重过轻")
if 18.5 <= bmi < 24.9:
    print("你的bmi指数:" + str(bmi))
    print("正常")
if 24.9 <= bmi < 29.9:
    print("你的bmi指数:" + str(bmi))
    print("体重过重")
if bmi >= 29.9:
    print("你的bmi指数:" + str(bmi))
    print("肥胖")
print(type(bmi))
print(0.1+0.2)