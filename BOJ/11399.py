n = int(input())

arr = list(map(int, input().split()))
arr.sort(reverse=True)

sum=0
for i in range(n):
  sum += arr[i] * (i+1)

print(sum)
