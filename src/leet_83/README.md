# 83. Remove Duplicates from Sorted List

정렬 된 링크드 리스트의 시작값이 head로 주어진다.
각각의 요소가 한 번씩만 나타날 수 있도록 중복을 제거하는 문제.
리턴되는 링크드 리스트 또한 정렬된 상태여야 한다.

이미 정렬 된 링크드 리스트가 주어지므로 

---

current노드를 head로 설정하고, 

current노드의 next노드를 탐색해서, next노드의 val값이 current노드의 val값과 일치 한다면,
next노드의 next노드를 current노드의 next노드로 연결 시킨다.

이 작업을 반복하다가 next노드의 val값이 다르다면, current노드의 값을 next노드로 변경.

![image](https://user-images.githubusercontent.com/81552729/149077023-c74f02d6-2aad-47ac-8a11-9f4360102598.png)

---

위의 작업을 next노드값이 null이 나올 때 까지 반복한다.

---

구현 중 오답

- 문제 조건에서 파라미터로 주어지는 nodeList의 node 갯수의 범위가 0에서 300까지 였으므로, 0일 때는 들어온 head를 그대로 반환하는 처리를 해주어야 한다.


- NPE로 삽질을 많이 했는데 currentNode가 null이 아니면 무조건 돌아가야 한다고 잘못된 생각을 하고 있는 상태로
  반복문 안에서 조건문에서 val = val 체크를 할 때, next노드 값이 null인 경우에서 val을 호출하여 null.val 이 되어 NPE가 발생하는 오류 였다.
  