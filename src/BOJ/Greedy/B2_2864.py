a, b = input().split()
amaxnum = 0
bmaxnum = 0
aminnum = a
bminnum = b
if '5' in a:
    a = a.replace('5', '6')
if '5' in b:
    b = b.replace('5', '6')
maxx = int(a) + int(b)
if '6' in a:
    a = a.replace('6', '5')
if '6' in b:
    b = b.replace('6', '5')
minn = int(a) + int(b)
print(minn, maxx)
