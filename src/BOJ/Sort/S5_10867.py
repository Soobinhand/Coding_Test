a = int(input())
arr = set(map(int, input().split()))
arr = sorted(arr)
for i in arr:
    print(i,end=' ')
