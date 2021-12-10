import heapq

a = int(input())
classs = []
for i in range(a):
    start, end = list(map(int, input().split()))
    classs.append([start, end])
classs.sort()
room = []
heapq.heappush(room, classs[0][1])
for i in range(1, a):
    if classs[i][0] < room[0]:
        heapq.heappush(room, classs[i][1])
    else:
        heapq.heappop(room)
        heapq.heappush(room, classs[i][1])
print(len(room))
