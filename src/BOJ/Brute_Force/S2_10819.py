import itertools

a = int(input())
arr = list(map(int, input().split()))
arr.sort()
arr2 = list(itertools.permutations(arr, a))
answer = 0
for i in range(len(arr2)):
    tmp = 0
    for j in range(a - 1):
        tmp += abs(arr2[i][j] - arr2[i][j + 1])
    if tmp > answer:
        answer = tmp
print(answer)
