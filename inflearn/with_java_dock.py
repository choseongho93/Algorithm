stone_durability = [1, 2, 1, 4]
doc = [{
    "이름" : "루비독",
    "나이" : "95년생",
    "점프력" : "3",
    "몸무게" : "4",
    },{
    "이름" : "피치독",
    "나이" : "95년생",
    "점프력" : "3",
    "몸무게" : "3",
    },{
    "이름" : "씨-독",
    "나이" : "72년생",
    "점프력" : "2",
    "몸무게" : "1",
    },{
    "이름" : "코볼독",
    "나이" : "59년생",
    "점프력" : "1",
    "몸무게" : "1",
    },
];

def solution(stone_durability, doc):
	answer = [i['이름'] for i in doc]
	for i in doc:
		location = 0
		while location < len(stone_durability)-1:
			location += int(i['점프력'])
			stone_durability[location-1] -= int(i['몸무게'])
			if stone_durability[location-1] < 0:
                # del answer[answer.index(i['이름'])];
				answer[answer.index(i['이름'])] = 'fail'
				break;

    # return answer;
	return [i for i in answer if i !='fail']

print(solution(stone_durability, doc))