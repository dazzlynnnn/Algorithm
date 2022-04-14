h, m = map(int, input().split())
time = int(input())

m += time
h += m//60
h %= 24
m %= 60

print(h, m)
