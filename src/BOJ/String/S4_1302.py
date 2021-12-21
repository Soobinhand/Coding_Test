a = int(input())
arr = []
for _ in range(a):
    arr.append(input())

d = dict()
count = []

for i in list(set(arr)):
    d[i] = arr.count(i)
for i in d.keys():
    if d[i] == max(d.values()):
        count.append(i)
count.sort()
print(count[0])