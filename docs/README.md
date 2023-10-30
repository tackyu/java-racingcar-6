## 기능 목록
- [x] 입력 받은 자동차 이름들을 검증 한다. - Validator#names
  - [x] 개별 이름 5자 이하(앞뒤 공백 제외) - Validator#size
  - [x] 중복된 이름 금지 - Validator#duplicate
  - [x] 공백 이름 금지 - Validator#blank
    - "," 금지
- [ ] 입력 받은 시도 횟수를 검증 한다. - Validator#trial
  - [ ] 양의 정수 형태 이외 금지(앞뒤 공백 제외) -Validator#positive
    - 맨 앞 0도 금지 ex) 012
- - -

- [ ] 이름 클래스 - Names 
  - [ ] 자동차모음 으로 변환 - Names#toCars
- [ ] 시도 횟수 클래스 - Trial 
- [ ] 입력 데이터를 받아 놓는 클래스 - Setting
  - [ ] 자동차모음 으로 변환 - Setting#toCars

- [ ] 자동차 클래스 - Car
  - [ ] 이동 횟수 증가 - Car#race
  - [ ] 경주 결과 만들기 - Car#toString
- [ ] 자동차모음 클래스 - Cars
  - [ ] 자동차 추가 - Cars#add
  - [ ] 가장 좋은 성적 찾기 - Cars#maxMovement
  - [ ] 우승자 찾기 - Cars#findWinner
- [ ] 무작위 수를 뽑아 자동차 경주를 진행 - Game#racing
- [ ] 우승자 찾기 - Game#findWinner
- - -
- [ ] 경주 결과 출력 - Printer#result
- [ ] 우승자 출력 - Printer#winner
- [ ] 기타 게임 안내 문구 출력


  
