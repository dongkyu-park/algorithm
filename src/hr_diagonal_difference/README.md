# Diagonal Difference

전달받은 2차원 배열에서 

[0][0] 시작은 열의 길이와 행의 길이를 +1씩 더해가며 해당 좌표의 값을 더하며 마지막 열까지 진행

[0][last column] 시작은 열의 길이를 +1씩, 행의 길이를 -1씩 해가며 해당 좌표의 값을 더하며 마지막 열까지 진행

각각 2개의 sum 값을 변수에 저장하고 두 수의 차의 절댓값을 구한다.