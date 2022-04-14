n, k = map(int, input().split())

arr = []
for _ in range(n):
  arr.append(int(input()))
arr.sort(reverse=True)
count=0

for i in arr:
  if k>=i:
    count += k//i
    k %= i

print(count)
