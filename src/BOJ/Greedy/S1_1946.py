import sys

n = int(input())
for i in range(n):
    answer = 1
    people = []
    a = int(input())
    for j in range(a):
        s, m = list(map(int, sys.stdin.readline().split()))
        people.append([s, m])
    people.sort()
    maxmax = people[0][1]

    for j in range(1, a):
        if maxmax > people[j][1]:
            answer += 1
            maxmax = people[j][1]
    print(answer)
