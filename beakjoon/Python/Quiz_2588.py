A = int(input())
B = int(input())
 
out1 = A*((B%100)%10)
out2 = A*((B%100)//10)
out3 = A*(B//100)
res = A*B
 
print(out1, out2, out3, res, sep='\n')