numbers = set(range(1,10001))
generated = set()

for i in range(1, 10001):
  for j in str(i):
    i += int(j)
  generated.add(i)

numbers = sorted(numbers-generated)
for i in numbers:
    print(i)
