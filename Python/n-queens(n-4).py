Tabla = []
dif=2
for i in range(5):
    Tabla.append(['_'] * 4)

Tabla[0][0]=1
ColAct=1
dif=1
while ColAct<4:
    Col=0
    fila=0
    TablaAux=[1,1,1,1,"Tope"]
    dif=1
    while dif > 0 and dif<4:
        dif=ColAct-Col
        fila=0
        while fila < 4 and ColAct<4: 
            filaAux=fila+1  

            #DIF Si la cola actual menos al insertar col=anterio colaux =a insertar
            if dif!=1:
                if Tabla[fila][Col]==1:
                    TablaAux.pop(fila)
                    TablaAux.insert(fila,0)


            else:
                if Tabla[fila][Col]==1:
                    TablaAux.pop(fila)
                    TablaAux.insert(fila,0)
                    TablaAux.pop(filaAux)
                    TablaAux.insert(filaAux,0)

                if Tabla[filaAux][Col]==1:
                    TablaAux.pop(fila)
                    TablaAux.insert(fila,0)
                    TablaAux.pop(filaAux)
                    TablaAux.insert(filaAux,0)
                    filaAux+=1
                    TablaAux.pop(filaAux)
                    TablaAux.insert(filaAux,0)
                    filaAux-=1
                if TablaAux[fila]==1:
                    Tabla[fila][ColAct]=1
                    ColAct+=1	
                    Col += 1
                    dif=0
                    break 
                if filaAux>3:
                    ColAct-=1
                    i=0
                    for i in range(4):
                        #if colAct<0:
                               #return
                               # NO se encotro Solucion     
                        if Tabla[i][ColAct]==1:
                            Tabla[i][ColAct]='_'
                            fila+=1

                    if fila>3:
                        ColAct-=1
                        dif=0
                    #if colAct<0:
                           #return
                            # NO se encotro Solucion 
                    if ColAct<1:
                        for i in range(4):
                         
                            if Tabla[i][ColAct]==1:
                                Tabla[i][ColAct]='_'
                                Tabla[i+1][ColAct]=1
                                ColAct=1
                                break
                    break

 
            fila+=1             
        Col += 1
        
for i in range(4):
    print(*Tabla[i])


  	

 
