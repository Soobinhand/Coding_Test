a = int(input())
b = input()
count = b.count("LL")
if count <= 1:
    print(len(b))
else:
    print(len(b) - count + 1)