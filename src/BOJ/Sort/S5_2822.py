a = []
a_sort = []
total = 0
answer = []
for _ in range(8):
    a.append(int(input()))
a_sort = sorted(a, reverse=True)
a_sort = a_sort[0:5]
for i in a_sort:
    answer.append(a.index(i) + 1)
answer.sort()
total = sum(a_sort)
print(total)
print(*answer)
