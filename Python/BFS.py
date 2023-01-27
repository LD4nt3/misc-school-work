class Graph:
 
    # Constructor
    def __init__(self):

        #grafo
        self.graph = []
        #E' o T
        self.T = []
        #recorrido
        self.V = []
        
    # function to add an edge to graph
    def addEdge(self,u):
        self.graph.append(u)

 
    def BFS(self, s):
        k=0
        Visitado=0
        #si encontro vertice
        while 1:
            
            i=0
            #hijos
            S=[]
            for x, y in self.graph:
                if s == x:
                    seen = set(self.V)
                    if y not in seen:
                        if not self.V:
                            self.V.append(s)

                        self.V.append(y)
                        S.append(y)
                    u=(x,y)
                    self.T.append(u)
                    self.graph.pop(i)
                    Visitado=1
                    break

                if s == y:
                    seen = set(self.V)
                    if x not in seen:
                        if not self.V:
                            self.V.append(s)

                        self.V.append(x)
                        S.append(x)
                    u=(x,y)
                    self.T.append(u)
                    self.graph.pop(i)
                    Visitado=1
                    break
                i+=1
            p=len(self.graph)

            if Visitado==1:
                k+=1
                j=i
                while j < p:
                    #0 es x, y es 1
                    #print(j)
                    if s == self.graph[j][0]:
                        seen = set(self.V)
                        if self.graph[j][1] not in seen:
                             self.V.append(self.graph[j][1])
                             S.append(self.graph[j][1])

                        u=(self.graph[j][0],self.graph[j][1])
                        self.T.append(u)
                        self.graph.pop(j)
                        p-=1
                        j-=1
                        
                    
                    if s == self.graph[j][1]:
                        seen = set(self.V)
                        if self.graph[j][0] not in seen:
                            self.V.append(self.graph[j][0])
                            S.append(self.graph[j][0])
                        u=(self.graph[j][0],self.graph[j][1])
                        self.T.append(u)
                        self.graph.pop(j)
                        p-=1
                        j-=1
                    j+=1    
                if self.graph and self.V:
                    print(f"\nS' = {S}")
                    s=self.V[k]
                Visitado=0 

                if not self.V:     
                    print("El vertice no existe")
                    break
       
            else:
                if not self.graph:

                    print(self.V)
                    print("Fin del recorrido.")
                    
                    break
                
                Visitado=1    		
        return self.T
            #print (s, end = " ")
 

g = Graph()
g.addEdge(("a","b"))
g.addEdge(("a","c"))
g.addEdge(("b","d"))
g.addEdge(("b","e"))
g.addEdge(("f","h"))
g.addEdge(("a","g"))
g.addEdge(("c","e"))
g.addEdge(("d","f"))
print("Ingrese el vertice padre:")
g.BFS(input())