from collections import Counter

n = int(input())
narr = list(map(int, input().split()))
m = int(input())
marr = list(map(int, input().split()))
counter = Counter(narr)
answer = []
for i in marr:
    answer.append(counter[i])
for i in answer:
    print(i,end=' ')