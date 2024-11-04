package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class LottoView {
    LottoController lottoController;
    private List<Lotto> purchasedLottos = new ArrayList<>();
    public LottoController purchaseAmountInput() {
        while (true) {
            try{
                System.out.println("구입금액을 입력해 주세요.");
                this.lottoController = new LottoController(Console.readLine());
                System.out.println();
                return lottoController;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void printPurchasedLottosInfo() {
        purchasedLottos = lottoController.getPurchasedLottos();
        System.out.println(purchasedLottos.size() + "개를 구매했습니다.");
        for(Lotto lotto : purchasedLottos) {
            System.out.println(lotto.getNumbers());
        }
        System.out.println();
    }

}