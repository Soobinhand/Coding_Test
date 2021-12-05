n = int(input())
maxarr = [0] * (n + 1)
answer = [0] + list(map(int, input().split()))
maxarr[1] = answer[1]
for i in range(2, n + 1):
    for j in range(1, i + 1):
        if maxarr[i] < maxarr[i - j] + answer[j]:
            maxarr[i] = maxarr[i - j] + answer[j]
print(maxarr[n])
