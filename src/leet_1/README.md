# 1. Two Sum

- 숫자가 담긴 배열 nums와 숫자 target이 주어지고, 배열에서 숫자 2개를 뽑아 target 숫자를 만들 수 있는 인덱스 번호 2개를 리턴한다.

완전탐색을 적용하면 O(n^2)의 시간이 걸리는데, 
nums의 최대 길이가 10^4 이므로 10^8의 연산이 필요하다.

빅 오 표기법으로 계산했을 때, 값이 1억 정도면 해당 알고리즘을 연산하는데 1초가 걸린다고 한다.

10^8이 1억 이므로, 완전탐색으로 풀이가 가능한 문제이다.
추후에 시간복잡도를 O(n^2)이 아닌 방법으로 푸는 방법을 고민해보자.

---

N = nums의 길이 일때,

주어진 배열 nums를 최소힙, 최대힙에 각각 넣으면 (logN)!, (logN)!  
우선 최소힙에서 값을 1개 뽑고 + 최대힙에서 값을 1개 뽑아 더하여 target값이 넘어간다면, 다음 최대힙을 뽑아 더하고.. 반복하다가

target값 미만으로 떨어진다면, 최소힙에서 다음 값을 1개 뽑고.. 다시 처음 최대힙에서 값을 1개 뽑고.. 반복한다면?

logN * logN * logN ... = N logN.
총 시간 복잡도는 2(logN)! + N logN 이 되지 않을까?

---

## Solution2 (풀이 검색)

```java
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])) return new int[]{hashMap.get(nums[i]),i};
            
            hashMap.put(target-nums[i], i);
        }
        return null;
    }
}
```

leetcode 사이트에서 수행시간이 제일 짧은 코드를 보았다.

a + b = target 이라 정의할 때,  
Map 자료형에 target - a 를 해서, a가 정답일 경우의 b값을 Key값으로 저장하고,  
Value값으로는 nums 배열을 순회하면서 혹시나 b값이 나올 경우 참조를 위한 a값의 index를 저장한다.

이러면 Map에 a값이 처음 들어왔을 때 페어가 돼야 하는 b값이 Key값으로, a의 index가 Value값으로 저장되어 있기 때문에,
다음 순회를 돌며 Map이 다음 순회 값을 Key값으로 가지고 있다면,  
저장해 두었던 a의 index값과, 현재 순회중인 index값으로 배열을 선언하여 리턴하면 되는 것이다.

containsKey의 시간복잡도가 O(1) 이므로 해당 알고리즘은 O(N)의 시간복잡도를 가지고 있다.

---

### 정확하지 않은 정보 (재확인 및 수정 필요)

자바의 Set, Map 자료구조는 기본적으로 contains 혹은 containsKey로 검색할 때 해쉬코드를 기반으로 검색한다고 한다.  
기본적으로 HashSet의 경우, Hash를 사용하기 위해 내부적으로 HashMap 인스턴스를 이용하여 요소를 저장한다고 한다.
HashMap put의 작동 방식은 파라미터 Object의 hashCode를 가져와서 중복이면 그걸 대체하고 중복이 아니면 넣는 구조라고 한다.

HashMap의 containsKey의 경우, 파라미터로 들어온 객체의 매핑을 보관하고 있는 경우 true를 리턴한다.
hashCode를 기반으로 search 하기 때문에 일치하는 hashCode만을 찾으면 되기에 시간복잡도는 O(1)이 나오고,  
containsValue의 경우는 값이 정확히 일치 하는지 일일히 확인해야 하기 때문에 O(n)이 나온다. (이 부분은 아직 정확히 모르겠음)
