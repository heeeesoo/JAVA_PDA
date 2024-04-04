### [0404 mini hw](https://github.com/heeeesoo/JAVA_PDA/blob/main/src/day0404/MiniHW.java)

##### 클래스
1. Person
2. SmartPhoneType
3. SamsungPhone
4. ApplePhone

##### 상속 관계
부모 : SmartPhoneType
<br/>
자식 : SmartPhoneType, ApplePhone

##### 메소드
1. Person :<br/>
   2. talk : 말하기<br/>
   3. getName : name 반환<br/>
   
2. SmartPhoneType :<br/>
   3. turnOn : 핸드폰 켜기<br/>
   4. ring : 폰 울리는 소리 출력<br/>
5. SamsungPhone, ApplePhone:<br/>
   6. ring : 폰 울리는 소리 오버라이딩<br/>

##### 출력 결과
```
가나다 : 야 나 내 핸드폰 켜볼게
가나다폰 : 삐비빅
라마바 : 나도 핸드폰 켜볼게
라마바폰 : bbeep
```