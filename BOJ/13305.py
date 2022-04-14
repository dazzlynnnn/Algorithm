n = int(input())
dist = list(map(int, input().split()))
cost = list(map(int, input().split()))
cost = cost[0:len(cost)-1]
min = min(cost)
result = 0

for i in range(len(cost)-1):
  if cost[i] == min:
    result += sum(dist)*cost[i]
    break
  else:
    result += dist[i]*cost[i]
    dist[i] = 0

print(result)
