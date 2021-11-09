
# 풀이

### 1. 2진수 -> 8진수 변환하기

2진수를 8진수로 변환할 때는 세 자리씩 나누어 8진수로 변환하면 쉽게 변환할 수 있다.
이진수 11101010를 8진수로 변환할 때 세 자리씩 나누어 생각하면
11, 101, 010 로 세 자리씩 나누어서 11=>3, 101=>5, 010=>2 로 계산할 수 있다.

### 2. 8진수 -> 2진수 변환하기

8진수를 2진수로 표현할 때는 8진수 하나를 이진수 세 자리로 나타내어 표현할 수 있음을 이용한다.

예를 들어,
314 의 8진수 숫자가 주어진다면,

이는 

- 3의 2진수 011 이지만, 맨 앞의 수 이므로 앞에 붙는 0을 지워줘야 한다.
- 1의 2진수 1 이지만, 3자리가 안될 경우 앞을 0으로 채워줘야 한다.
- 4의 2진수 100

따라서 11 001 100 이 된다. 
이를 코드로 옮기면 된다.
