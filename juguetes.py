# -- coding: utf -8 --

def Productos(A):
    J = []    
    for x in A:
        if x not in J:
            J.append(x)
    return J

def Faltante(L, M, N):
    E = []
    for i in L:
        if M[i] == N:
            E.append(i)
    return(E)

def TeFaltan(L1, L2):
    LD = []
    for J in L1:
        if J not in L2:
            LD.append(J)
    return(LD)

def Intercambiemos(L1, L2):
    SR_L1 = 0
    SR_L2 = 0
    
    for J in L1:
        if J not in L2:
            SR_L1 += 1
            
    for J in L2:
        if J not in L1:
            SR_L2 += 1
            
    return(min(SR_L1, SR_L2))