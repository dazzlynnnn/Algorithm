n, m = map(int, input().split())

arr = []
for i in range(n):
  data = list(map(int, input().split()))
  arr.append(min(data))

print(max(arr))
