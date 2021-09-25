## @1 - 문제의 핵심 변수를 선언한다.

() 일 경우는 *2

[] 일 경우는 *3

연산을 진행할 mul 변수 선언

최종 합산 결과를  출력할 reseult 변수 선언

## @2 - 괄호를 push 하고 pop 할 Character 형 stack 선언

## @3 - 문자열을 순서대로 가져와 switch~case 문으로 비교한다.

## @4 - '(' 일 경우

stack 에 '(' 를 삽입한다.

() 괄호에 해당하므로 mul *= 2 이다.

## @5 - '[' 일 경우

stack 에 '['를 삽입한다.

[] 괄호에 해당하므로 mul *= 3 이다.

## @6 ')' 일 경우

stack 에는 반드시 여는 괄호가 있어야 한다.

그러므로 stack 이 비어있거나 여는 괄호가 없다면 오류이므로 result = 0 이다.

')' 괄호는 stack에 넣은 자신의 짝 괄호를 stack 에서 pop 한다는 개념으로 이해해야 한다.

여기서 중요한 것은 자신의 짝 괄호가 바로 직전 인덱스에 있다면 result += mul 을 한다.(이유는 아래 예를 들며 설명)

(mul /= 2) 괄호를 닫았으므로 다시 2를 나눈다.

## @7 ']' 일 경우는 @6 에서 3으로 나눈 것만 차이가 있다.

## @8 모든 짝 괄호를 찾아서 pop을 시켰다면 stack은 비어있을 것이다.

그러므로 stack이 비어있다면 원하는 결과값인 result 를 출력하면 되고

stack이 비어있지 않다면 괄호의 모든 짝이 맞지 않은 것이므로 오류이다. 고로 0을 출력한다.

### 풀이 출처 : https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=yongyos&logNo=221454435252