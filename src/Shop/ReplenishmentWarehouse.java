package Shop;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


/*public class ReplenishmentWarehouse {
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

    private Data d = Data.getInstance();
    private Data dr = Data.getInstance();

    public void ReplenishmentWarehouse() {
        System.out.println("---Replenishment Warehouse---");
        for (int i = 0; i < d.datalist.size(); i++) {

            int temp = parseInt(d.datalist.get(i).get(QUANTITY));
            if (temp < 10) {
                temp += 150;
                d.datalist.get(i).set(QUANTITY, String.valueOf(temp));
                dr.dataReport.get(i + 1).set(QUANTITYOFORDEREDGOODS,
                        String.valueOf(
                                parseInt(dr.dataReport.get(i + 1).get(QUANTITYOFORDEREDGOODS)) + 150));

                dr.dataReport.get(i + 1).set(OUTLAY,
                        String.valueOf(
                                parseFloat(dr.dataReport.get(i + 1).get(OUTLAY))
                                        + parseFloat(d.datalist.get(i).get(COST)) * 150));
                System.out.println("Replenishment(+150) - " + d.datalist.get(i).get(NAME));
            }
        }
    }
}
*/

