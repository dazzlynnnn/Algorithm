arr = input().split('-')

for i in range(len(arr)):
  arr[i] = sum(list(map(int, arr[i].split('+'))))
  if i!=0:
    arr[i] = -arr[i]

print(sum(arr))
