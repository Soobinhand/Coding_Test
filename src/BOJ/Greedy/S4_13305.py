dosi_number = int(input())
distance = list(map(int, input().split()))
price = list(map(int, input().split()))
answer = price[0]
sum = 0
for i in range(len(distance)):
    if answer > price[i]:
        answer = price[i]
    sum += (answer * distance[i])
print(sum)
