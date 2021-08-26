
array = ['   + -- + - + -   ',
        '   + --- + - +   ',
        '   + -- + - + -   ',
        '   + - + - + - +   '
];

s = [i.strip().replace(' ','').replace('+','1').replace('-','0') for i in array ]
list = list(map(lambda x: chr(int(x,2)), s))
result = ''.join(list);
print(result);