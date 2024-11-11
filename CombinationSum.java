/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bse045;
import java.util.ArrayList;
import java.util.List;
/* @author 2023F-BSE-045 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7};
        int key = 7;
        List<List<Integer>> result = combinationSum(array,key);
        
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }}
    public static List<List<Integer>> combinationSum(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(array, target, 0, new ArrayList<>(), result);
        return result;
    }
    public static void findCombinations(int[] array, int key, int start, List<Integer> current, List<List<Integer>> result) {
        if (key == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < array.length; i++) {
            if (array[i] <=key) {
                current.add(array[i]);
                findCombinations(array, key - array[i], i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}

          
          
    