a = int(input())

for i in range(a):
    answer = 0
    b = int(input())
    arr = list(map(int, input().split()))
    while True:
        if len(arr) == 0:
            break
        num = arr.pop()

        for j in range(len(arr)-1, -1, -1):
            if num >= arr[j]:
                answer += (num - arr[j])
                arr.pop()
            else:
                break
    print(answer)