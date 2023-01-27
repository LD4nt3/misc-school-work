
V = 5
G = [[0, 9, 75, 0, 0],
     [9, 0, 95, 19, 42],
     [75, 95, 0, 51, 66],
     [0, 19, 51, 0, 31],
     [0, 42, 66, 31, 0]]
#E = {'12':4,'13':2,'15':3,
#     '24':5,'21':4,'31':2,
#     '34':1,'35':6,'36':3,
#     '43':1,'42':5,'46':6,
#     '51':3,'53':6,'56':2,
#     '63':3,'64':6,'65':2,
#      }      
selected = [0, 0, 0, 0, 0]
no_edge = 0
selected[0] = True

while (no_edge < V - 1):

    minimum = 999
    x = 0
    y = 0
    for i in range(V):
        
        for j in range(V):
            if ((not selected[j]) and G[i][j]):  
                # not in selected and there is an edge
                if minimum > G[i][j]:
                    minimum = G[i][j]
                    x = i
                    y = j
    print(str(x) + "-" + str(y) + ":" + str(G[x][y]))
    selected[y] = True
    no_edge += 1