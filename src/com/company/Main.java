package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
////--------------------------------------------------------
//        List<String> list = new ArrayList<>();
//        list.add("Daa");
//        list.add("ewqe");
//        list.add("qew");
//        list.stream().filter(s -> s.length() <= 2).collect(Collectors.toList());
//        System.out.println(list);
//        System.out.println("-------------------------------------");
//
////--------------------------------------------------------
//
//
//        IntStream.of(120, 410, 85, 32, 314, 12)
//                .filter(x -> x < 300)
//                .map(x -> x + 11)
//                .limit(3)
//                .forEach(System.out::println);
//
//        System.out.println("-------------------------------------");
////--------------------------------------------------------
//        int[] arr = {120, 410, 85, 32, 314, 12};
//        int count = 0;
//        for (int x : arr) {
//            if (x >= 300) continue;
//            x += 11;
//            count++;
//            if (count > 3) break;
//            System.out.print(x);
//
//        }
//        System.out.println();
//        System.out.println("-------------------------------------");
////--------------------------------------------------------
//
//        Stream.concat(
//                        Stream.of(10),
//                        Stream.of(4
//                                ,16
//                                ))
//                .forEach(System.out::println);
//        System.out.println("-------------------------------------");
////--------------------------------------------------------
//
//
//        List<Integer> list1= new ArrayList<>();
//        list1.add(2);
//        list1.add(4);
//        list1.add(9);
//        list1.add(2);
//        System.out.println(list1);
//        System.out.println("-------------------------------------");
////--------------------------------------------------------
//
//        IntStream.range(2, 9)
//                .filter(x -> x %2
//                        == 0)
//                .forEach(System.out::println);
//
//        System.out.println("-------------------------------------");
////--------------------------------------------------------
//
//
//
//        Stream.of("10", "11", "15")
//                        .map(x -> Integer.parseInt(x, 16))
//                        .forEach(System.out::println);
//
//        System.out.println("-------------------------------------");
////--------------------------------------------------------
//
//        Stream.of(1, 2, 3, 4, 5, 6)
//                .flatMap(x -> {
//                    if (x % 2 == 0) {
//                        return Stream.of(-x, x);
//                    }
//                    return Stream.empty();
//                })
//                .forEach(System.out::println);
//
//        System.out.println("-------------------------------------");
////--------------------------------------------------------
//
//
//        Stream.of(120, 410, 85, 32, 314, 12)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
//        System.out.println("-------------------------------------");
////-----------------------
//
//        Stream.of(0, 3, 0, 0, 5)
//                .peek(x -> System.out.format("before distinct: %d%n", x))
//                .distinct()
//                .peek(x -> System.out.format("after distinct: %d%n", x))
//                .map(x -> x * x)
//                .forEach(x -> System.out.format("after map: %d%n", x));
//
//        System.out.println("-------------------------------------");
////-----------------------
//        Stream.of(1, 2, 3, 4, 2, 5)
//                .dropWhile(x -> x >= 3)
//                .forEach(System.out::println);
//        System.out.println("-------------------------------------");
////-----------------------
//
//        DoubleStream.of(0.1, Math.PI)
//                .boxed()
//                .map(Object::getClass)
//                .forEach(System.out::println);
//        System.out.println("-------------------------------------");
////-----------------------
//        IntStream.range(0, 100000)
//                .parallel()
//                .filter(x -> x % 10000 == 0)
//                .map(x -> x / 10000)
//                .forEach(System.out::println);
//
//        System.out.println("-------------------------------------");
////-----------------------
//        long coun = IntStream.range(0, 10)
//                .flatMap(x -> IntStream.range(0, x))
//                .count();
//        System.out.println(coun);
//
//        System.out.println("-------------------------------------");
//////-----------------------
//        Optional<Integer> sum = Stream.of(1, 2, 3, 4, 5)
//                .reduce((acc, x) -> acc + x);
//        System.out.println(sum);
//
//        String text = "Егор Алла Анна";
//        Pattern pattern = Pattern.compile("А.+?а");
//
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            int start=matcher.start();
//            int end=matcher.end();
//            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
//        }
//        System.out.println(matcher.replaceFirst("Ира"));
//        System.out.println(matcher.replaceAll("Ольга"));
//        System.out.println(text);11

//--------------------------------------------------------------------

//
//        String text = "Егор Алла Александр";
//        Pattern pattern = Pattern.compile("А.+а");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.println(text.substring(matcher.start(), matcher.end())); // NPM
//        }
//
//        String s="The root directory is \u00A7Windows";
//        System.out.println(s);// NPM
//
//



    }
}
