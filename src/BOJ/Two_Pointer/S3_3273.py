a = int(input())
arr = list(map(int, input().split()))
x = int(input())
answer = 0
arr.sort()
left, right = 0, len(arr)-1
while left < right:
    tmp = arr[left] + arr[right]
    if tmp == x:
        answer += 1
        left += 1
    elif tmp < x:
        left += 1
    else:
        right -= 1
print(answer)