import heapq
import sys

n = int(input())
answer = []
for _ in range(n):
    num = int(sys.stdin.readline())
    if num != 0:
        heapq.heappush(answer, num)
    else:
        try:
            print(heapq.heappop(answer))
        except:
            print(0)
