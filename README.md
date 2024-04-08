### [0408 유저](https://github.com/heeeesoo/JAVA_PDA/blob/main/src/day0408/MiniProj.java)

#### 구현 과제
1. 회원가입
2. 로그인
3. 회원정보 수정
4. 탈퇴

#### 클래스
1. User <br/>
   a. 필드 : name, email, password <br/>
   b. 메소드 : 
      - boolean equals(Object o) : 같으면 true, 다르면 false
      - String toString() : User 객체 값 출력
   <br/>
2. UserRepository <br/>
   a. 필드 -number : map에 넣을 key 값
     <br/>
   b. 메소드 : <br/>
     - void setUserLogin(User user) : user login true로 바꾸기
     - void getAllUser() : user 정보 다 출력하기
     - void postUser(User user) : userRepository에 user 추가하기
     - void getUser(User user) : 해당 user 있으면 true 출력, 없으면 false 출력
     - void deleteUser(User user) : 해당 user userRepository에 삭제
     - void putUser(User user, String name, String email, String password) : 해당 user의 email, password 수정
     - boolean isLogin(User user) : 해당 user 로그인했으면 true 반환, 아니면 false 반환


![img.png](img.png)

---

### [0404 mini hw](https://github.com/heeeesoo/JAVA_PDA/blob/main/src/day0404/MiniHW.java)

#### 클래스
1. Person
2. SmartPhoneType
3. SamsungPhone
4. ApplePhone

#### 상속 관계
부모 : SmartPhoneType
<br/>
자식 : SmartPhoneType, ApplePhone

#### 메소드
1. Person :<br/>
   - talk : 말하기<br/>
   - getName : name 반환<br/>
   
2. SmartPhoneType :<br/>
   - turnOn : 핸드폰 켜기<br/>
   - ring : 폰 울리는 소리 출력<br/>

5. SamsungPhone, ApplePhone:<br/>
   - ring : 폰 울리는 소리 오버라이딩<br/>

#### 출력 결과
```
가나다 : 야 나 내 핸드폰 켜볼게
가나다폰 : 삐비빅
라마바 : 나도 핸드폰 켜볼게
라마바폰 : bbeep
```