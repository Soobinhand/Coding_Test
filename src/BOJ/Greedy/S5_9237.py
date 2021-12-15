a = int(input())
arr = list(map(int, input().split()))
arrr = []
for i in range(a):
    arrr.append(i+1)
arr.sort(reverse=True)
answer = 1
answer_arr = []
for i in range(a):
    answer_arr.append(arr[i]+arrr[i])
answer += max(answer_arr)
print(answer)