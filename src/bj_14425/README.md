# ArrayList VS HashMap

- ArrayList

: ArrayList.contains() 호출시 해당 값이 list에 있는지 판단하기 위해 내부적으로 indexOf(object) 메서드를 사용한다. 
indexOf(object) 메서드는 array 전체를 반복해서 돌고 각각의 element와 비교를 진행한다.

: O(n) 의 시간이 걸림

- HashMap or HashSet

: HashMap.containsKey(object) 호출시 HashMap구조가 활용된다.

: O(1)의 시간이 걸림