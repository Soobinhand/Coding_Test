n = int(input())


def sol(a):
    if a == 1:
        return 1
    elif a == 2:
        return 2
    elif a == 3:
        return 4
    else:
        return sol(a - 1) + sol(a - 2) + sol(a - 3)


for i in range(n):
    b = int(input())
    print(sol(b))
