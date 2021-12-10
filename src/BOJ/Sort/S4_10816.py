from collections import Counter
n = int(input())
arr = list(map(int, input().split()))
m = int(input())
arrr = list(map(int, input().split()))
arr.sort()
answer = []
counter = Counter(arr)
for i in arrr:
    answer.append(counter[i])
for i in answer:
    print(i,end=' ')