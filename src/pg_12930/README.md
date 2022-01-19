# 이상한 문자 만들기

문자열 s를 split하여 배열에 저장하고,

배열의 길이만큼 순회하며 저장된 문자열을 가져오고,
저장된 문자열의 길이만큼 순회하며 문자열의 index가 짝수라면 Upper, 홀수라면 Lower를 적용하여 answer 문자열에 저장한다.

---

오답인 케이스가 나왔는데, 이는 문자열의 후행에 공백("") 비어있는 string에 존재하는 경우 였다.
- ex) "hello java world " 
  - -> 정답 : "HeLlO JaVa WoRlD "
  - -> 오답 : "HeLlO JaVa WoRlD"
    
자바의 split()메서드는 1번째 인자값으로 regex, 2번째 인자값으로 limit를 지정할 수 있는데, 

- limit값을 생략하거나 0을 입력하면 후행 문자열이 빈 문자열일 경우 배열에 들어가지 않는다.
- limit값에 양수가 들어올 경우, 문자열을 앞에서부터 읽어가며 regex를 기준으로 분리하지만, 배열의 크기가 limit의 갯수를 넘지는 못하고 마지막 배열은 자르지 못한 문자열 전체가 들어온다.
- limit값에 음수가 들어올 경우, 문자열에 후행되는 빈 문자열 값도 포함되어 배열에 들어가게 된다.

![image](https://user-images.githubusercontent.com/81552729/150077976-c1ae71cc-4949-4d71-ab6f-61e292734fcb.png)

![image](https://user-images.githubusercontent.com/81552729/150078071-47d32bda-a614-41d8-ba67-488f561917c1.png)

