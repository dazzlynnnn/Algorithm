l = ord('z')-ord('a')+1
arr = [-1]*l

s = input()
for i in s:
  if arr[ord(i)-ord('a')] == -1:
    arr[ord(i)-ord('a')] = s.index(i)

for i in arr:
  print(i, end=' ')
