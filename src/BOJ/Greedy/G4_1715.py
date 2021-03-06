import heapq
a = int(input())
arr = list()
for i in range(a):
    heapq.heappush(arr, int(input()))
if len(arr) == 1:
    print(0)
else:
    answer = 0
    while len(arr) > 1:
        tmp1 = heapq.heappop(arr)
        tmp2 = heapq.heappop(arr)
        answer += tmp1+tmp2
        heapq.heappush(arr, tmp1 + tmp2)
    print(answer)