n = int(input())
arr = list(map(int, input().split()))
arr.sort()
answer = 0
for i in range(len(arr)-1):
    answer += arr[i]

print(answer)