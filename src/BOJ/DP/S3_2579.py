a = int(input())
stage = [0]
for _ in range(a):
    stage.append(int(input()))

if a == 1:
    print(stage[1])
else:
    dp = [0] * (a + 1)
    dp[1] = stage[1]
    dp[2] = stage[1] + stage[2]

    for i in range(3, a + 1):
        dp[i] = max(dp[i - 3] + stage[i - 1] + stage[i], dp[i - 2] + stage[i])
    print(dp[a])
