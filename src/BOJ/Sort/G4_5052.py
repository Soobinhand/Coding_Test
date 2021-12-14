import sys

t = int(sys.stdin.readline())
endFlag = False

for _ in range(t):
    n = int(sys.stdin.readline())
    arr = list(sys.stdin.readline().rstrip() for _ in range(n))
    arr.sort()
    for i in range(len(arr) - 1):
        if arr[i] in arr[i + 1][0:len(arr[i])]:
            print("NO")
            endFlag = True
            break
    if not endFlag:
        print("YES")
    endFlag = False
