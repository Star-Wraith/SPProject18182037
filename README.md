# SPProject18182037
쿠키 대전쟁

## 🎮 게임 컨셉

High Concept
쿠키 대전쟁은 디펜스 게임인 냥코대전쟁의 게임방식을 쿠키런 캐릭터들로 구성해보면 좋을 것 같아 제작하는 게임입니다.
Player는 자신의 쿠키를 이용해서 적 쿠키들을 막고, 상대 건물을 부시는 것이 목표입니다.

핵심 메카닉
- 자원 관리: 자원(젤리)은 시간마다 얻게 되며, 자원으로 그 얻는 속도를 증가시킬 수 있습니다.
- 엔트리 : Player 쿠키 중 5종류만 엔트리로 설정하여 플레이 할 수 있습니다. 엔트리는 Stage Clear 시 다음 Stage 시작 전에 재배치 할 수 있습니다.
- 특수 기술: Player의 특수 기술이 시간마다 활성화 되는데 사용 시 적에게 광역피해를 줄 수 있습니다.



## 개발 범위
- 총 3Stage
- Player 쿠키 10종
- 적 쿠키 20종(Stage당 6종, 7종, 7종 출현 예정)
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





## 🛠 개발 일정
- 1주차(24.4.5 ~ 4.7)  : 리소스 수집
- 2주차(24.4.8 ~ 4.14) : 리소스 가공 및 StartMap, ReadyMap 제작
- 3주차(24.4.15 ~ 4.21): GameFrameWork1
- 4주차(24.4.21 ~ 4.28): GameFramwWork2, Player 쿠키 2~3종 제작
- 5주차(24.4.29 ~ 5.5) : 적 쿠키 4~5종 제작
- 6주차(24.5.6 ~ 5.12) : Stage1 제작, Player 쿠키와 적 쿠키 상호작용
- 7주차(24.5.13 ~ 5.19): Stage2 제작
- 8주차(24.5.20 ~ 5.26): Stage3 제작
- 9주차(24.5.27 ~ 6.2) : 버그 수정
