t = int(input())
for _ in range(t):
  result = ""
  r, s = input().split()
  for i in s:
    result += i*int(r)
  print(result)
