n = int(input())

score = 0
answer = 0

for _ in range(n):
  s = input().split('X')
  for i in s:
    for _ in range(len(i)):
      score += 1
      answer += score
    score = 0
  print(answer)
  answer = 0
