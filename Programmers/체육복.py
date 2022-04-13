def solution(n, lost, reserve):
    _lost = [i for i in lost if i not in reserve]
    _reserve = [i for i in reserve if i not in lost]

    _reserve.sort()
    
    for i in _reserve:
        if i-1 in _lost:
            _lost.remove(i-1)
        elif i+1 in _lost:
            _lost.remove(i+1)
            
    return n-len(_lost)
