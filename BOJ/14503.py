n, m = map(int, input().split())
r, c, d = map(int, input().split())

room = [[]*m for _ in range(n)]
for i in range(n):
    s = list(map(int, input().split()))
    for j in range(m):
        room[i].append(s[j])

count = 0
result = 0

while True:
    if room[r][c] == 0:
        result = result + 1
        room[r][c] = 2
    
    newR, newC = r, c
    if d == 0: newC -= 1
    elif d == 1: newR -= 1
    elif d == 2: newC += 1
    else: newR += 1
        
    d = (d+3)%4
    if room[newR][newC] == 0:
        r, c = newR, newC
        count = 0
    else:
        count += 1
        if count == 4:
            if d == 0: newR += 2
            elif d == 1: newC -= 2
            elif d == 2: newR -= 2
            else: newC += 2
            if room[newR][newC] == 1:
                break
            else:
                r, c = newR, newC
                count = 0

print(result)
