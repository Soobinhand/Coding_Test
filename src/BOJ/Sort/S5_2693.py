a = int(input())
answer = []
for i in range(a):
    arr = list(map(int, input().split()))
    arr.sort()
    answer.append(arr[len(arr)-3])
for i in answer:
    print(i)