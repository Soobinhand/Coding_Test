a = int(input())
answer = 0
while a >= 0:
    if a % 5 ==0:
        answer += a//5
        print(answer)
        break
    a-=3
    answer+=1
else:
    print(-1)