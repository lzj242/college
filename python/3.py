famous_person=["Mao ze dong","Zhou en lai","Zhu de","Liu shao qi","Ren bi shi"]
print(famous_person)
print(famous_person[2])
print(famous_person[1])
print(famous_person[3].title())
print(famous_person[0].upper())
print(famous_person[4])
print(famous_person[-1])
print(famous_person[-2])
message=f"My favourit person is {famous_person[1]}"
print(message)
message="My favourit person is "
print(f"{message}{famous_person[1]}")
famous_person[4]="He long"
print(famous_person[4])
famous_person.append('Zuo quan')
print(famous_person)
hero=[]
hero.append('freefighter')
hero.append('doctor')
hero.append('poclicemen')
hero.append('solider')
print(hero)
print(hero[2])
names=["Sam","Lingling","Daming","Amy"]
print(names)
print(names[0])
print(names[1])
print(names[2])
print(names[3])
print(f'{names[0]},Hello')
print(f'{names[1]},Hello')
print(f'{names[2]},Hello')
print(f'{names[3]},Hello')
names.insert(2,'Laura')
print(names)
del names[2]
print(names)
print(names.pop(2))
print(names)
print(names.remove('Amy'))
print(names)
guest_names=["范蠡","秦始皇","刘邦","乔布斯"]
print(guest_names)
print(guest_names[-1])
guest_names[-1]="胡雪岩"
print(guest_names)
iphone=['huawei','xiaomi','apple','oppo']
iphone.sort()
print(iphone)
iphone.sort(reverse=True)
print(iphone)
cars=['aji','jioj','hd','lj']
sorted(cars)
print((cars))
print(sorted(cars,reverse=True))
hhh=['whd','hd','hdghjw','kdg']
print(len(hhh))