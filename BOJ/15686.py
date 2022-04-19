from itertools import combinations

n, m = map(int, input().split())

chicken = []
house = []

for i in range(n):
  s = input().split()
  for j in range(n):
    if s[j] == '1':
      house.append((i, j))
    elif s[j] == '2':
      chicken.append((i, j))
 
result = []
for i in list(combinations(chicken, m)):
    r = 0
    for hy, hx in house:
        dist = []
        for cy, cx in i:
            dist.append(abs(hy-cy)+abs(hx-cx))
        r += min(dist)
    result.append(r)

print(min(result))
    
