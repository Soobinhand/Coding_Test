def solution(s):
    answer = True
    p_num = 0
    y_num = 0
    for i in s:
        if i == "P" or i == "p":
            p_num += 1
        if i=="Y" or i =="y":
            y_num += 1
    if y_num == p_num:
        answer = True
    else:
        answer = False
    return answer

