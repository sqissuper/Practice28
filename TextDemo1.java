import java.util.*;

public class TextDemo1 {

    //牛客网手套
//    public static int findMinimum(int n, int[] left, int[] right) {
//        int sum = 0;
//        int leftSum = 0,rightSum = 0;
//        int leftMin = Integer.MAX_VALUE;
//        int rightMin = Integer.MAX_VALUE;
//        for(int i = 0; i < n; i++) {
//            if(left[i] * right[i] == 0) {
//                sum += (left[i] + right[i]);
//            } else {
//                leftSum += left[i];
//                rightSum += right[i];
//                leftMin = Math.min(left[i],leftMin);
//                rightMin = Math.min(right[i],rightMin);
//            }
//        }
//        return sum + Math.min(leftSum - leftMin + 1,rightSum - rightMin + 1) + 1;
//    }
//    public static int[] ordYear = {31,28,31,30,31,30,31,31,30,31,30,31};
//    public static int iConverDateToDay(int year,int month,int day) {
//        int outDay = -1;
//        if(year < 0 || month <= 0 || month > 12 || day < 0 || day > ordYear[month - 1]) return -1;
//        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            ordYear[1] = 29;
//        }
//        for(int i = 0; i < month - 1; i++) {
//            outDay += ordYear[i];
//        }
//        outDay += day + 1;
//        return outDay;
//    }
//    public static List<String> paraAna(String s) {
//        int n = s.length();
//        List<String> list = new ArrayList<>();
//        boolean f = false;
//        int l = 0, r = 0;
//        for(int i = 0; i < n; i++) {
//            if(s.charAt(i) == '\"' && !f) {
//                f = true;
//                l = i + 1;
//                continue;
//            }
//            if(s.charAt(i) == '\"' && f) {
//                f = false;
//                r = i;
//                if((r + 1)== n - 1) {
//                    list.add(s.substring(l,r));
//                    break;
//                }
//                list.add(s.substring(l,r));
//                if(r < n - 2) {
//                    l = i + 2;
//                    r = i + 2;
//                    i = i + 1;
//                }
//                continue;
//            }
//            if(s.charAt(i) == ' ' && !f) {
//                r = i;
//                list.add(s.substring(l,r));
//                if(r < n - 1) {
//                    l = i + 1;
//                    r = i + 1;
//                }
//            }
//        }
//        return list;
//    }

    //分发饼干
//    public static int findContentChildren(int[] g, int[] s) {
//        int child = 0,cookie = 0;
//        Arrays.sort(g);
//        Arrays.sort(s);
//        while(child < g.length && cookie < s.length) {
//            if(g[child] <= s[cookie]) {
//                child++;
//            }
//            cookie++;
//        }
//        return child;
//    }

    //完全数计算
//    public static int count(int n) {
//        int count = 0;
//        for(int i = 1; i < n; i++) {
//            int sum = 0;
//            for(int j = 1; j < i; j++) {
//                if(i % j == 0) {
//                    sum += j;
//                }
//            }
//            if(sum == i) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {


//        HashMap<String,String> map = new HashMap<>();
//        map.put("123",null);
//        map.put(null,"123");
//        System.out.println(map.size());

//        int n = 1000;
//        System.out.println(count(n));
//        int i = 5;
//        int s = (i++) + (++i)+ (i--) + (--i);
//        System.out.println(s);
//        int[] g = {1,2};
//        int[] s = {1,2,3};
//        findContentChildren(g,s);

//        int n = 4;
//        int[] arr1 = {0,7,1,6};
//        int[] arr2 = {1,5,0,6};
//        System.out.println(findMinimum(n, arr1, arr2));
        //参数解析
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        s = s.trim() + " ";
//        List<String> list =  paraAna(s);
//        System.out.println(list.size());
//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //计算日期到天数转化
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNextLine()) {
//            int year = sc.nextInt();
//            int month = sc.nextInt();
//            int day = sc.nextInt();
//            System.out.println(iConverDateToDay(year,month,day));
//        }

    }
}
