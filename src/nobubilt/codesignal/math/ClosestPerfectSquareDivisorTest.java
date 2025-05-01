package nobubilt.codesignal.math;

import java.time.Duration;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ClosestPerfectSquareDivisorTest {
	  private ClosestPerfectSquareDivisor app;

	  @BeforeEach
	  void setUp() {
	    app = new ClosestPerfectSquareDivisor();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(1);
	      List<Integer> expected = Arrays.asList(1);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Collections.nCopies(100, 10000);
	      List<Integer> expected = Collections.nCopies(100, 25);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          7491, 7246, 488, 9634, 729, 6721, 376, 4644, 5514, 5983, 
	          3737, 5585, 7678, 879, 6106, 919, 5946, 7711, 8694, 8253, 
	          4912, 3422, 6842, 3178, 574, 8576, 3318, 9129, 4620, 4182, 
	          5638, 6002, 6039, 6938, 4214, 3915, 401, 9584, 97, 2847, 
	          8338, 3013, 8316, 8081, 7553, 4930, 3522, 222, 8538, 7133, 
	          1637, 1952, 3449, 9204, 2177, 2372, 4074, 9508, 3766, 4471, 
	          5475, 3242, 4053, 2339, 2990, 986, 906, 2655, 4623, 4289, 
	          7178, 2187, 5007, 4298, 2845, 8686, 6832, 2205, 9746, 7334, 
	          9879, 6799, 1625, 6721, 1158, 6314, 1074, 5083, 1888, 1621, 
	          8411, 1333, 5710, 6909, 2525, 3794, 4522, 5396);
	      List<Integer> expected = Arrays.asList(
	          9, 9, 9, 15, 7, 9, 3, 15, 9, 9, 
	          3, 15, 21, 27, 27, 27, 9, 21, 9, 9, 
	          27, 9, 3, 21, 21, 9, 9, 33, 15, 9, 
	          15, 9, 27, 3, 9, 15, 15, 15, 9, 3, 
	          9, 9, 9, 45, 9, 27, 3, 9, 15, 45, 
	          21, 15, 3, 33, 3, 5, 13, 15, 3, 3, 
	          9, 9, 13, 27, 9, 3, 27, 15, 15, 9, 
	          9, 3, 3, 27, 3, 9, 3, 3, 15, 9, 
	          15, 9, 21, 9, 9, 3, 9, 3, 3, 21, 
	          15, 3, 15, 3, 15, 9, 3, 3);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 
	          225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 
	          729, 784, 841, 900, 961, 1024, 1089, 1156, 1225, 1296, 1369, 
	          1444, 1521, 1600, 1681, 1764, 1849, 1936, 2025, 2116, 2209, 
	          2304, 2401, 2500, 2601, 2704, 2809, 2916, 3025, 3136, 3249,
	          3364, 3481, 3600, 3721, 3844, 3969, 4096, 4225, 4356, 4489,
	          4624, 4761, 4900, 5041, 5184, 5329, 5476, 5625, 5776, 5929,
	          6084, 6241, 6400, 6561, 6724, 6889, 7056, 7225, 7396, 7569,
	          7744, 7921, 8100, 8281, 8464, 8649, 8836, 9025, 9216, 9409,
	          9604, 9801, 10000);
	      List<Integer> expected = Arrays.asList(
	          1, 3, 3, 5, 3, 9, 3, 7, 5, 9, 3, 15, 3, 9, 9, 9, 3, 15, 3, 15,
	          9, 9, 3, 21, 5, 9, 7, 15, 3, 27, 3, 11, 9, 9, 9, 25, 3, 9, 9, 21, 
	          3, 27, 3, 15, 15, 9, 3, 27, 5, 15, 9, 15, 3, 21, 9, 21, 9, 9, 3, 
	          45, 3, 9, 15, 13, 9, 27, 3, 15, 9, 27, 3, 35, 3, 9, 15, 15, 9, 
	          27, 3, 27, 9, 9, 3, 45, 9, 9, 9, 21, 3, 45, 9, 15, 9, 9, 9, 33, 
	          3, 15, 15, 25);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(2, 5, 10, 17, 26, 37, 50, 65, 82, 101, 122, 145, 170, 197, 226, 257, 290, 325, 362, 401, 442, 485, 530, 577, 626, 677, 730, 785, 842, 901, 962, 1025, 1090, 1157, 1226, 1297, 1370, 1445, 1522, 1601, 1682, 1765, 1850, 1937, 2026, 2117, 2210, 2305, 2402, 2501, 2602, 2705, 2810, 2917, 3026, 3137, 3250, 3365, 3482, 3601, 3722, 3845, 3970, 4097, 4226, 4357, 4490, 4625, 4762, 4901, 5042, 5185, 5330, 5477, 5626, 5777, 5930, 6085, 6242, 6401, 6562, 6725, 6890, 7057, 7226, 7397, 7570, 7745, 7922, 8101, 8282, 8465, 8650, 8837, 9026, 9217, 9410, 9605, 9802, 10001);
	      List<Integer> expected = Arrays.asList(
	          1, 3, 3, 5, 3, 9, 3, 7, 5, 9, 3, 15, 3, 9, 9, 9, 3, 15, 3, 15, 9, 9, 3, 21, 5, 
	          9, 7, 15, 3, 27, 3, 11, 9, 9, 9, 25, 3, 9, 9, 21, 3, 27, 3, 15, 15, 9, 3, 27, 5, 
	          15, 9, 15, 3, 21, 9, 21, 9, 9, 3, 45, 3, 9, 15, 13, 9, 27, 3, 15, 9, 27, 3, 35, 
	          3, 9, 15, 15, 9, 27, 3, 27, 9, 9, 3, 45, 9, 9, 9, 21, 3, 45, 9, 15, 9, 9, 9, 33, 
	          3, 15, 15, 25);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          6316, 1928, 8524, 5411, 4108, 1961, 5870, 2558, 3904, 9425, 4048, 4389, 9636, 
	          4613, 8502, 2866, 1031, 7164, 3089, 696, 7998, 811, 1122, 1301, 5977, 290, 
	          5906, 7019, 4833, 588, 8219, 5051, 1421, 6006, 5507, 576, 4429, 7784, 3529, 
	          4603, 5018, 9843, 4748, 9721, 1710, 6171, 7121, 1187, 1732, 1452, 8021, 9850, 
	          2026, 3292, 3582, 215, 1347, 2312, 9997, 7495, 1162, 9262, 2560, 279, 2777, 
	          2359, 3470, 6409, 3453, 2992, 3081, 3565, 297, 5514, 2873, 3737, 6744, 3181, 
	          5542, 7392, 4939, 5513, 8015, 1666, 1260, 7049, 623, 860, 3639, 8362, 8799, 
	          3076, 2651, 1699, 4285, 4215, 4263, 4923, 2691, 1762);
	      List<Integer> expected = Arrays.asList(
	          3, 15, 15, 9, 13, 15, 9, 9, 9, 3, 13, 27, 15, 15, 15, 21, 11, 9, 21, 9, 3, 15, 
	          9, 25, 9, 3, 9, 45, 27, 21, 9, 3, 9, 9, 9, 21, 3, 21, 3, 15, 3, 15, 9, 15, 3, 3, 
	          45, 9, 27, 9, 45, 15, 15, 9, 45, 9, 3, 27, 25, 9, 9, 33, 9, 3, 3, 5, 3, 27, 3, 
	          9, 21, 45, 3, 9, 21, 3, 9, 21, 9, 9, 27, 9, 45, 3, 9, 45, 5, 3, 45, 9, 9, 9, 9, 
	          3, 9, 9, 9, 27, 15, 27);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          3686, 8227, 922, 8276, 7175, 8588, 7877, 2217, 8908, 5416, 4926, 9671, 5597, 
	          2947, 8517, 2564, 3919, 3943, 1851, 5348, 6969, 7624, 2337, 1183, 2395, 126, 
	          1005, 8972, 3703, 6169, 7871, 7068, 4841, 9141, 822, 8187, 8965, 3707, 7614, 
	          4344, 5575, 2224, 6544, 7522, 825, 69, 2091, 103, 5022, 1919, 8998, 1180, 
	          6818, 6176, 9205, 9438, 5457, 1359, 6251, 4381, 3425, 9509, 1200, 1249, 9351, 
	          8355, 9985, 4045, 9891, 7327, 8509, 9106, 7831, 5376, 9670);
	      List<Integer> expected = Arrays.asList(
	          3, 9, 27, 9, 9, 9, 3, 3, 9, 9, 27, 15, 15, 21, 15, 9, 15, 15, 3, 3, 3, 9, 27, 9, 5, 
	          3, 11, 9, 3, 3, 3, 45, 27, 33, 3, 45, 9, 3, 9, 27, 15, 3, 9, 9, 3, 7, 9, 9, 3, 15, 9, 
	          9, 3, 3, 33, 3, 9, 3, 3, 27, 3, 15, 9, 9, 3, 9, 25, 13, 15, 9, 15, 9, 21, 3, 15);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          5627, 8226, 1870, 6617, 3168, 385, 1916, 2883, 2666, 9361, 6989, 5003, 8019,
	          3623, 855, 2734, 5477, 2379, 2505, 4159, 8441, 7989);
	      List<Integer> expected = Arrays.asList(
	          15, 9, 3, 9, 21, 15, 15, 21, 15, 3, 45, 3, 45, 45, 3, 15, 9, 5, 15, 13, 15, 3);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          6205, 2907, 914, 6018, 636, 6365, 7689, 7313, 5456, 4956, 415, 7598, 9100,
	          7700, 3581, 6138, 4222, 9146, 484, 1009, 8838, 4364, 3138, 2786, 3097, 3775,
	          7454, 7465, 9125, 2407, 5274, 1919, 7574, 3851, 2062, 5902, 6338, 611, 1536,
	          1482, 102, 9051, 6007, 503, 3061, 4233, 6593, 7599, 1688, 5447, 2203, 2968);
	      List<Integer> expected = Arrays.asList(
	          3, 21, 27, 27, 5, 27, 21, 9, 9, 27, 15, 9, 9, 21, 45, 27, 9, 33, 9, 11, 9, 27, 21,
	          3, 21, 3, 9, 9, 33, 5, 3, 15, 9, 9, 15, 9, 27, 5, 9, 9, 9, 9, 27, 9, 9, 9, 9, 9,
	          3, 9, 3, 21);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(10)
	  void test10() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          9593, 3849, 3559, 6356, 1914, 4582, 3128, 7650, 1208, 1528, 1466, 6248, 2713,
	          6100, 891, 9038, 5523, 4365, 9881, 6496, 9906, 9657, 2074, 9722, 5376, 8534,
	          8596, 7441, 6329, 6069, 8654, 9540, 2461, 1902, 3017, 9964);
	      List<Integer> expected = Arrays.asList(
	          15, 9, 45, 27, 15, 15, 21, 9, 9, 9, 9, 3, 15, 27, 27, 9, 9, 27, 15, 9, 25, 15,
	          9, 15, 3, 15, 9, 9, 27, 27, 9, 15, 15, 15, 9, 25);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(11)
	  void test11() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          3451, 7166, 8789, 4175, 1123, 1343, 1674, 7638, 2839, 7418, 5305, 4755, 5492,
	          6513);
	      List<Integer> expected = Arrays.asList(
	          3, 9, 9, 9, 9, 3, 3, 9, 3, 9, 3, 9, 9, 9);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(12)
	  void test12() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          7146, 7551, 2046, 644, 2223, 9846, 8929, 3858, 5628, 1264, 8746, 3311, 6733,
	          8658, 3056, 577, 9111, 4387, 1552, 2817, 1061, 8784, 8646, 6077, 7400, 7772,
	          1756, 8726, 5956, 16, 7983, 2071, 2499, 3426, 7969, 8441, 1116, 7022, 6019,
	          8803, 1481, 1978, 8185, 365, 3911, 7303, 5575, 9752, 9038, 9561, 9964, 5334,
	          3244, 4658, 3587, 6509, 3406, 3513);
	      List<Integer> expected = Arrays.asList(
	          9, 9, 15, 5, 3, 15, 9, 9, 15, 25, 9, 9, 9, 9, 9, 21, 9, 27, 9, 3, 9, 9, 9, 27,
	          9, 21, 27, 9, 9, 5, 3, 9, 15, 3, 3, 15, 9, 45, 27, 9, 9, 15, 45, 3, 15, 9, 15,
	          15, 9, 15, 25, 3, 9, 15, 45, 9, 9, 3);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(13)
	  void test13() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(9573, 1339, 1593, 1216, 3256);
	      List<Integer> expected = Arrays.asList(15, 3, 21, 9, 9);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(14)
	  void test14() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> input = Arrays.asList(
	          9365, 2081, 1622, 2681, 5489, 6563, 7087, 5040, 7758, 4400, 9838, 7389, 9055,
	          8772, 182, 6708, 4287, 1691, 2105, 5265, 1038, 6434, 5224, 7242, 1103, 48,
	          3135, 4392, 9379, 5140, 6810, 666, 7516, 5788, 3119, 6325, 1284, 978, 3097,
	          6621, 7948, 4347, 9865, 7788, 1512, 5547, 9741, 661, 2359, 1673, 4960, 9810,
	          3244, 5405, 8269, 400, 4412, 9164, 2931, 9323, 397, 2172, 5645, 615, 5607,
	          7630, 2444, 2798, 8179, 7154, 2802, 9467, 8604, 8279, 5224, 8041, 8955, 6170,
	          658, 7280, 5341, 142, 3134, 3369, 6925, 5084, 3949, 2762, 6789, 1405, 451, 
	          2063, 263);
	      List<Integer> expected = Arrays.asList(
	          3, 9, 21, 15, 9, 9, 45, 3, 21, 27, 15, 9, 9, 9, 3, 9, 9, 3, 9, 3, 11, 27, 35,
	          9, 9, 3, 21, 27, 3, 35, 3, 9, 9, 15, 21, 27, 25, 3, 21, 9, 3, 27, 15, 21, 9,
	          9, 15, 9, 5, 3, 27, 15, 9, 9, 9, 15, 27, 33, 21, 3, 15, 3, 15, 5, 15, 9, 5, 3,
	          45, 9, 3, 3, 9, 9, 35, 45, 9, 3, 9, 9, 3, 15, 21, 9, 3, 3, 15, 3, 9, 3, 9, 15,
	          9);
	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }

	  @Test
	  @Order(15)
	  void test15() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> uniqueElements = Arrays.asList(1, 4, 9, 16, 24, 40, 10000);
	      List<Integer> input = new ArrayList<>(100000);
	      Random random = new Random();

	      for (int i = 0; i < 100000; i++) {
	        input.add(uniqueElements.get(random.nextInt(uniqueElements.size())));
	      }

	      Map<Integer, Integer> expectedResultMap = Map.of(
	          1, 1,     // 1 has 1 divisor
	          4, 3,     // 4 has 3 divisors: 1, 2, 4
	          9, 3,     // 9 has 3 divisors: 1, 3, 9
	          16, 5,    // 16 has 5 divisors: 1, 2, 4, 8, 16
	          24, 3,    // 25 has 3 divisors: 1, 5, 25
	          40, 9,    // 36 has 9 divisors: 1, 2, 3, 4, 6, 9, 12, 18, 36
	          10000, 25 // 10000 has 25 divisors
	      );

	      List<Integer> expected = new ArrayList<>(100000);
	      for (int val : input) {
	        expected.add(expectedResultMap.get(val));
	      }

	      List<Integer> actual = app.solution(input);
	      Assertions.assertEquals(expected, actual);
	    });
	  }
}
