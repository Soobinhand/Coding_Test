def dfs(n):
    visited[n] = True
    for i in graph[n]:
        if not visited[i]:
            dfs(i)

import sys
sys.setrecursionlimit(10000)
n, m = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)
cnt = 0
for i in range(1, len(visited)):
    if visited[i] == False:
        cnt += 1
        dfs(i)
print(cnt)