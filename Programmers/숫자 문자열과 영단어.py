def solution(s):
    s.replace('three', '3')
    numbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in numbers:
        if i in s:
            s = s.replace(i, str(numbers.index(i)))
    answer = int(s)
    return answer
