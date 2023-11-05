package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {


        System.out.println("구입 금액을 입력해주세요.");

        String pay  = Console.readLine();
        int money = Integer.parseInt(pay);

        int payLottoCount = money / 1000;

        int [][] lotooNumbers = new int [payLottoCount][6];

        for(int i = 0 ; i < payLottoCount ; i++){
            for(int k = 0 ; k < 6; k++){
                while (lotooNumbers[i][k] < 6) {
                    int randomNumber = Randoms.pickNumberInRange(1, 45);
                    if (!(Arrays.asList(lotooNumbers[i]).contains(randomNumber))) {
                        lotooNumbers[i][k] = randomNumber;
                    }
                }
            }
        }

        for(int i = 0 ; i < payLottoCount ; i++){
            System.out.print("[");
            for(int k = 0 ; k < 5; k++){
                System.out.print(lotooNumbers[i][k]);
                System.out.print(", ");
            }
            System.out.print(lotooNumbers[i][5]);
            System.out.print("]");
            System.out.println();
        }
    }
}
