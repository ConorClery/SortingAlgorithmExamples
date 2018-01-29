import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2018
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{


    static double[] a; //= {2377.88, 2910.66, 8458.14, 1522.08, 5855.37, 1934.75, 8106.23, 1735.31, 4849.83, 1518.63};

    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
        double[] a = null;
        SortComparison.quickSort(a);
        assertNull(a);
        SortComparison.mergeSort(a);
        assertNull(a);
        SortComparison.insertionSort(a);
        assertNull(a);
        SortComparison.bubbleSort(a);
        assertNull(a);
        SortComparison.selectionSort(a);
        assertNull(a);
        SortComparison.bubbleSort(a);
        assertNull(a);
        SortComparison.shellSort(a);
        assertNull(a);
    }

    @Test
    public void testNumbers10() {
        double[] preSorted = {1518.63, 1522.08, 1735.31, 1934.75, 2377.88,
                2910.66, 4849.83, 5855.37, 8106.23, 8458.14};

        a = readInFile(a, "numbers10.txt");
        SortComparison.quickSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers10.txt");
        SortComparison.mergeSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers10.txt");
        SortComparison.insertionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers10.txt");
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers10.txt");
        SortComparison.selectionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers10.txt");
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers10.txt");
        SortComparison.shellSort(a);
        assertArrayEquals(preSorted, a,  0);
    }

    @Test
    public void testNumbers100() {
        double[] preSorted = {131.11,141.639,381.004,398.718,401.409,483.631,777.565,782.337,869.318,1018.14,1044.55,
                1051.9,1080.22,1197.52,1209.76,1518.63,1522.08,1584.62,1600.44,1612.96,1735.31,1934.75,1942.31,1961.97,
                2092.05,2121.29,2203.51,2345.15,2377.88,2543.55,2652.57,2724.57,2742.11,2765.55,2910.66,3193.47,3242.55,
                3321.58,3669.57,3769.34,3776.63,3978.32,4211.62,4373.9,4482.08,4500.86,4538.89,4659.33,4672.51,4829.45,
                4849.83,4917.36,4918.37,5015.19,5029.31,5105.3,5347.12,5593.97,5673.94,5710.77,5855.37,5860.52,5991.63,
                6317.98,6386.02,6393.96,6766.97,6869.2,6888.98,7054.32,7080.34,7163.23,7201.84,7202.92,7319.42,7598.96,
                7695.48,7788.8,7984.93,8106.23,8351.59,8386.34,8458.14,8541.65,8557.19,8663.13,8740.03,8931.88,8967.82,
                8997.56,9041.07,9076.23,9100.94,9286.11,9350.69,9363.01,9443.28,9456.25,9466.56,9955.53};


                a = readInFile(a, "numbers100.txt");
        SortComparison.quickSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers100.txt");
        SortComparison.mergeSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers100.txt");
        SortComparison.insertionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers100.txt");
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers100.txt");
        SortComparison.selectionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers100.txt");
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers100.txt");
        SortComparison.shellSort(a);
        assertArrayEquals(preSorted, a,  0);
    }

    @Test
    public void testNumbers1000() {
        double[] preSorted = {18.8016,52.8459,53.3623,55.8285,63.5903,64.1908,65.4204,74.5887,75.3681,90.3642,98.194,
                109.39,131.11,139.715,140.639,141.639,175.735,183.374,184.528,204.256,210.396,212.271,240.753,245.813,
                256.045,265.633,287.602,287.686,304.592,316.973,324.41,332.738,334.582,339.166,344.843,353.22,366.305,
                367.403,381.004,384.823,386.389,392.373,398.718,400.565,401.409,404.269,408.739,413.186,415.765,416.902,
                427.351,431.594,445.171,455.656,465.835,468.174,483.631,491.88,499.83,521.023,544.826,550.814,557.746,
                599.828,604.44,640.223,654.428,655.656,660.65,668.02,691.718,693.941,712.273,736.2,759.002,774.716,
                777.565,777.972,779.01,782.337,786.409,804.18,809.349,820.547,867.869,869.318,880.783,899.034,936.968,
                941.593,960.743,963.681,964.105,968.939,982.959,1018.14,1020.32,1021.13,1036.03,1036.71,1044.55,1046.62,
                1051.9,1058.2,1078.03,1080.22,1125.46,1126.91,1127.94,1140.43,1149.92,1172.17,1197.52,1204.76,1205.32,
                1207.21,1209.76,1227.03,1235.86,1259.25,1264.95,1286.65,1292.45,1304.88,1320.05,1336.95,1338.4,1348.56,
                1357.2,1358.46,1370.21,1384.54,1407.14,1421.01,1428.32,1462.66,1463.05,1478.6,1504.04,1504.8,1504.82,
                1511.2,1518.28,1518.63,1522.08,1534.92,1540.63,1540.68,1549.71,1550.33,1554.66,1563.18,1576.91,1581.92,
                1584.62,1586.07,1600.44,1612.96,1619.3,1620.32,1628.78,1634.19,1651.84,1664.93,1666.65,1676.61,1709.59,
                1732.23,1733.4,1735.31,1764.24,1781.78,1783.86,1789.47,1794.18,1797.24,1806.61,1842.45,1843.84,1855.53,
                1856.82,1859.22,1865.55,1868.84,1899.53,1914.46,1928.15,1934.75,1942.31,1961.97,1971.15,1971.55,1975.76,
                2000.08,2010.31,2018.55,2032.98,2048.6,2052.24,2054.74,2056.9,2073.77,2092.05,2099.77,2114.85,2116.75,
                2119.47,2121.29,2139.7,2140.19,2141.6,2159.83,2166.31,2169.98,2171.05,2174.39,2175.27,2203.51,2213.98,
                2218.07,2228.1,2237.33,2247.5,2254.43,2265.74,2285.24,2295.27,2314.2,2344.66,2345.15,2346.95,2361.18,
                2371.34,2377.71,2377.88,2383.82,2401.59,2417.98,2425.37,2430.46,2432.46,2435.76,2458.15,2461.7,2464.36,
                2468.42,2471.32,2486.44,2488.67,2493.59,2494.5,2508.86,2518.24,2528.15,2543.55,2548.47,2561.96,2585.42,
                2598.66,2652.57,2654.37,2695.44,2702.43,2724.57,2730.41,2732.97,2735.3,2742.11,2744.71,2748.44,2751.64,
                2760.17,2761.14,2764.86,2765.55,2765.64,2767.12,2768.99,2770.88,2805.58,2805.7,2827.24,2827.9,2856.96,
                2871.87,2875.03,2878.76,2879.61,2906.97,2907.62,2910.66,2920.91,2923.07,2935.34,2937.55,2957.48,2964.01,
                2970.72,2993.45,2996.32,2997.85,3002.11,3005.99,3010.12,3015.61,3015.83,3015.98,3031.8,3070.9,3075.31,
                3077.88,3097.86,3100.5,3127.65,3128.41,3132.11,3158.49,3169.46,3177.67,3190.58,3193.47,3200.58,3216.33,
                3220.08,3222.85,3226.54,3237.86,3242.55,3257.82,3260.11,3273.27,3278.71,3297.14,3306.74,3309.76,3319.61,
                3321.58,3321.95,3332.19,3336.88,3354.65,3361.71,3377.37,3382.67,3394.86,3407.14,3429.59,3433.66,3453.12,
                3454.44,3468.48,3477.14,3487.08,3495.92,3524.87,3530.42,3541.68,3544.07,3544.46,3559.41,3619.5,3619.68,
                3624.85,3635.53,3651.52,3659.05,3666.93,3669.57,3672.16,3673.8,3679.31,3686.83,3688.89,3700.25,3704.06,
                3708.87,3718.5,3718.51,3732.31,3736.84,3737.58,3753.49,3763.84,3769.34,3771.49,3776.24,3776.63,3776.94,
                3819.37,3823.73,3833.03,3856.64,3892.3,3893.64,3921.14,3922.18,3933.56,3951.62,3961.95,3978.32,3984.76,
                3993.32,3996.86,4039.89,4042.18,4056.21,4058.45,4072.52,4083.46,4089.55,4111.65,4112.77,4126.43,4131.23,
                4172.68,4177.71,4186.77,4196.6,4211.62,4229.85,4230.51,4231.98,4260.26,4289.16,4322.17,4333.44,4335.07,
                4346.43,4363.7,4370.0,4373.9,4395.12,4411.26,4437.15,4438.19,4441.66,4453.45,4482.08,4489.62,4498.55,
                4499.55,4499.77,4500.86,4529.2,4529.83,4533.89,4538.89,4587.66,4594.26,4607.94,4610.58,4610.75,4615.62,
                4642.73,4655.37,4659.33,4671.56,4672.51,4690.52,4702.15,4720.39,4732.78,4737.11,4763.29,4767.54,4776.2,
                4788.76,4800.23,4813.72,4829.45,4842.89,4844.33,4846.16,4849.83,4853.74,4855.18,4857.25,4863.5,4872.54,
                4873.36,4874.36,4880.21,4880.31,4917.36,4918.37,4929.78,4931.76,4941.48,4944.65,4960.77,4961.79,4963.39,
                4973.44,4994.09,4995.04,5015.19,5029.31,5044.56,5054.64,5054.81,5096.01,5105.3,5113.07,5114.68,5121.66,
                5144.14,5145.09,5149.01,5157.97,5159.66,5167.93,5174.57,5179.41,5181.46,5185.58,5189.81,5204.93,5213.44,
                5227.34,5263.08,5275.13,5291.5,5308.95,5318.28,5332.64,5338.04,5347.12,5349.35,5352.7,5362.29,5370.15,
                5379.74,5394.07,5396.18,5402.66,5426.43,5444.2,5461.86,5462.78,5467.9,5482.36,5490.75,5501.58,5508.25,
                5515.28,5521.14,5522.45,5525.44,5526.41,5528.44,5542.36,5554.95,5587.69,5590.59,5593.97,5611.24,5615.32,
                5618.85,5641.59,5673.94,5683.24,5700.45,5704.59,5706.86,5710.77,5724.47,5725.46,5729.69,5736.04,5738.48
                ,5754.64,5756.77,5769.64,5771.72,5783.59,5789.41,5792.63,5807.7,5807.77,5855.37,5860.52,5886.33,5908.84,
                5922.2,5929.72,5932.38,5941.79,5984.85,5991.63,6000.99,6010.75,6022.68,6039.19,6049.06,6051.25,6057.54,
                6081.99,6088.42,6090.6,6096.26,6108.61,6111.53,6111.7,6119.8,6138.03,6145.15,6146.46,6147.93,6164.37,
                6172.77,6177.29,6187.0,6200.97,6204.67,6207.13,6229.74,6231.48,6243.85,6244.12,6249.52,6253.44,6259.58,
                6264.19,6277.04,6277.08,6278.71,6317.98,6324.27,6343.0,6351.59,6352.73,6358.54,6360.66,6376.95,6386.02,
                6390.15,6393.96,6407.28,6409.77,6421.74,6425.18,6439.38,6445.96,6457.22,6470.1,6494.25,6513.31,6521.37,
                6524.33,6528.46,6584.35,6595.83,6605.68,6606.93,6617.68,6619.19,6620.89,6638.6,6644.23,6735.73,6739.79,
                6746.64,6754.3,6756.82,6766.97,6774.57,6776.29,6779.61,6794.82,6817.9,6823.45,6825.92,6849.45,6856.63,
                6869.2,6869.64,6888.98,6924.04,6924.31,6929.58,6942.88,6946.73,6961.63,6973.88,6976.41,6981.7,6983.62,
                6989.07,6991.55,7008.74,7025.95,7026.5,7033.84,7037.79,7040.11,7048.27,7054.32,7069.3,7072.18,7072.66,
                7080.34,7092.69,7144.32,7163.23,7166.78,7183.96,7186.32,7188.78,7196.17,7196.19,7198.29,7201.84,7202.92,
                7203.03,7220.56,7229.91,7239.0,7242.39,7260.09,7273.91,7278.6,7312.23,7313.33,7319.42,7339.03,7344.63,
                7348.97,7351.23,7360.27,7361.19,7364.4,7376.8,7417.02,7430.16,7473.65,7476.49,7485.89,7487.22,7487.68,
                7503.92,7511.06,7513.14,7539.06,7543.9,7546.69,7553.61,7558.32,7581.01,7581.34,7589.55,7589.94,7598.96,
                7600.46,7600.82,7605.3,7607.49,7612.56,7613.91,7625.23,7662.6,7669.5,7670.13,7674.72,7684.28,7695.48,
                7707.1,7711.67,7718.46,7722.61,7722.87,7760.98,7774.65,7788.8,7796.61,7799.97,7810.77,7821.73,7849.23,
                7863.5,7885.86,7900.24,7917.17,7922.73,7934.4,7939.15,7943.88,7952.1,7972.55,7980.53,7984.93,7988.5,
                7998.5,8000.06,8020.21,8020.69,8020.97,8021.18,8023.25,8037.34,8039.55,8041.35,8042.0,8047.23,8072.57,
                8077.37,8085.31,8085.56,8088.56,8097.39,8101.62,8106.23,8137.64,8146.25,8147.37,8160.15,8171.98,8195.15,
                8220.9,8222.42,8225.44,8230.73,8248.91,8258.49,8294.88,8307.16,8308.31,8320.86,8351.59,8353.01,8363.09,
                8364.66,8369.28,8386.34,8392.02,8418.26,8428.38,8428.86,8435.06,8436.44,8440.57,8443.76,8451.56,8458.14,
                8468.84,8491.8,8499.57,8501.07,8503.08,8504.6,8514.54,8523.56,8526.86,8541.65,8557.19,8572.02,8577.58,
                8588.66,8590.01,8603.75,8604.68,8611.8,8613.2,8651.42,8661.01,8663.13,8671.28,8683.96,8686.5,8691.15,
                8706.33,8709.97,8716.18,8720.45,8720.78,8730.9,8740.03,8743.9,8745.03,8756.77,8769.91,8778.03,8786.32,
                8789.03,8818.64,8843.34,8848.23,8861.02,8931.88,8933.88,8948.33,8948.74,8967.82,8981.97,8983.39,8997.56,
                9001.17,9002.79,9004.1,9015.27,9032.2,9033.83,9041.07,9044.08,9069.48,9072.32,9076.23,9080.39,9082.25,9082.7,
                9089.77,9100.94,9103.0,9113.09,9114.76,9134.9,9147.34,9159.18,9161.04,9187.63,9191.72,9205.06,9209.65,
                9225.33,9237.97,9240.46,9249.33,9258.51,9259.31,9275.47,9277.81,9280.5,9281.08,9281.86,9286.11,9290.55,
                9300.59,9325.2,9338.39,9350.69,9363.01,9363.46,9363.66,9373.14,9416.25,9440.86,9442.28,9443.28,9456.25,
                9457.98,9466.56,9485.52,9490.34,9492.59,9493.54,9506.63,9522.6,9554.72,9565.69,9568.04,9604.91,9618.39,
                9621.29,9629.27,9631.01,9632.03,9633.62,9651.05,9652.68,9653.76,9683.79,9699.93,9702.76,9722.47,9753.46,
                9755.6,9755.8,9755.86,9764.42,9776.09,9781.22,9783.78,9794.03,9843.06,9851.34,9855.18,9858.67,9864.17,
                9873.41,9895.5,9902.34,9903.6,9926.31,9945.75,9949.84,9951.09,9955.53,9958.95,9983.35,9990.52,9995.39};

        a = readInFile(a, "numbers1000.txt");
        SortComparison.quickSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers1000.txt");
        SortComparison.mergeSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers1000.txt");
        SortComparison.insertionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers1000.txt");
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers1000.txt");
        SortComparison.selectionSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers1000.txt");
        SortComparison.bubbleSort(a);
        assertArrayEquals(preSorted, a,  0);

        a = readInFile(a, "numbers1000.txt");
        SortComparison.shellSort(a);
        assertArrayEquals(preSorted, a,  0);
    }








    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
//    public static void main(String[] args)
//    {
//        a = readInFile(a, "numbers1000.txt");
//        for (Double d : a)
//            System.out.print(d + "    ");
//        System.out.println("\n");
//        a = SortComparison.bubbleSort(a);
//        for (Double d : a)
//            System.out.print(d + ",");
//        //TODO: implement this method
//    }

    private static double[] readInFile(double[] a, String fileName) {
        File file = new File("src/" + fileName);
        Scanner doubleScanner;
        ArrayList<Double> doubles = new ArrayList<Double>();
        try {
            doubleScanner = new Scanner(file);
            while (doubleScanner.hasNextDouble()){
                doubles.add(doubleScanner.nextDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        a = new double[doubles.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = (Double) doubles.get(i);
        }
        return a;
    }



}
