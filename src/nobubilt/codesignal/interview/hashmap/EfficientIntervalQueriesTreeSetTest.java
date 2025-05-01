package nobubilt.codesignal.interview.hashmap;
import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EfficientIntervalQueriesTreeSetTest {

    private EfficientIntervalQueriesTreeSet app;

    @BeforeEach
    void setUp() {
        app = new EfficientIntervalQueriesTreeSet();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> intervals = new ArrayList<>(List.of(
                new int[]{1, 3}, new int[]{6, 8}, new int[]{11, 13}, new int[]{16, 18},
                new int[]{21, 23}, new int[]{26, 28}, new int[]{31, 33}, new int[]{36, 38},
                new int[]{41, 43}, new int[]{46, 48}
            ));
            List<int[]> queries = new ArrayList<>(List.of(
                new int[]{1, 1, 3}, new int[]{1, 5, 7}, new int[]{0, 9, 11}, new int[]{1, 13, 15},
                new int[]{0, 17, 19}, new int[]{0, 21, 23}, new int[]{1, 25, 27}, new int[]{1, 29, 31},
                new int[]{0, 33, 35}, new int[]{0, 37, 39}, new int[]{0, 41, 43}, new int[]{0, 45, 47},
                new int[]{1, 49, 51}, new int[]{1, 53, 55}, new int[]{1, 57, 59}, new int[]{0, 61, 63},
                new int[]{1, 65, 67}, new int[]{0, 69, 71}, new int[]{0, 73, 75}, new int[]{0, 77, 79},
                new int[]{1, 81, 83}, new int[]{1, 85, 87}, new int[]{1, 89, 91}, new int[]{0, 93, 95},
                new int[]{0, 97, 99}
            ));
            List<Integer> expected = List.of(
                9, 9, 1, 9, 1, 1, 9, 9, 1, 1, 1, 1,
                9, 9, 9, 0, 9, 0, 0, 0, 9, 9, 9, 0, 0
            );
            Assertions.assertEquals(expected, app.solution(intervals, queries));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(300), () -> {
            List<int[]> intervals = new ArrayList<>(Arrays.asList(
                new int[]{-335009, 180528}, new int[]{-806232, -647723}, new int[]{530749, 897907},
                new int[]{-254183, -148483}, new int[]{-158752, -15608}, new int[]{-365389, -358918},
                new int[]{-258369, 562409}, new int[]{155240, 267830}, new int[]{-855615, -319445},
                new int[]{625199, 925775}, new int[]{-993899, 646498}, new int[]{746501, 808485},
                new int[]{-861249, 930935}, new int[]{-802134, -496641}, new int[]{658412, 970724},
                new int[]{-36931, 656086}, new int[]{578074, 977685}, new int[]{752052, 811085},
                new int[]{-251073, 404084}, new int[]{-953199, -743595}, new int[]{699736, 786195},
                new int[]{-360572, 320307}, new int[]{582141, 884824}, new int[]{28125, 56514},
                new int[]{785175, 896194}, new int[]{471983, 838404}, new int[]{597411, 828716},
                new int[]{-743964, -618104}, new int[]{683005, 735815}, new int[]{-554068, 423116},
                new int[]{311849, 379614}, new int[]{185371, 614843}, new int[]{-506885, 261949},
                new int[]{141063, 920255}, new int[]{879041, 989424}, new int[]{355548, 717245},
                new int[]{-936098, 590951}, new int[]{-49056, 276896}, new int[]{143170, 284647},
                new int[]{-463745, 960506}, new int[]{662910, 759950}, new int[]{556787, 706183},
                new int[]{498634, 707276}, new int[]{670310, 995356}, new int[]{-847139, 256790},
                new int[]{-593762, 317016}, new int[]{-241162, 731256}, new int[]{284164, 845037},
                new int[]{738361, 982835}, new int[]{381910, 667056}, new int[]{300281, 363855},
                new int[]{164872, 506888}, new int[]{116380, 881226}, new int[]{126746, 947028},
                new int[]{806008, 994903}, new int[]{9047, 499081}, new int[]{-753483, -625764},
                new int[]{-60468, 403865}, new int[]{-153374, 63290}, new int[]{-646510, 368297},
                new int[]{21400, 500772}, new int[]{382744, 592083}, new int[]{-592927, 854209},
                new int[]{10050, 891515}, new int[]{-754325, -6327}, new int[]{-336813, 672613},
                new int[]{412570, 690706}, new int[]{-506436, 150255}, new int[]{87273, 701775},
                new int[]{-869900, 715141}, new int[]{405143, 602271}, new int[]{-409290, -131953},
                new int[]{963079, 997611}, new int[]{794936, 816442}, new int[]{-389485, 597742},
                new int[]{-59546, 866445}, new int[]{-507037, 574049}, new int[]{504583, 654423},
                new int[]{-209284, 35638}, new int[]{-528210, 61254}, new int[]{-766069, 838586},
                new int[]{-117590, 926084}, new int[]{397067, 998044}, new int[]{-415242, 305796},
                new int[]{401226, 581411}, new int[]{761945, 936856}, new int[]{591078, 775170},
                new int[]{-488933, 757021}, new int[]{903528, 930200}, new int[]{281746, 703473},
                new int[]{599922, 887508}, new int[]{-663184, -266210}, new int[]{-430498, -254374},
                new int[]{37823, 989386}, new int[]{745765, 791214}, new int[]{273096, 818129},
                new int[]{-322382, 412884}, new int[]{955298, 978237}, new int[]{359187, 388607},
                new int[]{96062, 992081}
            ));
            List<int[]> queries = new ArrayList<>(Arrays.asList(
                new int[]{1, 18122, 269881}, new int[]{1, -798364, -642707}, new int[]{0, -868996, -446981},
                new int[]{0, 983457, 986097}, new int[]{1, 160831, 428796}, new int[]{1, 266671, 525426},
                new int[]{0, -469705, 144775}, new int[]{1, 574377, 576931}, new int[]{1, 761804, 790947},
                new int[]{0, 31235, 771151}, new int[]{1, 548482, 645731}, new int[]{0, -337510, 885132},
                new int[]{0, 947287, 965347}, new int[]{0, 677224, 762740}, new int[]{1, 990179, 998662},
                new int[]{1, -803584, -146511}, new int[]{1, -713239, 329783}, new int[]{1, 556091, 920457},
                new int[]{0, -914794, 940908}, new int[]{1, 404696, 682860}, new int[]{1, 363968, 935694},
                new int[]{1, -13566, 190438}, new int[]{0, -718607, 831905}, new int[]{1, 874117, 900789},
                new int[]{1, 901722, 945565}, new int[]{1, 272568, 443624}, new int[]{1, -221369, 784188},
                new int[]{1, -7455, 90903}, new int[]{0, 149415, 319662}, new int[]{1, -985698, 439905},
                new int[]{0, -176063, 465310}, new int[]{0, 595907, 894107}, new int[]{0, -318763, 975854},
                new int[]{1, -987607, -193380}, new int[]{1, -652088, 151503}, new int[]{0, -93298, -33528},
                new int[]{1, 616007, 830246}, new int[]{0, -845784, 451768}, new int[]{0, 135807, 487406},
                new int[]{1, 650316, 984832}, new int[]{0, -528813, 395608}, new int[]{1, -455900, -344699},
                new int[]{1, -545460, 594859}, new int[]{1, -943249, 410857}, new int[]{1, 45053, 816704},
                new int[]{1, 117478, 882592}, new int[]{0, -53181, 641480}, new int[]{1, -577524, 948844},
                new int[]{1, -247294, 47610}, new int[]{0, -705486, 298960}, new int[]{0, 449575, 484444},
                new int[]{1, -898315, 156802}, new int[]{1, -2354, 837030}, new int[]{1, 747549, 990973},
                new int[]{0, 184827, 434193}, new int[]{0, -676172, 408226}, new int[]{1, -642865, 483306},
                new int[]{1, -130651, 956120}, new int[]{0, -941687, 314571}, new int[]{0, -731988, -440475},
                new int[]{1, 712921, 992625}, new int[]{0, 949757, 963749}, new int[]{0, -428127, 871464},
                new int[]{1, 567657, 805986}, new int[]{1, 880009, 944680}, new int[]{0, 40289, 417463},
                new int[]{0, 698677, 854155}, new int[]{0, 299301, 522908}, new int[]{1, -536920, 71043},
                new int[]{1, -204017, 307424}, new int[]{0, 451248, 696505}, new int[]{1, 250366, 442011},
                new int[]{0, -764130, 853815}, new int[]{0, -985994, -35238}, new int[]{0, 866135, 903332},
                new int[]{0, -126827, 21803}, new int[]{0, 904418, 931048}, new int[]{1, 400541, 544448},
                new int[]{0, 240611, 547613}, new int[]{1, 227265, 289930}, new int[]{0, -111807, 773517},
                new int[]{0, 342716, 521901}, new int[]{1, 355974, 821265}, new int[]{0, -917148, -121955},
                new int[]{0, -423474, 764313}, new int[]{0, -558479, -115224}, new int[]{1, 297297, 332577},
                new int[]{0, -500635, -257857}, new int[]{1, -182187, 290827}, new int[]{1, -662185, 999284},
                new int[]{1, -50166, 502805}, new int[]{0, 474475, 821135}, new int[]{1, -106380, 223849},
                new int[]{1, 870493, 947605}, new int[]{0, -315551, 469972}, new int[]{0, 866075, 886925},
                new int[]{0, 778482, 903480}, new int[]{1, -291522, 440493}, new int[]{0, -897438, 481009},
                new int[]{1, 214899, 913980}
            ));
            List<Integer> expected = List.of(
                100, 100, 1, 1, 100, 100, 1, 100, 100, 1,
                100, 1, 1, 1, 100, 100, 100, 100, 1, 100,
                100, 100, 1, 100, 100, 100, 100, 100, 1, 100,
                1, 1, 1, 100, 100, 1, 100, 1, 1, 100,
                1, 100, 100, 100, 100, 100, 1, 100, 100, 1,
                1, 100, 100, 100, 1, 1, 100, 100, 1, 1,
                100, 1, 1, 100, 100, 1, 1, 1, 100, 100,
                1, 100, 1, 1, 1, 1, 1, 100, 1, 100,
                1, 1, 100, 1, 1, 1, 100, 1, 100, 100,
                100, 1, 100, 100, 1, 1, 1, 100, 1, 100
            );
            Assertions.assertEquals(expected, app.solution(intervals, queries));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(300), () -> {
            List<int[]> intervals = new ArrayList<>(Arrays.asList(
                new int[]{-26367, 21713}, new int[]{78364, 83654}, new int[]{47452, 59227},
                new int[]{-83978, -34722}, new int[]{74215, 79227}, new int[]{1812, 65107},
                new int[]{-31597, 41895}, new int[]{8636, 82430}, new int[]{67919, 95584},
                new int[]{-44569, 37990}, new int[]{79819, 99497}, new int[]{28331, 55617},
                new int[]{-18128, 72897}, new int[]{61814, 78044}, new int[]{2440, 4423},
                new int[]{32765, 61916}, new int[]{42496, 50186}, new int[]{16490, 33361},
                new int[]{-26304, 9388}, new int[]{-62841, -3270}, new int[]{-41330, 76055},
                new int[]{-43214, 68229}, new int[]{-52601, -32695}, new int[]{-26387, 64343},
                new int[]{61192, 86796}, new int[]{-75595, 23210}, new int[]{-3826, 1139},
                new int[]{-7564, 44389}, new int[]{-18247, 89663}, new int[]{28995, 29185},
                new int[]{60554, 96221}, new int[]{-10587, 99261}, new int[]{-87316, 4111},
                new int[]{-40934, 60964}, new int[]{62138, 92657}, new int[]{-14583, 47602},
                new int[]{25061, 90809}, new int[]{74122, 83820}, new int[]{10659, 69965},
                new int[]{90119, 94561}, new int[]{83797, 90504}, new int[]{44430, 76428},
                new int[]{83907, 92696}, new int[]{79148, 97120}, new int[]{-22021, 57582},
                new int[]{-22629, -8797}, new int[]{2774, 48966}, new int[]{-5778, 95115},
                new int[]{24459, 52959}, new int[]{20593, 25164}, new int[]{22240, 90392},
                new int[]{49717, 99051}, new int[]{-89765, 86778}, new int[]{-29899, 11738},
                new int[]{76429, 79453}, new int[]{28674, 61144}, new int[]{-54707, 95606},
                new int[]{-93222, -6289}, new int[]{-39862, 24936}, new int[]{-68719, 40602},
                new int[]{93969, 99437}, new int[]{-12293, -273}, new int[]{-47586, 91070},
                new int[]{63875, 65188}, new int[]{-1244, 1440}, new int[]{69510, 97699},
                new int[]{-82435, -77785}, new int[]{47266, 57577}, new int[]{-5025, 77779},
                new int[]{52664, 67737}, new int[]{-3504, 23360}, new int[]{15136, 58349},
                new int[]{-96109, -3254}, new int[]{-69406, -3392}, new int[]{-44483, 81638},
                new int[]{95414, 99689}, new int[]{13761, 24815}, new int[]{-75733, 82493},
                new int[]{23789, 49062}, new int[]{-31364, -28487}, new int[]{90111, 97485},
                new int[]{84890, 94093}, new int[]{19548, 36761}, new int[]{-2563, 13012},
                new int[]{-28270, 67066}, new int[]{82810, 97972}, new int[]{81659, 90563},
                new int[]{74911, 99170}, new int[]{-79638, 660}, new int[]{-9735, 81792},
                new int[]{-4051, 42956}, new int[]{60991, 86725}, new int[]{9343, 26954},
                new int[]{-63627, 14407}, new int[]{-77607, 58896}, new int[]{3530, 41372},
                new int[]{-53699, 57154}, new int[]{89860, 92305}, new int[]{-86482, 62405},
                new int[]{3950, 26476}
            ));
            List<int[]> queries = new ArrayList<>(Arrays.asList(
                new int[]{1, 24346, 31750}, new int[]{1, 51586, 90208}, new int[]{1, -48559, -16370},
                new int[]{1, -80819, -7158}, new int[]{1, -48430, -38145}, new int[]{0, 48225, 76098},
                new int[]{0, -15195, 61978}, new int[]{0, -29592, 35736}, new int[]{0, 10839, 13638},
                new int[]{1, 4904, 45807}, new int[]{0, -72194, 20682}, new int[]{0, -77519, -2976},
                new int[]{1, 57855, 97508}, new int[]{1, -93765, -6822}, new int[]{0, 38395, 99020},
                new int[]{1, 26485, 89491}, new int[]{0, -52514, -30394}, new int[]{0, -18039, 73437},
                new int[]{1, 54803, 85264}, new int[]{1, -3337, 89381}, new int[]{0, 24593, 58157},
                new int[]{1, -15746, 76754}, new int[]{0, 22027, 97689}, new int[]{0, 87517, 99136},
                new int[]{1, 27323, 74596}, new int[]{1, 79949, 83215}, new int[]{0, -86627, 58518},
                new int[]{1, 36374, 81323}, new int[]{0, -88534, -83587}, new int[]{0, -26601, 32208},
                new int[]{1, -32144, 98254}, new int[]{1, 96142, 99093}, new int[]{1, -69053, -10460},
                new int[]{1, 76378, 94577}, new int[]{1, -71977, 85776}, new int[]{0, 11363, 13735},
                new int[]{0, 62300, 86585}, new int[]{0, -45615, 85151}, new int[]{1, -35946, 1742},
                new int[]{0, -72249, -8921}, new int[]{1, -39201, -27632}, new int[]{0, 2384, 33927},
                new int[]{1, -58081, 41155}, new int[]{0, -84503, -52209}, new int[]{1, -16312, 48507},
                new int[]{1, 32146, 69368}, new int[]{1, 10916, 61151}, new int[]{0, -91572, 33153},
                new int[]{1, -1494, 69796}, new int[]{0, -57810, 42540}, new int[]{1, -82162, 97840},
                new int[]{1, 42021, 90865}, new int[]{1, 53837, 76334}, new int[]{1, 89406, 93724},
                new int[]{0, -79250, -14431}, new int[]{1, -89195, -12095}, new int[]{0, -29859, 61835},
                new int[]{1, 64418, 71446}, new int[]{1, -26329, 82612}, new int[]{1, -17776, -8271},
                new int[]{1, 39839, 40210}, new int[]{1, -37782, 79674}, new int[]{0, -69154, -62532},
                new int[]{1, -98863, -62318}, new int[]{1, 84878, 86019}, new int[]{1, 50205, 60408},
                new int[]{0, -66090, 80832}, new int[]{1, -71627, 77520}, new int[]{0, -58640, -41434},
                new int[]{1, 73576, 88328}, new int[]{0, -40735, 27003}, new int[]{0, 98319, 99392},
                new int[]{1, 2198, 95674}, new int[]{1, -72786, 49384}, new int[]{0, -35446, 33117},
                new int[]{0, 49204, 51766}, new int[]{0, -96886, -58886}, new int[]{0, 83088, 88894},
                new int[]{0, -51510, 50906}, new int[]{0, 50389, 73661}, new int[]{0, 66835, 96865},
                new int[]{0, -50458, -28842}, new int[]{1, -10838, 63994}, new int[]{0, -15068, 40322},
                new int[]{1, -85925, 91575}, new int[]{1, 91001, 96842}, new int[]{0, -40363, -27465},
                new int[]{1, -88369, -62828}, new int[]{1, -42822, -9279}, new int[]{1, -25852, -18653},
                new int[]{1, 64857, 86686}, new int[]{1, 57873, 82545}, new int[]{0, 15229, 33685},
                new int[]{0, -52303, 47221}, new int[]{0, 34600, 37849}, new int[]{1, -5078, 89016},
                new int[]{0, 42398, 76359}, new int[]{0, 42843, 58335}, new int[]{0, 85659, 98780},
                new int[]{0, -39330, 69874}
            ));
            List<Integer> expected = List.of(
                100, 100, 100, 100, 100, 1, 1, 1, 1, 100,
                1, 1, 100, 100, 1, 100, 1, 1, 100, 100,
                1, 100, 1, 1, 100, 100, 1, 100, 1, 1,
                100, 100, 100, 100, 100, 1, 1, 1, 100, 1,
                100, 1, 100, 1, 100, 100, 100, 1, 100, 1,
                100, 100, 100, 100, 1, 100, 1, 100, 100, 100,
                100, 100, 1, 100, 100, 100, 1, 100, 1, 100,
                1, 1, 100, 100, 1, 1, 1, 1, 1, 1,
                1, 1, 100, 1, 100, 100, 1, 100, 100, 100,
                100, 100, 1, 1, 1, 100, 1, 1, 1, 1
            );
            Assertions.assertEquals(expected, app.solution(intervals, queries));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
            int n = 100000;
            int k = 100000;

            List<int[]> intervals = new ArrayList<>(n);
            for (int i = 0; i < n; ++i) {
                intervals.add(new int[]{i * 10, i * 10 + 4});
            }
    
            List<int[]> queries = new ArrayList<>(k);
            List<Integer> expected = new ArrayList<>(k);

            Random random = new Random();

            for (int i = 0; i < k; ++i) {
                int a = random.nextInt(n * 10 - 5);
                int b = a + random.nextInt(6) + 1;

                int lastDigitA = a % 10;
                int lastDigitB = b % 10;
                boolean intersects = !(lastDigitA >= 5 && lastDigitB >= lastDigitA);

                expected.add(intersects ? 1 : 0);
                queries.add(new int[]{0, a, b});
            }
        
            List<Integer> result = app.solution(intervals, queries);
            Assertions.assertEquals(expected, result);
        });
    }
}
