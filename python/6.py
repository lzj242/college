alien_0={'color':'green','points':5}
print(alien_0['color'])
print(alien_0['points'])
new_points=alien_0['points']
print(f"you just earned {new_points} points!")
alien_0['x_position']=0
alien_0['y_position']=25
print(alien_0)
alien_0={}
alien_0['color']='green'
alien_0['points']=5
print(alien_0)
alien_0={'color':'green'}
print(f"The alien is {alien_0['color']}.")
alien_0['color']='yellow'
print(f"The alien is now {alien_0['color']}")
alien_0={'color':'green','points':5}
print(alien_0)
del alien_0['points']
print(alien_0)
favourit_languages={
	'jen':'python',
	'sarah':'c',
	'edward':'ruby',
	'phil':'python'
}
language=favourit_languages['phil'].title()
print(f"Sarah's favourit language is {language}")
alien_0={'color':'green','speed':'slow'}
point_value=alien_0.get('points','NO point value assinged')
print(point_value)