Lista = [ [4, 10, 18], 14, [3, 7, 2], 16, 30, [9, 5], 12 ]

Lista[2].append ( Lista[4] )
print(Lista)
Lista [0] = [Lista[6]] + Lista[0]
print(Lista)
Lista [5][1] += Lista[0][1] + Lista[2][1]
print(Lista)
Lista.append ( [ Lista[4], Lista[1] ] )
print(Lista)
Lista[0] += [ Lista[5][0] ] + [ Lista[2][2] ]
print(Lista)
