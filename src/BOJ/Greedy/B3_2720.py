n = int(input())
for i in range(n):
    cent = int(input())
    arr = []
    q = 25
    d = 10
    n = 5
    p = 1
    arr.append(cent//q)
    cent%=q
    arr.append(cent//d)
    cent%=d
    arr.append(cent//n)
    cent%=n
    arr.append(cent//p)
    for j in arr:
        print(j,end=' ')