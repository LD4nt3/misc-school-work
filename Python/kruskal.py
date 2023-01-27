#V = ('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
#V = ('0', '1', '2', '3')
#V = ('d', 'h', 'g', 'f', 'e', 'a', 'c', 'b')
#E = {('0','1'),('0','2'),('1','2'),
     #('2','0'),('2','3'),('3','3')}
V = ['1', '2', '3', '4', '5', '6']

Es = {'12':4,'13':2,'15':3,
     '24':5,'21':4,'31':2,
     '34':1,'35':6,'36':3,
     '43':1,'42':5,'46':6,
     '51':3,'53':6,'56':2,
     '63':3,'64':6,'65':2,
      }
E = sorted(Es.items(), key=lambda x: x[1]) 

Vp = []#salvar entrar en ciclo
Ep = []
arista=[]

for i in  E:
    if len(arista)>4:
        break
    if i[0][0] not in Vp:
        arista.append((i))
        Ep.append(i[0])
        Vp.append(i[0][1])                         
peso=0
for z in arista:
    peso=peso+z[1]
    

print(f"\nE' = {Ep}")
print("Su peso es:")
print(peso)