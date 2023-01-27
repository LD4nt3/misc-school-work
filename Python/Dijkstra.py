V = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'z']

E = {'ab':2,'af':1,'ba':2,
     'bd':2,'be':4,'bc':2,
     'ce':3,'cb':2,'cz':1,
     'de':4,'df':3,'db':2,
     'eb':4,'ed':4,'eg':7,
     'gz':6,'ge':7,'gf':5,
     'fa':1,'fd':3,'fg':5,
     'zc':1,'zg':6  }

#v1 = V[5]
v1 = V[0]
Vp = [v1]
Ep = []
w = v1
rutas=[]
ruta={}

aristaAux=[]
i=-1
existe=False
while True:
    #
    while True:
        existe=False
        arista=[(w+x) for x in V if (w+x) in E and x not in Vp]
        #arista=({w+x:0} for x in V if (w+x) in E and x not in Vp) +E.get(w+x)
        if i ==0:
            print("X")
       
        i+=1
        if arista==[]:

            if aristaAux ==[]:
                #no existe ruta o se termino de reccorer
                
                break
            else:#para camino encerrado 
                i-=1
                arista=aristaAux[i]
                for z in arista:
                    while len(arista)<2:
                        Vp.remove(arista[0][1])
                        
                        aristaAux.pop(i)
                        i-=1
                        if i>-1:
                            ruta.popitem()  
                            arista=aristaAux[i]
                        else:
                            break
                       
                if i>-1:        
                    Vp.remove(arista[0][1])
                    arista.pop(0)
                    ruta.popitem()
                    peso=E.get(arista[0])
                    ruta.update({arista[0]:peso})
                    w=arista[0][1]
                    Vp.append(w)
            break         
        aristaAux.append(arista)        
        vk = arista[0]
        Ep.append(vk)
        
        w = vk[1]

        
        for z in arista:
            if z[1]=="z":
                existe=True
                vk=z
                peso=E.get(vk)
                ruta.update({vk:peso})
                print(ruta)
                x = ruta.copy()#desligar
                rutas.append(x)
               
                if len(rutas)>1:
                    p0=sum(rutas[0].values())
                    p1=sum(rutas[1].values())
                    if p0>p1:
                        rutas.pop(0)
                    else:
                        rutas.pop(1)
                
                ruta.popitem()
                arista.pop()
                
                if arista== []:
                    aristaAux.pop(i)
                    i-=1
                    if i>-1:
                        arista=aristaAux[i]

                    while len(arista)<2:#solo tiene un elemento
                        Vp.remove(arista[0][1])
                        aristaAux.pop(i)
                        
                        i-=1
                        if i>-1:
                            ruta.popitem()
                            arista=aristaAux[i]
                        else:
                            break
                    if i>-1:
                        arista=aristaAux[i]
                        Vp.remove(arista[0][1])
                        arista.pop(0)
                        ruta.popitem()
                        peso=E.get(arista[0])
                        ruta.update({arista[0]:peso})
            
                    else:
                        break
                peso=E.get(arista[0])
                ruta.update({arista[0]:peso})

                w=arista[0][1]
                Vp.append(w)#repeticioN
                break
        if vk[1]!="z":#evitar repeticion
            Vp.append(vk[1]) 
        if not existe:
            peso=E.get(vk)
            ruta.update({vk:peso})
        break
       

    if aristaAux==[]:
        print("RUTA MAS CORTA:")
        print(rutas)
        print(sum(rutas[0].values()))
        print("Finalizado")
        break
        
   
#print(f"\nE' = {Ep}")