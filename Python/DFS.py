V = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
#V = ['d', 'h', 'g', 'f', 'e', 'a', 'c', 'b']
E = {('a','b'),('a','c'),('a','g'),
     ('b','a'),('b','d'),('b','g'),
     ('c','a'),('c','d'),('c','e'),
     ('d','b'),('d','c'),('d','f'),
     ('e','c'),('e','f'),('e','g'),
     ('f','d'),('f','e'),('f','h'),
     ('g','a'),('g','b'),('g','e'),
     ('h','f')}


v1 = V[0]
Vp = [v1]
Ep = []

w = v1
padre = {}
L=len(V)
zz=0
while True:
    while True:
        if zz==L:
            break

        Ax=(w,V[zz])
        if ((Ax)) in E and V[zz] not in Vp:
            Ep.append((w,V[zz]))
            Vp.append(V[zz])
            padre.update({V[zz]:w})
            w = V[zz]
            zz=0
        else:
            zz+=1
    if w == v1:
        print("Finalizado")
        break
    zz=1
    w = padre.get(w)  
print(f"\nE' = {Ep}")
# f,e e,f e,g  