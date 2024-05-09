# SPProject18182037
쿠키 대전쟁

## 🎮 게임 컨셉

### High Concept
쿠키 대전쟁은 디펜스 게임인 냥코대전쟁의 게임방식을 쿠키런 캐릭터들로 구성해보면 좋을 것 같아 제작하는 게임입니다.
Player는 자신의 쿠키를 이용해서 적 쿠키들을 막고, 상대 건물을 부시는 것이 목표입니다.

### 핵심 메카닉
- 자원 관리: 자원(젤리)은 시간마다 얻게 되며, 자원으로 그 얻는 속도를 증가시킬 수 있습니다.
- 엔트리 : Player 쿠키 중 5종류만 엔트리로 설정하여 플레이 할 수 있습니다. 엔트리는 Stage Clear 시 다음 Stage 시작 전에 재배치 할 수 있습니다.
- 특수 기술: Player의 특수 기술이 일정 시간마다 활성화 되는데 사용 시 적에게 광역피해를 줄 수 있습니다.



## 개발 범위
- 총 3Stage
- Player 쿠키 10종
- 적 쿠키 10종(Stage당 3종, 3종, 4종 출현 예정)
- StartMap, 쿠키 엔트리 설정 Map(Ready Map), InGameMap등 button 약 10개
- Timer

## 예상 게임 실행 흐름

### StartMap - Ready Map - InGameMap으로 진행
![GameFlow](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/f4c456f0-ba8f-4900-ac15-c4d09992b372)



### StartMap
![StartGame](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/f9155809-5b4f-464d-a6e0-4615c70fad75)


### ReadyMap
![ReadyMap](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/dccf9ab6-16f5-411c-b81f-ad8c9477ff0e)


### InGameMap
![InGameMap](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/d2594689-a0a8-409c-bd0a-0e60727d4e38)




## 게임 관련 정보

### 팀 쿠키 

단일딜 6개

용감한 쿠키
체력 100   공격력 25 생산쿨 2.5s 가격 50 이속 5

보더맛 쿠키
체력 350 공격력 100 생산쿨 10s 가격 500 이속 10

팬케이크 쿠키 
체력 250 공격력 50 생산쿨 5s 가격 200 이속 7

껌볼맛 쿠키
체력 350 공격력 120 생산쿨 12s 가격 800 이속 5

홍고추맛 쿠키
체력 1000 공격력 150 생산쿨 60s 가격 1200 이속 7

홍길동맛 쿠키
체력 3000 공격력 350 생산쿨 120s 가격 3000 이속 10


범위딜 4개

근육맛 쿠키
체력 1000 공격력 25 생산쿨 5s 가격 150 이속 5

체리쿠키
체력 300 공격력 150 생산쿨 20s 가격 2000 이속 7

다크초코 쿠키
체력 1100 공격력 100 생산쿨 80s 가격 2200 이속 8

문라잇 쿠키
체력 1500 공격력 222 생산쿨 120s 가격 4200 이속 10


### 1Stage 마녀오븐
![land0001_tm002_bg2](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/71f4eaff-cac9-4491-9d33-d2d4fef4187b)

#### 적 쿠키
마녀 명랑한 쿠키
체력 99 공격력 20 처치가격 10 이속 5

호박 보더맛 쿠키
체력 300 공격력 100 처치가격 100 이속 10

좀비맛 쿠키
체력 6666 공격력 250 처치가격 2500 이속 3

### 2Stage 성
![land0007_tm002_bg1](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/7208c0cc-f2fb-4298-8340-4e51d7bbed44)

#### 적 쿠키
용사맛 쿠키
체력 555 공격력 125 처치가격 150 이속 8

용사맛 쿠키 아이스
체력 1500 공격력 250 처치가격 1000 이속 12

용사맛 쿠키 로즈 - 범위
체력 6250 공격력 340 처치가격 5000 이속 10

### 3Stage 해적
![ovenbreak1001_tm001_bg1](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/db038574-5f5a-4e53-a0db-12705278677a)

#### 적 쿠키

애플맛 쿠키
체력 222 공격력 22 처치가격 2 이속 15

소다맛 쿠키
체력 1200 공격력 250 처치가격 500 이속 10

페퍼민트맛 쿠키
체력 2500 공격력 333 처치가격 1500 이속 8

해적맛 쿠키 범위 (범위 딜)
체력 9999 공격력 999 처치가격 9999 이속 8


## 🛠 개발 일정
- 1주차(24.4.5 ~ 4.7)  : 리소스 수집
- 2주차(24.4.8 ~ 4.14) : StartMap, ReadyMap 제작
- 3주차(24.4.15 ~ 4.21): Player 쿠키 제작
- 4주차(24.4.21 ~ 4.28): 쿠키 생성로직 구현
- 5주차(24.4.29 ~ 5.5) : 적 쿠키 제작
- 6주차(24.5.6 ~ 5.12) : Stage1 제작, Player 쿠키와 적 쿠키 상호작용 구현
- 7주차(24.5.13 ~ 5.19): Stage2 제작
- 8주차(24.5.20 ~ 5.26): Stage3 제작
- 9주차(24.5.27 ~ 6.2) : 버그 수정




## 🎮 5/10 까지의 진행상황

- 1주차 : 리소스 수집(90%)
- 2주차 : StartMap, ReadyMap 제작(90%)
- 3주차 : Player 쿠키 제작(80%)
- 4주차 : 쿠키 생성로직 구현(10%)
- 5주차 : 적 쿠키 제작 (80%)


## 주별 커밋 
![gitcheck](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/beebd5f2-ad2d-4ebb-aca2-9ceb63253753)

|주차|커밋|
|------|---|
|1주차|16번|
|2주차|0번|
|3주차|4번|
|4주차|0번|
|5주차|9번|

## GameObject
|CLASS|동작|상호작용 정보|핵심|
|------|---|-----|----|
|![cookie0001_chest01](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/801bdaf7-3713-4e36-bc4d-75f78ad4fe03)|10종 캐릭터 클래스, 이동, 공격, 사망 | 오른쪽으로 이동하여 적 발견 시 공격| 이름 그대로 캐릭터 클래스, 행동에 따라 이동/공격/사망 state 변환|
|![cookie0016_chest01](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/d28f0417-d18c-417c-9243-e2ed9a7bbdb1)|10종 적 클래스, 이동, 공격, 사망| 왼쪽으로 이동하여 적 발견 시 공격|적 클래스, 이동/공격/사망 state 변환|
| ![castle](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/760d0831-9fea-4f03-9e63-c121b614cbed)|지켜야 하는 성 |아군이나 적에게 데미지를 받음|체력이 0이 될 시 GameClear 또는 GameOver|
|![list](https://github.com/Star-Wraith/SPProject18182037/assets/112797166/51286cd3-5213-4737-8652-26aa2a5b10be)|캐릭터 list|버튼|캐릭터 생성하는 버튼 역할|



### 수업에서 다루었으면 하는 것
- 캐릭터가 공격 시 범위데미지를 주는 캐릭터와 단일데미지를 주는 캐릭터는 충돌체크를 어떻게 하는지

