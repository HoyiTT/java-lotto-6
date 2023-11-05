# 미션 - 로또 

## 💻 기능 목록

로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.

로또 1장의 가격은 1,000원이다.

당첨 번호와 보너스 번호를 입력받는다.

사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.

사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.

Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

## 구현 기능

* Input Class - 로또 번호를 입력 받는다.
* Lotto Class - 게임을 진행한다.
* Output Class - 출력을 나타낸다.

### Input Class

로또 구입할 가격 입력 받는 기능

-> 나누기하고 배열 생성

로또 번호 생성하는 기능
-> 기본 모듈 이용

로또 번호 6개를 입력 받는 기능, 6개 이상 입력시 Exception

보너스 번호 입력 받는 기능

### Lotto CLass

### Output Class

로또 경과 확인 후 출력

