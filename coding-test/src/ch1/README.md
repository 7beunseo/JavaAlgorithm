* char 입력받는 법
```java
char c = sc.next().charAt(0); // 문자 한개를 읽을 경우
```

* 최솟값 비교
```java
answer[i] = Math.min(answer[i], p); // 기존 값과 p 중 더 작은 값을 넣음
```

* 2진수를 10진수로 변환
```java
int num = Integer.parseInt(sb.toString(), 2);
```

* 정수를 문자로 변환
```java
answer.append((char) num);
```

* 문자열 한번에 replace
```java
s.substring(0, 7).replace('#', '1').replace('*', '0');
```

* 문자열을 문자 배열로 변환
```java
String str = "Hello";
char[] arr = str.toCharArray();
```