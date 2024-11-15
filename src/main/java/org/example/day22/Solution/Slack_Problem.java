package org.example.day22.Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.TreeSet;

public class Slack_Problem {
    public static void main(String[] args) {

    }
}

class Solution1 {
    public boolean didDrinkCoffeeAfterMeal(String[] s5) {
        Stack<String> stack = new Stack<>();

        for(String item : s5) {
            stack.push(item);
        }

        //식사 후 커피를 마셨는지 확인
        boolean ateMeal = false;
        while (!stack.isEmpty()) {
            String item = stack.pop();
            if (item.equals("밥")) {
                ateMeal = true;
            } else if (ateMeal && item.equals("커피")){
                return true;
            }
        }
        return false;
    }
}

class Solution2 {
    public void checkMealAndCoffeeCount(String[] s2) {
        HashMap<String, Integer> countMap = new HashMap<>();

        //음식과 커피 횟수 세기
        for (String item : s2) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }

        int riceCount = countMap.getOrDefault("밥", 0);
        int coffeeCount = countMap.getOrDefault("커피", 0);

        if (riceCount > coffeeCount) {
            System.out.println("밥을 더 많이 먹었으면...");
        } else if (coffeeCount > riceCount) {
            System.out.println("커피를 더 많이 마셨으면...");
        }
    }
}

class Solution3 {
    public void removeDuplicatesAndPrintSorted(int[] s3) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int num : s3) {
            treeSet.add(num);
        }

        System.out.println("가장 큰 값: " + treeSet.last());
        System.out.println("가장 작은 값: " + treeSet.first());
    }
}

class Solution4 {
    public void findSecondLargestAndSmallest(int[] s4) {
        Arrays.sort(s4);

        int secondLargest = s4[s4.length - 2];
        int secondSmallest = s4[1];

        System.out.println("두 번째 큰 값: " + secondLargest);
        System.out.println("두 번째 작은 값: " + secondSmallest);
    }
}

class Solution7 {
    public void countCharacterFrequency(String s5) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : s5.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (char key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key) + "번");
        }
    }
}

class Solution8 {
    public void ReverseArray(int[] arr) {
        int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        int[] s6 = new int[s5.length];
        for (int i = s5.length - 1; i >= 0; i++) {
            s6[i] = s5[s5.length - 1 - i];
        }
        System.out.println(Arrays.toString(s6));
    }
}