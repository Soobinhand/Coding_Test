a = int(input())
arr = []
for _ in range(a):
    arr.append(int(input()))
zero = arr.count(0)
one = arr.count(1)
if zero > one:
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")
