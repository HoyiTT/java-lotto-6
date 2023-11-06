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

        int [][] lottoNumbers = new int [payLottoCount][6];

        for(int i = 0 ; i < payLottoCount ; i++){
            for(int k = 0 ; k < 6; k++){
                while (lottoNumbers[i][k] < 6) {
                    int randomNumber = Randoms.pickNumberInRange(1, 45);
                    if (!(Arrays.asList(lottoNumbers[i]).contains(randomNumber))) {
                        lottoNumbers[i][k] = randomNumber;
                    }
                }
            }
        }

        for(int i = 0 ; i < payLottoCount ; i++){
            System.out.print("[");
            for(int k = 0 ; k < 5; k++){
                System.out.print(lottoNumbers[i][k]);
                System.out.print(", ");
            }
            System.out.print(lottoNumbers[i][5]);
            System.out.print("]");
            System.out.println();
        }

        System.out.println("당첨 번호를 입력해 주세요.");
        String userNumber  = Console.readLine();
        String[] inputArray =userNumber.split(",");
        int[] userNumbers = new int[6];
        for (int i = 0; i < inputArray.length; i++) {
            userNumbers[i] = Integer.parseInt(inputArray[i].trim());
        }

        System.out.println("보너스 번호를 입력해 주세요.");
        String bonusNumberInput  = Console.readLine();
        int bonusNumber = Integer.parseInt(bonusNumberInput);



    }
}
