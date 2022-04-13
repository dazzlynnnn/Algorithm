n, m, k = map(int, input().split())
arr = list(map(int, input().split()))

first = max(arr)
arr[arr.index(first)] = 0
second = max(arr)

result = 0
count = 0

while m>0:
  if count == k:
    result += second
    count = 0
  else:
    result += first
    count += 1
  m -= 1

print(result)
