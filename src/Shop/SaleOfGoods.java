package Shop;

import Shop.Markup.*;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

/*
public class SaleOfGoods {
    private static final int NAME = 0;
    private static final int COST = 1;
    private static final int CATEGORY = 2;
    private static final int VOLUME = 3;
    private static final int INFORMATION = 4;
    private static final int QUANTITY = 5;
    private static final int QUANTITYOFGOODSSOLD = 1;
    private static final int QUANTITYOFORDEREDGOODS = 2;
    private static final int PROFIT = 3;
    private static final int OUTLAY = 4;

    private Markup markup;
    private Data d = Data.getInstance();
    private Random rand = new Random();
    private Data dr = Data.getInstance();

    public void ChooseGoods(boolean boolPeridMarkup, boolean boolWeekendMarkup) {
        int countOfGoods = rand.nextInt(10);
        int[] arrGoods = new int[countOfGoods + 1];//array of goods
        System.out.println("Count of goods - " + countOfGoods);
        int duplication = 0;

        for (int i = 0; i < countOfGoods; i++) {
            int temp = rand.nextInt(d.datalist.size()) + 0;

            while (parseInt(d.datalist.get(temp).get(QUANTITY)) < 1) {
                temp = rand.nextInt(d.datalist.size()) + 0;
            }
            arrGoods[i] = temp;
        }

        Arrays.sort(arrGoods);// sort for comfortable finding duplication

        for (int i = 0; i < countOfGoods; i++) {
            if (duplication > 1) {
                markup = new MultiMarkup();
            } else if (boolPeridMarkup) {
                markup = new PeriodMarkup();
            } else if (boolWeekendMarkup) {
                markup = new WeekendMarkup();
            } else {
                markup = new StandartMarkup();
            }

            SaleForOneBuyer(arrGoods[i]);

            if (arrGoods[i] == arrGoods[i + 1]) {
                duplication++;
            } else {
                duplication = 0;
            }
        }
    }


    public void SaleForOneBuyer(int randGood) {
        String formattedCost = "";
        float cost = 0f;
        if (markup != null) {
            cost = parseFloat(d.datalist.get(randGood).get(COST)) * markup.GetMarkups();
            formattedCost = String.format("%.2f",cost);
            System.out.print("  Sale Cost - ");
            System.out.print(formattedCost);
        } else {
            System.out.println("error");
        }
        System.out.println(" - " + d.datalist.get(randGood).get(NAME));

        dr.dataReport.get(randGood + 1).set(PROFIT,
                String.valueOf(
                        parseFloat(dr.dataReport.get(randGood + 1).get(PROFIT)) +
                                (cost -
                                        parseFloat(d.datalist.get(randGood).get(COST))
                                )));

        int temp = parseInt(d.datalist.get(randGood).get(QUANTITY));
        temp -= 1;
        d.datalist.get(randGood).set(QUANTITY, String.valueOf(temp));//sale of one good
        dr.dataReport.get(randGood + 1).set(QUANTITYOFGOODSSOLD,
                String.valueOf(
                        parseInt(dr.dataReport.get(randGood + 1).get(QUANTITYOFGOODSSOLD)) + 1));

    }
}*/
