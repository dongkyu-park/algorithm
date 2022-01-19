# 크레인 인형뽑기 게임 (SolutionNew)

![image](https://user-images.githubusercontent.com/81552729/150068088-e23ebfed-19f0-4a89-bfc6-c6b55372d748.png)

1. 크레인의 윗 라인부터 x축으로 값을 읽으며 각 라인이 가진 인형을 Queue에 저장한다.
   
2. moves 배열을 체크하며 뽑는 위치의 index를 가진 Queue의 값을 하나 뽑고 지워준다.
   (Queue가 비어있다면 다시 2. 반복)

3. 바구니는 Stack으로 인형을 담아 준다. 담기 전에 바구니에 담긴 마지막 인형을 체크하여, 동일한 인형이라면 담지 않고
answer 값을 +2 증가시킨 후 pop 해준다.
   
4. moves 배열 체크를 마친다면, answer값을 리턴
