a, b = map(int,input().split())
arr = list(map(int, input().split()))
for i in range(b):
    arr.sort()
    mix = arr[0] + arr[1]
    arr[0] = mix
    arr[1] = mix
print(sum(arr))

