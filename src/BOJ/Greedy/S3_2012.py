import sys
a = int(sys.stdin.readline())
arr = []
for _ in range(a):
    arr.append(int(sys.stdin.readline()))
arr.sort()
answer = 0
for i in range(len(arr)):
    answer += abs(arr[i] - (i+1))
print(answer)