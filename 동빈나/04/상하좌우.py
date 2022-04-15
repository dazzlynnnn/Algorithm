n = int(input())
a = input().split()
current = [0, 0]
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

dir = 0
for i in a:
  if i=='L':
    dir = 0
    if current[1]==0:
      continue
  elif i=='R':
    dir = 1
    if current[1] == (n-1):
      continue
  elif i=='U':
    dir = 2
    if current[0] == 0:
      continue
  else:
    dir = 3
    if current[0] == (n-1):
      continue

  current[0] += dx[dir]
  current[1] += dy[dir]

print(current[0]+1, current[1]+1)
