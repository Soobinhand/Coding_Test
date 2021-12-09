n = input()
stack = []
for i in range(len(n)):
    stack.append(n[i])
    if stack[-4:] == list("PPAP"):
        del stack[-4:]
        stack.append("P")
if stack == list("PPAP") or stack == list("P"):
    print("PPAP")
else:
    print("NP")
