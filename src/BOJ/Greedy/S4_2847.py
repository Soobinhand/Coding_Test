n = int(input())
answer = 0
arr = list()
for i in range(n):
    arr.append(int(input()))
arr.reverse()
for i in range(len(arr)-1):
    while arr[i] <= arr[i+1]:
        arr[i+1] -= 1
        answer += 1
print(answer)